package za.org.nwu.invigilator.exam;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "exam_papers")
public class ExamPaper {

    private String module;
    private int numberOfStudents;
}
