package gr.aueb.cf.spring_cf8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/starter")
public class HelloController {

    // Old way of mapping @RequestMapping(path = "/hello", method = RequestMethod.GET)
    @RequestMapping("/hello")
    public String sayHello(Model model) {
        model.addAttribute("message", "Hello, Spring Boot!");
        return "index"; // This will resolve to src/main/resources/templates/index.html
    }

}
