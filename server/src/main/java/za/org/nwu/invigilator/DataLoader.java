package za.org.nwu.invigilator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import za.org.nwu.invigilator.exam.Exam;
import za.org.nwu.invigilator.exam.ExamRepository;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private ExamRepository examRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void run(String... strings) throws Exception {
        mongoTemplate.getDb().dropDatabase();

        Exam exam = new Exam();
        exam.setName("Exam 1");
        examRepository.save(exam);

        Exam exam2 = new Exam();
        exam2.setName("Exam 2");
        examRepository.save(exam2);

    }
}
