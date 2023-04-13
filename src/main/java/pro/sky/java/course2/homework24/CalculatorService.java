package pro.sky.java.course2.homework24;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int plus(Integer num1, Integer num2) {
        if (num1.equals(null) || num2.equals(null)){
            throw new IllegalArgumentException("не хватает аргумента для вычисления");
        }
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double separate(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Деление на 0 невозможно");
        }
        return (double) num1 / num2;
    }
//    public String getResult(String args) {
//        Integer num1 = getNum1(args);
//        int num2 = getNum2(args);
//        String mathSign = getMathSign(args);
//
//        if(num2 == 0 && mathSign.equals("/")){
//            return "деление на ноль невозможно";
//        }
//
//        int result = 0;
//        switch (mathSign){
//            case "*":
//                result = num1 * num2;
//                break;
//            case "/":
//                result = num1 / num2;
//                break;
//            case "+":
//                result = num1 + num2;
//                break;
//            case "-":
//                result = num1 - num2;
//                break;
//         }
//
//        StringBuilder sb = new StringBuilder();
//        sb.append(num1 + "" + mathSign + "" + num2 + " = " + result);
//        return "<strong>Результат</strong>" + "<br><strong>" + sb + "</strong></br>";
//    }
//
//    public int getNum1(String args) {
//        char[] symbolsArr = args.toCharArray();
//        StringBuilder sb = new StringBuilder(args);
//        int counter = counterCalc(symbolsArr, args);
//        sb.delete(0, symbolsArr.length);
//        for (int i = 0; i < counter; i++) {
//            switch (symbolsArr[i]) {
//                case '0':
//                case '1':
//                case '2':
//                case '3':
//                case '4':
//                case '5':
//                case '6':
//                case '7':
//                case '8':
//                case '9':
//                    sb.append(symbolsArr[i]);
//                    break;
//            }
//        }
//        return Integer.parseInt(String.valueOf(sb));
//    }
//
//    public String getMathSign(String args) {
//        char[] symbolsArr = args.toCharArray();
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < symbolsArr.length; i++) {
//            switch (symbolsArr[i]) {
//                case '*':
//                case '/':
//                case '+':
//                case '-':
//                    sb.append(symbolsArr[i]);
//                    break;
//            }
//        }
//        return String.valueOf(sb);
//    }
//
//    public int getNum2(String args) {
//        char[] symbolsArr = args.toCharArray();
//        StringBuilder sb = new StringBuilder(args);
//
//        int counter = counterCalc(symbolsArr, args);
//
//        sb.delete(0, symbolsArr.length);
//        for (int i = counter; i < symbolsArr.length; i++) {
//            switch (symbolsArr[i]) {
//                case '0':
//                case '1':
//                case '2':
//                case '3':
//                case '4':
//                case '5':
//                case '6':
//                case '7':
//                case '8':
//                case '9':
//                    sb.append(symbolsArr[i]);
//                    break;
//            }
//        }
//        return Integer.parseInt(String.valueOf(sb));
//    }
//    public int counterCalc(char[] Arr, String args){
//        StringBuilder sb = new StringBuilder(args);
//        int counter = 0;
//        for(char el: Arr){
//            switch (el){
//                case'*':
//                    counter = sb.indexOf("*");
//                    break;
//                case'/':
//                    counter = sb.indexOf("/");
//                    break;
//                case'+':
//                    counter = sb.indexOf("+");
//                    break;
//                case'-':
//                    counter = sb.indexOf("-");
//                    break;
//            }
//        }
//        return counter;
//    }
}
