package ru.schukina.springMVC.config.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("second")
public class secondController {
    @GetMapping("/exit")
    public String exit(){
        return "/second/exit"; //прописали путь к html странице, которую нужно вернуть
    }
}
