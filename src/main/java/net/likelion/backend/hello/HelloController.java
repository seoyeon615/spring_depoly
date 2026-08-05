package net.likelion.backend.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello2")
    public String hello2(){
        return "깃허브 액션 CICD 파이프라인 테스트";
    }
}
