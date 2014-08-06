package net.hrkac.examples.jaxb.marshal.generator;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

import net.hrkac.examples.jaxb.marshal.model.Exhibition;
import net.hrkac.examples.jaxb.marshal.model.Museum;
import net.hrkac.examples.jaxb.marshal.model.Museums;

public class SchemaGenerator {

    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(Museum.class, Exhibition.class, Museums.class);
            context.generateSchema(new MySchemaOutputResolver());
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

class MySchemaOutputResolver extends SchemaOutputResolver {

    public Result createOutput(String namespaceURI, String suggestedFileName) throws IOException {
        // suggestedFileName is "schema1.xsd" by default (output is saved in project root)
        File file = new File(suggestedFileName);
        StreamResult result = new StreamResult(file);
        result.setSystemId(file.toURI().toURL().toString());
        return result;
    }

}