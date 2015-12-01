package za.org.nwu.invigilator.exam;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(collection = "exam_sessions")
public class ExamSession {

    private LocalDate date;
    private int session;
}
