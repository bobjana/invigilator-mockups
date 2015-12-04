package za.org.nwu.invigilator.exam;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ExamCreateRequest {

    private String name;
    private String maxNumberOfStudentsPerInvigilator;
}
