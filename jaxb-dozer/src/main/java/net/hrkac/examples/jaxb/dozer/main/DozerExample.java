package net.hrkac.examples.jaxb.dozer.main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import net.hrkac.examples.jaxb.dozer.domain.Person;
import net.hrkac.examples.jaxb.dozer.generated.PersonMessage;
import net.hrkac.examples.jaxb.dozer.spring.configuration.SpringConfiguration;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DozerExample {

	@Autowired
	private Mapper dozerMapper;
	
	public static void main(String[] args) {
		try {
			// Spring (just in case)
			ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
			// main 
			DozerExample main = context.getBean(DozerExample.class);
			main.start(args);
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	private void start(String[] args) throws JAXBException {
		File file = new File("files/person.xml");
		
		// JAXB unmarshalling
		JAXBContext jaxbContext = JAXBContext.newInstance(PersonMessage.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		PersonMessage personMessage = (PersonMessage) unmarshaller.unmarshal(file);

		// Dozer
		Person person = dozerMapper.map(personMessage, Person.class);

		System.out.println(person);
    }

}
