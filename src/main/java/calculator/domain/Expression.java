package calculator.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expression {

    private final String input;

    public Expression(String input) {
        this.input = input;
    }

    private static final Pattern customRegex = Pattern.compile("^//(.)\\\\n(([1-9][0-9]*)(\\1[1-9][0-9]*)*$)");
    private static final Pattern defaultRegex = Pattern.compile("([1-9][0-9]*)([, :][1-9][0-9]*)*");

    public boolean isCustomDelimiter() {
        return Pattern.matches(String.valueOf(customRegex), input);
    }

    public boolean isDefaultDelimiter() {
        return Pattern.matches(String.valueOf(defaultRegex), input);
    }

    public String getCustomDelimiter() {
        Matcher matcher = customRegex.matcher(input);
        matcher.matches();
        return matcher.group(1);
    }

    public String getBody() {
        Matcher matcher = customRegex.matcher(input);
        matcher.matches();
        return matcher.group(2);
    }
}
