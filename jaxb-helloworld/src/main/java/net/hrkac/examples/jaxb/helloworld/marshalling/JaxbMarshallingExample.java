package net.hrkac.examples.jaxb.helloworld.marshalling;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import net.hrkac.examples.jaxb.helloworld.model.Student;

public class JaxbMarshallingExample {
    
    private static final String XML_FILE_PATH = "files/Student.xml";

    public static void main(String[] args) {
        Student student = new Student("Ivo", "Ivic", 39, 100);
        
        try {
            File xmlFile = new File(XML_FILE_PATH);
            JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(student, xmlFile);
            
            System.out.println("File was created succesfully");

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}
