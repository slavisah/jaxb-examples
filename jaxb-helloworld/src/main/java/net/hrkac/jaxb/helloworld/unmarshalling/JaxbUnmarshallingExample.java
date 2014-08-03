package net.hrkac.jaxb.helloworld.unmarshalling;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import net.hrkac.jaxb.helloworld.model.Student;

public class JaxbUnmarshallingExample {
    
    private static final String XML_FILE_PATH = "files/Student.xml";

    public static void main(String[] args) {
        
        try {
            File xmlFile = new File(XML_FILE_PATH);
            JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
            
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Student student = (Student)jaxbUnmarshaller.unmarshal(xmlFile);
            
            System.out.println(student);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}
