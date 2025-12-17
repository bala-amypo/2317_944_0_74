import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class StudentController {
    @GetMapping("/get")
    public StudentEntity getData() {
        return 
    }
}