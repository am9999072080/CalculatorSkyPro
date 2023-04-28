package pro.calculator.calculatorskypro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {

    private final CalculatorService calculatorService;

    public Calculator(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String answerCalculator() {
        return calculatorService.answerCalculator();
    }

    @GetMapping(path = "/calculator/plus")

    public String answerSum(@RequestParam("num1") String plus) {
        return calculatorService.answerSum();
    }

    @GetMapping(path = "/calculator/minus")

    public String answerMinus(@RequestParam("num1") String minus) {
        return calculatorService.answerMinus();
    }

    @GetMapping(path = "/calculator/multiply")
    public String answerMultiply(@RequestParam("num1") String multiply) {
        return calculatorService.answerMultiply();
    }

    @GetMapping(path = "/calculator/divide")
    public String answerDivide(@RequestParam("num1") String divide) {
        return calculatorService.answerDivide();
    }
}

