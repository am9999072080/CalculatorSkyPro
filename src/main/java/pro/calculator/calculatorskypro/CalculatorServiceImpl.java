package pro.calculator.calculatorskypro;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String answerCalculator() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }


    public String answerSum() {
        int num1 = 5;
        int num2 = 5;
        int sumNum1Num2 = num1 + num1;
        return num1 + "+" + num2 + "+" + "=" + sumNum1Num2;
    }


    public String answerMinus() {
        int num1 = 5;
        int num2 = 5;
        int sumNum1Num2 = num1 - num2;
        return num1 + "-" + num2 + "+" + "=" + sumNum1Num2;
    }


    public String answerMultiply() {
        int num1 = 5;
        int num2 = 5;
        int sumNum1Num2 = num1 * num1;
        return num1 + "*" + num2 + "+" + "=" + sumNum1Num2;
    }


    public String answerDivide() {
        int num1 = 5;
        int num2 = 0;
        int sumNum1Num2 = num1 / num2;
        return num1 + "/" + num2 + "+" + "=" + sumNum1Num2;
    }
}