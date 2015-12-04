package za.org.nwu.invigilator.system;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "configuration")
public class System {

    private int maxStudentsPerInvigilator;
}
