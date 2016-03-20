package ar.fiuba.tdd.template.tp0;

public class ParseableExpression {
    String expression;

    int currentPosition = 0;

    public ParseableExpression(String expression) {
        this.expression = expression;
    }

    public String getNextChar() {
        String current = String.valueOf(expression.charAt(currentPosition));
        currentPosition++;
        return current;
    }

    public String getCurrentChar() {
        return String.valueOf(expression.charAt(currentPosition));
    }

    public boolean hasNext() {
        return !(expression.length() <= currentPosition);
    }
}
