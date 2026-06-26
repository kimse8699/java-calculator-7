package calculator.domain;

public class Delimiter {

    public boolean hasCustomDelimiter(String input) {
        Expression expression = new Expression(input);
        if (expression.isCustomDelimiter()) {
            return true;
        }
        if (expression.isDefaultDelimiter()) {
            return false;
        }
        throw new IllegalArgumentException("올바르지 않은 입력 형식입니다.");
    }


}
