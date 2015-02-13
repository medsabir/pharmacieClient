
package services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListdesPharmaciesenGardeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListdesPharmaciesenGardeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListeDesPharmaciesEnGarde" type="{http://services/}pharmacie" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListdesPharmaciesenGardeResponse", propOrder = {
    "listeDesPharmaciesEnGarde"
})
public class ListdesPharmaciesenGardeResponse {

    @XmlElement(name = "ListeDesPharmaciesEnGarde")
    protected List<Pharmacie> listeDesPharmaciesEnGarde;

    /**
     * Gets the value of the listeDesPharmaciesEnGarde property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listeDesPharmaciesEnGarde property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListeDesPharmaciesEnGarde().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pharmacie }
     * 
     * 
     */
    public List<Pharmacie> getListeDesPharmaciesEnGarde() {
        if (listeDesPharmaciesEnGarde == null) {
            listeDesPharmaciesEnGarde = new ArrayList<Pharmacie>();
        }
        return this.listeDesPharmaciesEnGarde;
    }

}
