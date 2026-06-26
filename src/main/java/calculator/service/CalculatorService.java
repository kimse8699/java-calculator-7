package calculator.service;

import calculator.domain.Delimiter;
import calculator.domain.Num;

import java.util.List;

public class CalculatorService {

    public int calculateInput(String input) {
        Delimiter delimiter = new Delimiter(input);

        if (delimiter.hasCustomDelimiter()) {
            List<Num> numList = delimiter.parseAsCustomDelimiter(input);
            return addNum(numList);
        }

        List<Num> numList = delimiter.parseAsDefaultDelimiter(input);
        return addNum(numList);
    }

    public int addNum(List<Num> numList) {
        int sum = 0;
        for (Num num : numList) {
            sum = num.sum(sum);
        }
        return sum;
    }
}
