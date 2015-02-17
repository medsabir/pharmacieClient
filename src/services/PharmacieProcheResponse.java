
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PharmacieProcheResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PharmacieProcheResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListeDesPharmaciesProche" type="{http://services/}pharmacie" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PharmacieProcheResponse", propOrder = {
    "listeDesPharmaciesProche"
})
public class PharmacieProcheResponse {

    @XmlElement(name = "ListeDesPharmaciesProche")
    protected Pharmacie listeDesPharmaciesProche;

    /**
     * Gets the value of the listeDesPharmaciesProche property.
     * 
     * @return
     *     possible object is
     *     {@link Pharmacie }
     *     
     */
    public Pharmacie getListeDesPharmaciesProche() {
        return listeDesPharmaciesProche;
    }

    /**
     * Sets the value of the listeDesPharmaciesProche property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pharmacie }
     *     
     */
    public void setListeDesPharmaciesProche(Pharmacie value) {
        this.listeDesPharmaciesProche = value;
    }

}
