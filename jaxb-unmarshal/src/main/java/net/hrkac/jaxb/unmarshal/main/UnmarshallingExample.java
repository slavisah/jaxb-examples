package net.hrkac.jaxb.unmarshal.main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import net.hrkac.jaxb.unmarshal.model.Museums;

public class UnmarshallingExample {

	public static void main(String[] args) {
		File file = new File("files/museums.xml");
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Museums.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Museums museums = (Museums)unmarshaller.unmarshal(file);
			System.out.println(museums);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		

	}

}
