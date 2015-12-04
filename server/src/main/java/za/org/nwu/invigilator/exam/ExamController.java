package za.org.nwu.invigilator.exam;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController(value = "/api/exams")
public class ExamController {

    private ModelMapper modelMapper;
    private ExamService examService;

    @Autowired
    public ExamController(ExamService examService) {
        this.examService = examService;
        initModelMapper();
    }


    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ExamResource> list(){
        return examService.list().stream().map(exam ->
            modelMapper.map(exam, ExamResource.class)).collect(Collectors.toList());
    }

    private void initModelMapper() {
        PropertyMap<Exam, ExamResource> examMappings = new PropertyMap<Exam, ExamResource>() {
            protected void configure() {
                String status = source.isLocked() ? "locked" : "pending";
                map().setStatus(status);
            }
        };

        this.modelMapper = new ModelMapper();
        this.modelMapper.addMappings(examMappings);
    }

}
