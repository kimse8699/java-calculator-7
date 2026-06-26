package calculator.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Delimiter {

    private final String delimiter;
    private final Expression expression;

    public Delimiter(String input) {
        expression = new Expression(input);
        if (hasCustomDelimiter()) {
            delimiter = expression.getCustomDelimiter();
            return;
        }
        delimiter = null;
    }

    public boolean hasCustomDelimiter() {
        if (expression.isCustomDelimiter()) {
            return true;
        }
        if (expression.isDefaultDelimiter()) {
            return false;
        }
        throw new IllegalArgumentException("올바르지 않은 입력 형식입니다.");
    }

    public List<Num> parseAsCustomDelimiter(String input) {
        String body = expression.getBody();
        String[] numbers = body.split(Pattern.quote(delimiter));

        List<Num> numList = new ArrayList<>();
        for (String number : numbers) {
            Num num = new Num(Integer.parseInt(number));
            numList.add(num);
        }
        return numList;
    }

    public List<Num> parseAsDefaultDelimiter(String input) {
        List<Num> numList = new ArrayList<>();
        String[] restResult = input.split(",");
        for (String rr : restResult) {
            String[] colonResult = rr.split(":");
            for (String cr : colonResult) {
                Num num = new Num(Integer.parseInt(cr));
                numList.add(num);
            }
        }
        return numList;
    }
}
