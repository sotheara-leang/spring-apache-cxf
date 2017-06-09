
package com.example.springcxf.client.endpoint.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createUser"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="createUserDTO" type="{http://endpoint.server.springcxf.example.com/}createUserDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createUser", propOrder = {
    "createUserDTO"
})
public class CreateUser {

    protected CreateUserDTO createUserDTO;

    /**
     * Gets the value of the createUserDTO property.
     * 
     * @return
     *     possible object is
     *     {@link CreateUserDTO }
     *     
     */
    public CreateUserDTO getCreateUserDTO() {
        return createUserDTO;
    }

    /**
     * Sets the value of the createUserDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateUserDTO }
     *     
     */
    public void setCreateUserDTO(CreateUserDTO value) {
        this.createUserDTO = value;
    }

}
