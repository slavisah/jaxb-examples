package net.hrkac.examples.jaxb.marshal.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "MuseumType", propOrder = { "name", "city", "permanent", "special" })
public class Museum {

    private String name;
    private Boolean childrenAllowed;
    private Exhibition special;
    private Exhibition permanent;
    private String city;

    public String getName() {
        return name;
    }

    @XmlElement(name = "MuseumName")
    public void setName(String name) {
        this.name = name;
    }

    public Boolean getChildrenAllowed() {
        return childrenAllowed;
    }

    @XmlAttribute(name = "childrenAllowed")
    public void setChildrenAllowed(Boolean childrenAllowed) {
        this.childrenAllowed = childrenAllowed;
    }

    public Exhibition getSpecial() {
        return special;
    }

    @XmlElement(name = "SpecialExhibition")
    public void setSpecial(Exhibition special) {
        this.special = special;
    }

    public Exhibition getPermanent() {
        return permanent;
    }

    @XmlElement(name = "PermanentExhibition")
    public void setPermanent(Exhibition permanent) {
        this.permanent = permanent;
    }

    public String getCity() {
        return city;
    }

    @XmlElement(name = "City")
    public void setCity(String city) {
        this.city = city;
    }

}
