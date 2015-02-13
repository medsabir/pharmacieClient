
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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

    private final static QName _ListdesPharmacies_QNAME = new QName("http://services/", "ListdesPharmacies");
    private final static QName _ListdesPharmaciesProche_QNAME = new QName("http://services/", "ListdesPharmaciesProche");
    private final static QName _ListdesPharmaciesenGardeResponse_QNAME = new QName("http://services/", "ListdesPharmaciesenGardeResponse");
    private final static QName _ListdesPharmaciesenGarde_QNAME = new QName("http://services/", "ListdesPharmaciesenGarde");
    private final static QName _Pharmacie_QNAME = new QName("http://services/", "Pharmacie");
    private final static QName _ListdesPharmaciesResponse_QNAME = new QName("http://services/", "ListdesPharmaciesResponse");
    private final static QName _ListdesPharmaciesProcheResponse_QNAME = new QName("http://services/", "ListdesPharmaciesProcheResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListdesPharmaciesProcheResponse }
     * 
     */
    public ListdesPharmaciesProcheResponse createListdesPharmaciesProcheResponse() {
        return new ListdesPharmaciesProcheResponse();
    }

    /**
     * Create an instance of {@link ListdesPharmaciesResponse }
     * 
     */
    public ListdesPharmaciesResponse createListdesPharmaciesResponse() {
        return new ListdesPharmaciesResponse();
    }

    /**
     * Create an instance of {@link Pharmacie }
     * 
     */
    public Pharmacie createPharmacie() {
        return new Pharmacie();
    }

    /**
     * Create an instance of {@link ListdesPharmaciesenGarde }
     * 
     */
    public ListdesPharmaciesenGarde createListdesPharmaciesenGarde() {
        return new ListdesPharmaciesenGarde();
    }

    /**
     * Create an instance of {@link ListdesPharmaciesenGardeResponse }
     * 
     */
    public ListdesPharmaciesenGardeResponse createListdesPharmaciesenGardeResponse() {
        return new ListdesPharmaciesenGardeResponse();
    }

    /**
     * Create an instance of {@link ListdesPharmaciesProche }
     * 
     */
    public ListdesPharmaciesProche createListdesPharmaciesProche() {
        return new ListdesPharmaciesProche();
    }

    /**
     * Create an instance of {@link ListdesPharmacies }
     * 
     */
    public ListdesPharmacies createListdesPharmacies() {
        return new ListdesPharmacies();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListdesPharmacies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ListdesPharmacies")
    public JAXBElement<ListdesPharmacies> createListdesPharmacies(ListdesPharmacies value) {
        return new JAXBElement<ListdesPharmacies>(_ListdesPharmacies_QNAME, ListdesPharmacies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListdesPharmaciesProche }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ListdesPharmaciesProche")
    public JAXBElement<ListdesPharmaciesProche> createListdesPharmaciesProche(ListdesPharmaciesProche value) {
        return new JAXBElement<ListdesPharmaciesProche>(_ListdesPharmaciesProche_QNAME, ListdesPharmaciesProche.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListdesPharmaciesenGardeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ListdesPharmaciesenGardeResponse")
    public JAXBElement<ListdesPharmaciesenGardeResponse> createListdesPharmaciesenGardeResponse(ListdesPharmaciesenGardeResponse value) {
        return new JAXBElement<ListdesPharmaciesenGardeResponse>(_ListdesPharmaciesenGardeResponse_QNAME, ListdesPharmaciesenGardeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListdesPharmaciesenGarde }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ListdesPharmaciesenGarde")
    public JAXBElement<ListdesPharmaciesenGarde> createListdesPharmaciesenGarde(ListdesPharmaciesenGarde value) {
        return new JAXBElement<ListdesPharmaciesenGarde>(_ListdesPharmaciesenGarde_QNAME, ListdesPharmaciesenGarde.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pharmacie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "Pharmacie")
    public JAXBElement<Pharmacie> createPharmacie(Pharmacie value) {
        return new JAXBElement<Pharmacie>(_Pharmacie_QNAME, Pharmacie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListdesPharmaciesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ListdesPharmaciesResponse")
    public JAXBElement<ListdesPharmaciesResponse> createListdesPharmaciesResponse(ListdesPharmaciesResponse value) {
        return new JAXBElement<ListdesPharmaciesResponse>(_ListdesPharmaciesResponse_QNAME, ListdesPharmaciesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListdesPharmaciesProcheResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ListdesPharmaciesProcheResponse")
    public JAXBElement<ListdesPharmaciesProcheResponse> createListdesPharmaciesProcheResponse(ListdesPharmaciesProcheResponse value) {
        return new JAXBElement<ListdesPharmaciesProcheResponse>(_ListdesPharmaciesProcheResponse_QNAME, ListdesPharmaciesProcheResponse.class, null, value);
    }

}
