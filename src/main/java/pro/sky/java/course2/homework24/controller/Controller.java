package pro.sky.java.course2.homework24.controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.java.course2.homework24.CalculatorService;
import pro.sky.java.course2.homework24.exceptions.NullArgumentException;

@RestController
@RequestMapping("/calculator")
public class Controller {
//    CalculatorService cs = new CalculatorService();
    CalculatorService cs;

    public Controller(CalculatorService cs) {
        this.cs = cs;
    }

    @GetMapping()
    public String calculator(){
        return "<strong>Добро пожаловать в калькулятор</strong>";
    }
    @GetMapping("/plus")
    public String plus(@RequestParam Integer num1, Integer num2){
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
    @GetMapping("/divide")
    public String divide(@RequestParam Integer num1, Integer num2){
        if (num2.equals(0)){
            return "деление на 0 невозможно";
        }
        try {
            return num1 + " / " + num2 + " = " + String.format("%.4f", cs.divide(num1, num2));
        } catch (NullArgumentException e){
            return "отсутствует аргумент";
        } catch (NullPointerException e) {
            return "нулевой аргумент";
        }
    }
}
