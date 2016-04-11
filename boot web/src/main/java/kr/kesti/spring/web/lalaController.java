package kr.kesti.spring.web;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class lalaController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello Worlds!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(lalaController.class, args);
    }
}