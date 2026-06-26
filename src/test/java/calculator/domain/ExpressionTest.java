package calculator.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionTest {

    @Test
    @DisplayName("matcher.group(1)이 뭐가 나오는지 테스트")
    void 뭐가_나오는지_보자() {
        // Given
        String input = "//;\\n1;2;3";

        // When
        Expression expression = new Expression(input);
        String customDelimiter = expression.getCustomDelimiter();
        System.out.println(customDelimiter);
    }

}