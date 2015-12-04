package za.org.nwu.invigilator.exam;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends MongoRepository<Exam, String>{
}
