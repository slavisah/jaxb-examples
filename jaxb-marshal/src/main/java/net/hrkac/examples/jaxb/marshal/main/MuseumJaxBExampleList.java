package net.hrkac.examples.jaxb.marshal.main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import net.hrkac.examples.jaxb.marshal.model.Museum;
import net.hrkac.examples.jaxb.marshal.model.Museums;

/**
 * Simple example of usage of jaxb marshaling functionalities showing how to
 * manage lists
 */
public class MuseumJaxBExampleList {

    public static void main(String[] args) {
        try {

            /* init a list with a couple of museums to marshal */
            Museum simpleMuseum = new Museum();
            simpleMuseum.setName("Simple Museum");
            simpleMuseum.setCity("Oviedo, Spain");

            Museum anotherSimpleMuseum = new Museum();
            anotherSimpleMuseum.setName("Another Simple Museum");
            anotherSimpleMuseum.setCity("Gijon, Spain");

            Museums listOfMuseums = new Museums();
            listOfMuseums.add(simpleMuseum);
            listOfMuseums.add(anotherSimpleMuseum);

            /* init jaxb marshaler */
            JAXBContext jaxbContext = JAXBContext.newInstance(Museums.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            /* set this flag to true to format the output */
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            /*
             * marshaling of java objects in xml (output to file and standard
             * output)
             */
            jaxbMarshaller.marshal(listOfMuseums, new File("files/list.xml"));
            jaxbMarshaller.marshal(listOfMuseums, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
