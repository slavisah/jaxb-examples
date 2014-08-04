package net.hrkac.jaxb.unmarshal.main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import net.hrkac.jaxb.unmarshal.model.MuseumsType;

public class UnmarshallingExample {

	public static void main(String[] args) {
		File file = new File("files/museums.xml");
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(MuseumsType.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			MuseumsType museums = (MuseumsType)unmarshaller.unmarshal(file);
			System.out.println(museums);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		

	}

}
