package net.hrkac.jaxb.marshal.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MUSEUM")
public class Museum {

    private String name;
    private Boolean childrenAllowed;
    private Exhibition special;
    private Exhibition permanent;
    private String city;

    public String getName() {
        return name;
    }

    @XmlElement(name = "MUSEUM_NAME")
    public void setName(String name) {
        this.name = name;
    }

    public Boolean getChildrenAllowed() {
        return childrenAllowed;
    }

    @XmlAttribute(name = "children_allowed")
    public void setChildrenAllowed(Boolean childrenAllowed) {
        this.childrenAllowed = childrenAllowed;
    }

    public Exhibition getSpecial() {
        return special;
    }

    @XmlElement(name = "SPECIAL_EXHIBITION")
    public void setSpecial(Exhibition special) {
        this.special = special;
    }

    public Exhibition getPermanent() {
        return permanent;
    }

    @XmlElement(name = "PERMANENT_EXHIBITION")
    public void setPermanent(Exhibition permanent) {
        this.permanent = permanent;
    }

    public String getCity() {
        return city;
    }

    @XmlElement(name = "CITY")
    public void setCity(String city) {
        this.city = city;
    }

}
