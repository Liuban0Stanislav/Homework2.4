package pro.sky.java.course2.homework24;

public class CalculatorService {

    public Integer calcRequest(Integer num1, Integer num2, char mathSign) {
        Integer rez = null;
        switch (mathSign){
            case'+':
                rez = num1 + num2;
                break;
            case'-':
                rez = num1 - num2;
                break;
            case'*':
                rez = num1 * num2;
                break;
            case'/':
                rez = num1 / num2;
                break;
        }
        return rez;
    }
}
