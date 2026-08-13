package springlab_V1.v1;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student create(@Valid @RequestBody StudentRequest request) {
        return studentService.create(request);
    }

    @PatchMapping("/{id}")
    public Student update(@PathVariable Long id, @Valid @RequestBody StudentRequest request) {
        return studentService.update(id, request);
    }
    @GetMapping("/{id}")
    public  Student get(@PathVariable Long id){
        return  studentService.read(id);
    }
    @DeleteMapping("/{id}")
    public Student delete(@PathVariable Long id){
        return studentService.delete(id);
    }

}
