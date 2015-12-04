package za.org.nwu.invigilator.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamServiceImpl implements ExamService {

    private ExamRepository examRepository;

    @Autowired
    public ExamServiceImpl(ExamRepository examRepository) {
        this.examRepository = examRepository;
    }

    @Override
    public List<Exam> list() {
        return examRepository.findAll();
    }
}
