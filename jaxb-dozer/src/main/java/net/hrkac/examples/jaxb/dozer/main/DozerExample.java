package net.hrkac.examples.jaxb.dozer.main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import net.hrkac.examples.jaxb.dozer.domain.Person;
import net.hrkac.examples.jaxb.dozer.generated.PersonType;

public class DozerExample {

	public static void main(String[] args) {
		File file = new File("files/person.xml");
		try {
			// JAXB unmarshalling
			JAXBContext jaxbContext = JAXBContext.newInstance(PersonType.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			PersonType personType = (PersonType)unmarshaller.unmarshal(file);
			
			// Dozer
			Mapper mapper = new DozerBeanMapper();
			Person person = mapper.map(personType, Person.class);
			
			System.out.println(person);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
