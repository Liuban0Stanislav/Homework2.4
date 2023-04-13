package pro.sky.java.course2.homework24.controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.java.course2.homework24.CalculatorService;

import java.text.DecimalFormat;

@RestController
@RequestMapping("/calculator")
public class Controller {
    CalculatorService cs = new CalculatorService();

    @GetMapping()
    public String calculator(){
        return "<strong>Добро пожаловать в калькулятор</strong>";
    }
    @GetMapping("/plus")
    public String plus(@RequestParam int num1, int num2){
        return num1 + " + " + num2 + " = " + cs.plus(num1, num2);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam int num1, int num2){
        return num1 + " - " + num2 + " = " + cs.minus(num1, num2);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, int num2){
        return num1 + " х " + num2 + " = " + cs.multiply(num1, num2);
    }
    @GetMapping("/separate")
    public String separate(@RequestParam int num1, int num2){
        return num1 + " / " + num2 + " = " + String.format("%.4f", cs.separate(num1, num2));
    }
}
