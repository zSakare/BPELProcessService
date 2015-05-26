
package au.edu.unsw.soacourse.pinkslip;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RegoNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CheckedFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lastName",
    "firstName",
    "regoNumber",
    "checkedFlag"
})
@XmlRootElement(name = "PSCheckResponse")
public class PSCheckResponse {

    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "RegoNumber", required = true)
    protected String regoNumber;
    @XmlElement(name = "CheckedFlag", required = true)
    protected String checkedFlag;

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the regoNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegoNumber() {
        return regoNumber;
    }

    /**
     * Sets the value of the regoNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegoNumber(String value) {
        this.regoNumber = value;
    }

    /**
     * Gets the value of the checkedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckedFlag() {
        return checkedFlag;
    }

    /**
     * Sets the value of the checkedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckedFlag(String value) {
        this.checkedFlag = value;
    }

}
