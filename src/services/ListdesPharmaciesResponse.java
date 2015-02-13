
package services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListdesPharmaciesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListdesPharmaciesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListeDesPharmacies" type="{http://services/}pharmacie" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListdesPharmaciesResponse", propOrder = {
    "listeDesPharmacies"
})
public class ListdesPharmaciesResponse {

    @XmlElement(name = "ListeDesPharmacies")
    protected List<Pharmacie> listeDesPharmacies;

    /**
     * Gets the value of the listeDesPharmacies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listeDesPharmacies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListeDesPharmacies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pharmacie }
     * 
     * 
     */
    public List<Pharmacie> getListeDesPharmacies() {
        if (listeDesPharmacies == null) {
            listeDesPharmacies = new ArrayList<Pharmacie>();
        }
        return this.listeDesPharmacies;
    }

}
