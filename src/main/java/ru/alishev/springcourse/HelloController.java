package ru.alishev.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello-world") //когда пользователь набирает /hello-world выполняется данный метод
    public String seyHello()  { return "hello_world"; }
}
