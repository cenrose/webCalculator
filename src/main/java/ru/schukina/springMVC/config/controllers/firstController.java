package ru.schukina.springMVC.config.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/first")
public class firstController {
    @GetMapping("/hello")
    public <model> String helloPage(@RequestParam(value = "name", required = false) String name,
                                    @RequestParam(value = "surname", required = false) String surname,
                                    Model model){
        model.addAttribute("message", "Hello, "  + name + " " + surname); //тут передаем в модель пару ключ+значение
        return "/first/hello";
    }
    @GetMapping("/goodbye")
    public String goodbyePage(){
        return "/first/goodbye"; //прописали путь к html странице, которую нужно вернуть
    }

    @GetMapping("/calculator") //get запрос от пользователя (получаем параметры от пользователя)
    public String calculator(@RequestParam(value = "a", required = false) int a, @RequestParam(value = "b", required = false)int b,
                             @RequestParam(value = "action", required = false) String action, Model model) {

        double result;
        switch (action){
            case "multiplication":
                result = a*b;
            break;
            case "division":
                result = a/(double)b;
            break;
            case "addiction":
                result = a+b;
            break;
            case "subtraction":
                result = a-b;
            break;
            default:
                result = 0;
        }
        model.addAttribute("result", "Calculating is"  + result);

        return "/first/calculator";
    }
}
