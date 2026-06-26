package calculator.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DelimiterTest {

    @Test
    @DisplayName("입력값이 기본 양식인지 커스텀 구분자 양식인지 구분")
    void 입력값을_넣어서_맞으면_true반환_틀리면_에러발생() {
        // Given
        String customInput = "//;\\n11;21;31";
        String defaultInput = "11,21:3";
        String errorInput = "324++34";

        // When
        Delimiter delimiter = new Delimiter();
        boolean customResult = delimiter.hasCustomDelimiter(customInput);
        boolean defaultResult = delimiter.hasCustomDelimiter(defaultInput);
//        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
//            delimiter.hasCustomDelimiter(errorInput);
//        });

        // Then
        assertEquals(true, customResult);
        assertEquals(false, defaultResult);
        //assertEquals("올바르지 않은 입력 형식입니다.", exception.getMessage());
    }

  
}