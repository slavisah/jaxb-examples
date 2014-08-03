package net.hrkac.jaxb.marshal.main;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import net.hrkac.jaxb.marshal.model.Exhibition;
import net.hrkac.jaxb.marshal.model.Museum;
import net.hrkac.jaxb.marshal.model.Museums;

/**
 * This class contains a main method that shows how to use the JAXB marshaling
 * functionalities. The example writes a list of museums, containing name, city
 * and exhibitions in an xml file using jaxb
 */
public class MuseumJaxBExampleComplete {

    public static void main(String[] args) {
        try {

            /* init data to marshal */
            Museum reinaSofia = new Museum();
            reinaSofia.setName("Reina Sofia Museum");
            reinaSofia.setCity("Madrid");
            Exhibition permanent = new Exhibition();
            permanent.setName("Permanent Exhibition - Reina Sofia Museum");
            permanent.setFrom(new SimpleDateFormat("yyyy-MM-dd").parse("1900-01-01"));
            permanent.setTo(new SimpleDateFormat("yyyy-MM-dd").parse("2014-12-31"));
            List<String> artistsReinaSofia = new ArrayList<String>();
            artistsReinaSofia.add("Picasso");
            artistsReinaSofia.add("Dali");
            artistsReinaSofia.add("Miro");
            permanent.setArtists(artistsReinaSofia);
            reinaSofia.setPermanent(permanent);

            Museum prado = new Museum();
            prado.setName("Prado Museum");
            prado.setCity("Madrid");
            Exhibition permanentPrado = new Exhibition();
            permanentPrado.setName("Permanent Exhibition - Prado Museum");
            permanentPrado.setFrom(new SimpleDateFormat("yyyy-MM-dd").parse("1500-01-01"));
            permanentPrado.setTo(new SimpleDateFormat("yyyy-MM-dd").parse("2000-12-31"));
            List<String> artistsPrado = new ArrayList<String>();
            artistsPrado.add("Velazquez");
            artistsPrado.add("Goya");
            artistsPrado.add("Zurbaran");
            artistsPrado.add("Tiziano");
            permanentPrado.setArtists(artistsPrado);
            prado.setPermanent(permanentPrado);

            Exhibition special = new Exhibition();
            special.setName("Game of Bowls (1908), by Henri Matisse");
            special.setFrom(new SimpleDateFormat("yyyy-MM-dd").parse("1908-01-01"));
            special.setTo(new SimpleDateFormat("yyyy-MM-dd").parse("1908-12-31"));
            List<String> artistsSpecial = new ArrayList<String>();
            artistsSpecial.add("Mattise");
            special.setArtists(artistsSpecial);
            prado.setSpecial(special);

            Museums museums = new Museums();
            museums.add(prado);
            museums.add(reinaSofia);

            /* init jaxb marshaler */
            JAXBContext jaxbContext = JAXBContext.newInstance(Museums.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            /* set this flag to true to format the output */
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            /*
             * marshaling of java objects in xml (output to file and standard
             * output)
             */
            jaxbMarshaller.marshal(museums, new File("files/complete-museums.xml"));
            jaxbMarshaller.marshal(museums, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
