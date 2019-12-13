//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.13 at 03:38:42 PM SAMT 
//


package ivan.vatlin.soap.cars;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_ivan_vatlin.cars package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.www_ivan_vatlin.cars
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CarDetailsResponse }
     * 
     */
    public CarDetailsResponse createCarDetailsResponse() {
        return new CarDetailsResponse();
    }

    /**
     * Create an instance of {@link Car }
     * 
     */
    public Car createCar() {
        return new Car();
    }

    /**
     * Create an instance of {@link Search }
     * 
     */
    public Search createSearch() {
        return new Search();
    }

    /**
     * Create an instance of {@link CarCreateRequest }
     * 
     */
    public CarCreateRequest createCarCreateRequest() {
        return new CarCreateRequest();
    }

    /**
     * Create an instance of {@link CarCreateResponse }
     * 
     */
    public CarCreateResponse createCarCreateResponse() {
        return new CarCreateResponse();
    }

    /**
     * Create an instance of {@link CarDetailsRequest }
     * 
     */
    public CarDetailsRequest createCarDetailsRequest() {
        return new CarDetailsRequest();
    }

    /**
     * Create an instance of {@link CarSpecification }
     * 
     */
    public CarSpecification createCarSpecification() {
        return new CarSpecification();
    }

}
