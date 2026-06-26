package calculator.controller;

import calculator.service.CalculateService;

import java.security.Provider;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class CalculateController {

    public void run() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = readLine();

        CalculateService calculateService = new CalculateService();
        int result = calculateService.calculateInput(input);

        System.out.print("결과 : " + result);
    }
}
