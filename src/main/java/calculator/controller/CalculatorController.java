package calculator.controller;

import calculator.service.CalculatorService;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class CalculatorController {

    public void run() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = readLine();

        CalculatorService calculatorService = new CalculatorService();
        int result = calculatorService.calculateInput(input);

        System.out.print("결과 : " + result);
    }
}
