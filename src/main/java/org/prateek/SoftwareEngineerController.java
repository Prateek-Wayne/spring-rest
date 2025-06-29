package org.prateek;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {
    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return List.of(
                new SoftwareEngineer(
                        1,
                        "Prateek",
                        "Java, Spring Boot, React"
                ),
                new SoftwareEngineer(
                        2,
                        "John Doe",
                        "Python, Django, React"
                ),
                new SoftwareEngineer(
                        3,
                        "Jane Smith",
                        "JavaScript, Node.js, Angular"
                )
        );
    }
}
