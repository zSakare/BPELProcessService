package au.edu.unsw.soacourse.greenslip;

import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class BPELGreenSlipServiceImpl implements BPELGreenSlipService {

  ObjectFactory objFactory = new ObjectFactory();
  DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
  
  @Override
  public GSCheckResponse gsCheck(GSCheckRequest parameters)
      throws GSCheckFaultMsg {
    /*  Get parameters */
    String fname = parameters.getFirstName();
    String lname = parameters.getLastName();
    String rnum = parameters.getRegoNumber();
    
    /* Get green slip db */
    ClassLoader cl = this.getClass().getClassLoader();
    InputStream is = cl.getResourceAsStream("GreenSlip_Database.xml");
    
    /* Parse XML */
    try {
      DocumentBuilder builder = docFactory.newDocumentBuilder();
      Document doc = builder.parse(is);
      Element element = doc.getDocumentElement();
      NodeList nodes = element.getElementsByTagName("Entry");

      /* For each Entry */
      for (int i = 0; i < nodes.getLength(); i++) {
        Node n = nodes.item(i);
        
        if (n.getNodeType() == Node.ELEMENT_NODE) {
          Element e = (Element) n;
          
          /* Check if found driver */ 
          if(getField(e, "LastName").equals(lname) &&
             getField(e, "FirstName").equals(fname) &&
             getField(e, "RegistrationNumber").equals(rnum)){
            
            /* If found return */
            GSCheckResponse res = objFactory.createGSCheckResponse();
            
            res.setFirstName(fname);
            res.setLastName(lname);
            res.setPaidFlag(getField(e, "CurrentlyValid"));
            res.setRegoNumber(rnum);
            
            return res;
          }
        }
        
      }
    } catch (Exception e) {
      String msg = "General GreenSlipService Error";
      String code = "GEN_ERR";

      ServiceFaultType fault = objFactory.createServiceFaultType();
      fault.setErrcode(code);
      fault.setErrtext(msg);
      
      e.printStackTrace();
      throw new GSCheckFaultMsg(msg,fault);
    }

    /* Only get here if a non matching driver has not been found */

    String msg = "Cannot find given driver";
    String code = "ID_ERR";

    ServiceFaultType fault = objFactory.createServiceFaultType();
    fault.setErrcode(code);
    fault.setErrtext(msg);
    
    throw new GSCheckFaultMsg(msg,fault);
  }
  
  /* Helper function to find fields */
  private String getField(Element e, String f) throws NullPointerException {
    return e.getElementsByTagName(f).item(0).getTextContent();
  }

}
