package ra.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.thymeleaf.model.Student;

@Controller
public class HomeController {
    @RequestMapping({"/","/home"}) // đường dẫn ""
    public String home(Model model){
        model.addAttribute("name","hung");
        model.addAttribute("age",24);
        model.addAttribute("student",new Student(1,"Hồ Xuân Hùng",24));
        model.addAttribute("array",new int[]{1,2,3,4,5,6});
        return "home";
    }
}
