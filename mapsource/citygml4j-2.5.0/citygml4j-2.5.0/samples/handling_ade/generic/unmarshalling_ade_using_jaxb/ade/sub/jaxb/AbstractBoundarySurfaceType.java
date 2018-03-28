
package handling_ade.generic.unmarshalling_ade_using_jaxb.ade.sub.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.citygml._1.AbstractCityObjectType;
import net.opengis.gml.MultiSurfacePropertyType;


/**
 * A BoundarySurface (German translation is 'Begrenzungsfl�che') is a thematic object which classifies surfaces bounding a building or a room. The
 * 				geometry of a BoundarySurface is given by MultiSurfaces. As it is a subclass of _CityObject, it inherits all atributes and relations, in particular the external
 * 				references, the generic attributes, and the generalization relations. 
 * 
 * <p>Java-Klasse f�r AbstractBoundarySurfaceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractBoundarySurfaceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/citygml/1.0}AbstractCityObjectType">
 *       &lt;sequence>
 *         &lt;element name="lod2MultiSurface" type="{http://www.opengis.net/gml}MultiSurfacePropertyType" minOccurs="0"/>
 *         &lt;element name="lod3MultiSurface" type="{http://www.opengis.net/gml}MultiSurfacePropertyType" minOccurs="0"/>
 *         &lt;element name="lod4MultiSurface" type="{http://www.opengis.net/gml}MultiSurfacePropertyType" minOccurs="0"/>
 *         &lt;element name="opening" type="{http://www.citygml.org/ade/sub/0.9.0}OpeningPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.citygml.org/ade/sub/0.9.0}_GenericApplicationPropertyOfBoundarySurface" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractBoundarySurfaceType", propOrder = {
    "lod2MultiSurface",
    "lod3MultiSurface",
    "lod4MultiSurface",
    "opening",
    "_GenericApplicationPropertyOfBoundarySurface"
})
@XmlSeeAlso({
    InteriorWallSurfaceType.class,
    RoofSurfaceType.class,
    ClosureSurfaceType.class,
    WallSurfaceType.class,
    FloorSurfaceType.class,
    CeilingSurfaceType.class,
    GroundSurfaceType.class
})
public abstract class AbstractBoundarySurfaceType
    extends AbstractCityObjectType
{

    protected MultiSurfacePropertyType lod2MultiSurface;
    protected MultiSurfacePropertyType lod3MultiSurface;
    protected MultiSurfacePropertyType lod4MultiSurface;
    protected List<OpeningPropertyType> opening;
    protected List<Object> _GenericApplicationPropertyOfBoundarySurface;

    /**
     * Ruft den Wert der lod2MultiSurface-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public MultiSurfacePropertyType getLod2MultiSurface() {
        return lod2MultiSurface;
    }

    /**
     * Legt den Wert der lod2MultiSurface-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public void setLod2MultiSurface(MultiSurfacePropertyType value) {
        this.lod2MultiSurface = value;
    }

    public boolean isSetLod2MultiSurface() {
        return (this.lod2MultiSurface!= null);
    }

    /**
     * Ruft den Wert der lod3MultiSurface-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public MultiSurfacePropertyType getLod3MultiSurface() {
        return lod3MultiSurface;
    }

    /**
     * Legt den Wert der lod3MultiSurface-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public void setLod3MultiSurface(MultiSurfacePropertyType value) {
        this.lod3MultiSurface = value;
    }

    public boolean isSetLod3MultiSurface() {
        return (this.lod3MultiSurface!= null);
    }

    /**
     * Ruft den Wert der lod4MultiSurface-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public MultiSurfacePropertyType getLod4MultiSurface() {
        return lod4MultiSurface;
    }

    /**
     * Legt den Wert der lod4MultiSurface-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public void setLod4MultiSurface(MultiSurfacePropertyType value) {
        this.lod4MultiSurface = value;
    }

    public boolean isSetLod4MultiSurface() {
        return (this.lod4MultiSurface!= null);
    }

    /**
     * Gets the value of the opening property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opening property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpening().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpeningPropertyType }
     * 
     * 
     */
    public List<OpeningPropertyType> getOpening() {
        if (opening == null) {
            opening = new ArrayList<OpeningPropertyType>();
        }
        return this.opening;
    }

    public boolean isSetOpening() {
        return ((this.opening!= null)&&(!this.opening.isEmpty()));
    }

    public void unsetOpening() {
        this.opening = null;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBoundarySurface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBoundarySurface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get_GenericApplicationPropertyOfBoundarySurface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> get_GenericApplicationPropertyOfBoundarySurface() {
        if (_GenericApplicationPropertyOfBoundarySurface == null) {
            _GenericApplicationPropertyOfBoundarySurface = new ArrayList<Object>();
        }
        return this._GenericApplicationPropertyOfBoundarySurface;
    }

    public boolean isSet_GenericApplicationPropertyOfBoundarySurface() {
        return ((this._GenericApplicationPropertyOfBoundarySurface!= null)&&(!this._GenericApplicationPropertyOfBoundarySurface.isEmpty()));
    }

    public void unset_GenericApplicationPropertyOfBoundarySurface() {
        this._GenericApplicationPropertyOfBoundarySurface = null;
    }

}
