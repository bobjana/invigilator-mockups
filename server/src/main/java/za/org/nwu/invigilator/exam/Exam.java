package za.org.nwu.invigilator.exam;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Set;

@Data
@Document(collection = "exams")
public class Exam {

    @Id
    private String id;
    private String name;
    private int maxStudentsPerInvigilator;
    private LocalDate createdDate = LocalDate.now();
    private boolean locked;
    private Set<ExamSession> sessions;
}
