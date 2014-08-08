package net.hrkac.examples.jaxb.dozer.spring.configuration;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "net.hrkac.examples.jaxb.dozer.main")
public class SpringConfiguration {
	
	@Bean
	public Mapper getDozerMapper() {
		DozerBeanMapper mapper = new DozerBeanMapper();
		List<String> mappingFileUrls = new ArrayList<String>();
		mappingFileUrls.add("dozerBeanMapping.xml");
		mapper.setMappingFiles(mappingFileUrls);
		return mapper;
	}
}
