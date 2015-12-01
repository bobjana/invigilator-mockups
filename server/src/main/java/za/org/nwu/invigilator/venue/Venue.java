package za.org.nwu.invigilator.venue;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "venues")
public class Venue {

    private String name;
    private boolean stairs;
}
