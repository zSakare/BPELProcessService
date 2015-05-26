package au.edu.unsw.soacourse.pinkslip;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.4
 * 2015-05-27T02:22:00.957+10:00
 * Generated source version: 3.0.4
 * 
 */
@WebService(targetNamespace = "http://pinkslip.soacourse.unsw.edu.au", name = "BPELPinkSlipService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface BPELPinkSlipService {

    @WebResult(name = "VehicleAgeResponse", targetNamespace = "http://pinkslip.soacourse.unsw.edu.au", partName = "parameters")
    @WebMethod(operationName = "VehicleAge", action = "http://pinkslip.soacourse.unsw.edu.au/VehicleAge")
    public VehicleAgeResponse vehicleAge(
        @WebParam(partName = "parameters", name = "VehicleAgeRequest", targetNamespace = "http://pinkslip.soacourse.unsw.edu.au")
        VehicleAgeRequest parameters
    ) throws VehicleAgeFaultMsg;

    @WebResult(name = "PSCheckResponse", targetNamespace = "http://pinkslip.soacourse.unsw.edu.au", partName = "parameters")
    @WebMethod(operationName = "PSCheck", action = "http://pinkslip.soacourse.unsw.edu.au/PSCheck")
    public PSCheckResponse psCheck(
        @WebParam(partName = "parameters", name = "PSCheckRequest", targetNamespace = "http://pinkslip.soacourse.unsw.edu.au")
        PSCheckRequest parameters
    ) throws PSCheckFaultMsg;
}