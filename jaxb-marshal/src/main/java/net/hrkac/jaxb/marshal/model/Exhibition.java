package net.hrkac.jaxb.marshal.model;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import net.hrkac.jaxb.marshal.adapter.DateAdapter;

/**
 * Exhibition containing a name, a date range and a list of artists the xml
 * order is configured using the XmlType annotation, the node name is defined in
 * the name attribute of the XmlRootElement or XmlElement
 * 
 */
// field name and not xml element name
@XmlType(name = "ExhibitionType", propOrder = { "name", "artists", "from", "to" })
@XmlRootElement(name = "Exhibition")
public class Exhibition {

    private String name;

    private Date from;

    private Date to;

    List<String> artists;

    public String getName() {
        return name;
    }

    // name to be used in the xml
    @XmlElement(name = "Name")
    public void setName(String name) {
        this.name = name;
    }

    public Date getFrom() {
        return from;
    }

    /*
     * indicates JaxB what adapter it should use to manage this field
     */
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlElement(name = "From")
    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    /*
     * indicates JaxB what adapter it should use to manage this field
     */
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlElement(name = "To")
    public void setTo(Date to) {
        this.to = to;
    }

    public List<String> getArtists() {
        return artists;
    }

    @XmlElement(name = "Artist")
    public void setArtists(List<String> artists) {
        this.artists = artists;
    }
}
