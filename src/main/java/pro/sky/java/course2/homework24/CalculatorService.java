package pro.sky.java.course2.homework24;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.homework24.exceptions.NullArgumentException;

@Service
public class CalculatorService {

    public int plus(Integer num1, Integer num2) {
//        if (num1.equals(null) || num2.equals(null)){
//            throw new IllegalArgumentException("не хватает аргумента для вычисления");
//        }
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(Integer num1, Integer num2){
        if (num2.equals(0)) {
            throw new NullPointerException("Деление на 0 невозможно");
        }
        if (num1.equals(null) || num2.equals(null)){
            throw new NullArgumentException();
        }
        return (double) num1 / num2;
    }
}
