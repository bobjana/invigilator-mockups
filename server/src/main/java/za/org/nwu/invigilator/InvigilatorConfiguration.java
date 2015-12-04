package za.org.nwu.invigilator;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InvigilatorConfiguration {

    @Bean
    public Mapper dozerMapper() {
        DozerBeanMapper mapper = new DozerBeanMapper();
        return mapper;
    }

}

