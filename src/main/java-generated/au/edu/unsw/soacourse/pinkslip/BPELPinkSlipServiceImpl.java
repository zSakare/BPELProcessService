package au.edu.unsw.soacourse.pinkslip;

import java.io.InputStream;
import java.util.Calendar;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class BPELPinkSlipServiceImpl implements BPELPinkSlipService {

  ObjectFactory objFactory = new ObjectFactory();
  DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
  
  @Override
  public VehicleAgeResponse vehicleAge(VehicleAgeRequest parameters)
      throws VehicleAgeFaultMsg {
    /*  Get parameters */
    String fname = parameters.getFirstName();
    String lname = parameters.getLastName();
    String rnum = parameters.getRegoNumber();
    
    /* Get pink slip db */
    ClassLoader cl = this.getClass().getClassLoader();
    InputStream is = cl.getResourceAsStream("PinkSlip_Database.xml");
    
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
            VehicleAgeResponse res = objFactory.createVehicleAgeResponse();
            
            int age = Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(getField(e, "ManufacturedYear"));
            res.setAge(Integer.toString(age));
            
            return res;
          }
        }
        
      }
    } catch (Exception e) {
      String msg = "General PinkSlipService Error";
      String code = "GEN_ERR";

      ServiceFaultType fault = objFactory.createServiceFaultType();
      fault.setErrcode(code);
      fault.setErrtext(msg);
      
      e.printStackTrace();
      throw new VehicleAgeFaultMsg(msg,fault);
    }

    /* Only get here if a non matching driver has not been found */

    String msg = "Cannot find given driver";
    String code = "ID_ERR";

    ServiceFaultType fault = objFactory.createServiceFaultType();
    fault.setErrcode(code);
    fault.setErrtext(msg);
    
    throw new VehicleAgeFaultMsg(msg,fault);
  }

  @Override
  public PSCheckResponse psCheck(PSCheckRequest parameters)
      throws PSCheckFaultMsg {
    /*  Get parameters */
    String fname = parameters.getFirstName();
    String lname = parameters.getLastName();
    String rnum = parameters.getRegoNumber();
    
    /* Get pink slip db */
    ClassLoader cl = this.getClass().getClassLoader();
    InputStream is = cl.getResourceAsStream("PinkSlip_Database.xml");
    
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
            PSCheckResponse res = objFactory.createPSCheckResponse();
            
            res.setFirstName(fname);
            res.setLastName(lname);
            res.setCheckedFlag(getField(e, "SafetyCheckUpToDate"));
            res.setRegoNumber(rnum);
            
            return res;
          }
        }
        
      }
    } catch (Exception e) {
      String msg = "General PinkSlipService Error";
      String code = "GEN_ERR";

      ServiceFaultType fault = objFactory.createServiceFaultType();
      fault.setErrcode(code);
      fault.setErrtext(msg);
      
      e.printStackTrace();
      throw new PSCheckFaultMsg(msg,fault);
    }

    /* Only get here if a non matching driver has not been found */

    String msg = "Cannot find given driver";
    String code = "ID_ERR";

    ServiceFaultType fault = objFactory.createServiceFaultType();
    fault.setErrcode(code);
    fault.setErrtext(msg);
    
    throw new PSCheckFaultMsg(msg,fault);
  }
  
  /* Helper function to find fields */
  private String getField(Element e, String f) throws NullPointerException {
    return e.getElementsByTagName(f).item(0).getTextContent();
  }

}
