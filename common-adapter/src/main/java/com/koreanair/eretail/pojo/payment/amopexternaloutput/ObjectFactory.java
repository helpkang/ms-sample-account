
package com.koreanair.eretail.pojo.payment.amopexternaloutput;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.koreanair.eretail.pojo.payment.amopexternaloutput package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.koreanair.eretail.pojo.payment.amopexternaloutput
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HTTPType }
     * 
     */
    public HTTPType createHTTPType() {
        return new HTTPType();
    }

    /**
     * Create an instance of {@link HTTPType.PARAMETERS }
     * 
     */
    public HTTPType.PARAMETERS createHTTPTypePARAMETERS() {
        return new HTTPType.PARAMETERS();
    }

    /**
     * Create an instance of {@link AMOPExternalOutputType }
     * 
     */
    public AMOPExternalOutputType createAMOPExternalOutputType() {
        return new AMOPExternalOutputType();
    }

    /**
     * Create an instance of {@link HTTPType.PARAMETERS.PARAMETER }
     * 
     */
    public HTTPType.PARAMETERS.PARAMETER createHTTPTypePARAMETERSPARAMETER() {
        return new HTTPType.PARAMETERS.PARAMETER();
    }

}
