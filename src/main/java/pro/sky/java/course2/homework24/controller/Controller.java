package pro.sky.java.course2.homework24.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.homework24.CalculatorService;

@RestController
public class Controller {
    @GetMapping
    @ResponseBody
    public String showSiteName(){
        return "<strong>Калькулятор</strong>";
    }
    @GetMapping("/calc")
    public String calculator(@RequestParam String args){
       return CalculatorService.getResult(args);
    }
}
