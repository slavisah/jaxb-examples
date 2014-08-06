package net.hrkac.examples.jaxb.marshal.adapter;

import java.text.SimpleDateFormat;
import java.util.Date;

import junit.framework.TestCase;
import net.hrkac.examples.jaxb.marshal.adapter.DateAdapter;

import org.junit.Test;

public class DateAdapterTest extends TestCase {
    
    DateAdapter dateAdapter;
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        dateAdapter = new DateAdapter();
    }

    @Test
    public void testMarshal() {
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2014-08-02");
            assertEquals("2014-08-02", dateAdapter.marshal(date));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void testUnmarshal() {
        try {
            assertEquals(new SimpleDateFormat("yyyy-MM-dd").parse("2014-08-02"), dateAdapter.unmarshal("2014-08-02"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
