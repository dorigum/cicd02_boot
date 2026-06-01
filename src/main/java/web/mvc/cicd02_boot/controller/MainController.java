package web.mvc.cicd02_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String index(){
<<<<<<< HEAD
        return "GitHub Actions를 이용한 CI/CD 테스트입니다. - 왜 벌써 6월이죠??";
=======
        return "GitHub Actions를 이용한 CI/CD 테스트입니다. - failed check";
>>>>>>> e7bf2f2a9d6a768c16da62103233463ed7d0cce0
    }
}
