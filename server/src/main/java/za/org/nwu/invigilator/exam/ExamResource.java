package za.org.nwu.invigilator.exam;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ExamResource {

    private String name;
    private String createdDate;
    private String status;

}
