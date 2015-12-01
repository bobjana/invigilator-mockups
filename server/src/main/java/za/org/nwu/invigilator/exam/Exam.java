package za.org.nwu.invigilator.exam;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Set;

@Data
@Document(collection = "exams")
public class Exam {

    private String name;
    private int maxStudentsPerInvigilator;
    private LocalDate createdDate;
    private boolean locked;
    private Set<ExamSession> sessions;
}
