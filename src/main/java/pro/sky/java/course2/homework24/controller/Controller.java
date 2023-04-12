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
        return "<strong>Калькулятор</strong>" +
                "<br>вторая строка</br>";
    }
    @GetMapping("/calc")
    public String calculator(@RequestParam(required = false) Integer num1,
                             @RequestParam(required = false) Integer num2,
                             @RequestParam(required = false) char mathSign){
        CalculatorService cs = new CalculatorService();
        if(num2 == 0 || num1 == 0){
            return "<strong>деление на 0 невозможно</strong>";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(num1 + "" + mathSign + "" + num2 + " = " + cs.calcRequest(num1, num2, mathSign));
        return "<strong>Результат</strong>" + "<br><strong>" + sb + "</strong></br>";
    }
}
