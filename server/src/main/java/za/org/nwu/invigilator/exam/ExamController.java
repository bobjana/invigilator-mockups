package za.org.nwu.invigilator.exam;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController(value = "/api/exams")
public class ExamController {

    private ExamService examService;
    private Mapper mapper;

    @Autowired
    public ExamController(ExamService examService, Mapper mapper) {
        this.examService = examService;
        this.mapper = mapper;
    }


    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ExamResource> list(){
        return examService.list().stream().map(exam -> {
            ExamResource resource = mapper.map(exam, ExamResource.class);
            resource.setStatus(exam.isLocked()?"locked":"pending");
            return resource;
        }).collect(Collectors.toList());
    }

}
