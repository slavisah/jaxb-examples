package net.hrkac.jaxb.marshal.adapter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * This class adapts the Date objects by implementing the XmlAdapter interface in order that
 * JaxB is capable of marshal and unmarshal them
 */
public class DateAdapter extends XmlAdapter<String, Date> {

    public Date unmarshal(String v) throws Exception {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(v);
        return date;
    }

    public String marshal(Date v) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String reportDate = df.format(v);
        return reportDate;
    }

}
