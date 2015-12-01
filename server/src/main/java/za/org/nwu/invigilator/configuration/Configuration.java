package za.org.nwu.invigilator.configuration;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "configuration")
public class Configuration {

    private int maxStudentsPerInvigilator;
}
