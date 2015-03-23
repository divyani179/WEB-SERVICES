
package com.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.endpoint package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DollarToRupee_QNAME = new QName("http://endpoint.com/", "dollarToRupee");
    private final static QName _DollarToRupeeResponse_QNAME = new QName("http://endpoint.com/", "dollarToRupeeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.endpoint
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DollarToRupee }
     * 
     */
    public DollarToRupee createDollarToRupee() {
        return new DollarToRupee();
    }

    /**
     * Create an instance of {@link DollarToRupeeResponse }
     * 
     */
    public DollarToRupeeResponse createDollarToRupeeResponse() {
        return new DollarToRupeeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DollarToRupee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.com/", name = "dollarToRupee")
    public JAXBElement<DollarToRupee> createDollarToRupee(DollarToRupee value) {
        return new JAXBElement<DollarToRupee>(_DollarToRupee_QNAME, DollarToRupee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DollarToRupeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.com/", name = "dollarToRupeeResponse")
    public JAXBElement<DollarToRupeeResponse> createDollarToRupeeResponse(DollarToRupeeResponse value) {
        return new JAXBElement<DollarToRupeeResponse>(_DollarToRupeeResponse_QNAME, DollarToRupeeResponse.class, null, value);
    }

}
