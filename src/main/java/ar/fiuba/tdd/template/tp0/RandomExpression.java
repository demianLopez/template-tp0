package ar.fiuba.tdd.template.tp0;

public class RandomExpression extends Expression {

    String alphabet = "abcdefghijklmn�opqrstuvwxyzABCDEFGHIJKLMN�OPQRSTUVWXYZ0123456789����������!@#%&/()=?�+*[]{}.:,;-_<>";

    @Override
    public String buildExpression() {
        int randomAlphabetChar = (int) (Math.random() * (alphabet.length()));
        return String.valueOf(alphabet.charAt(randomAlphabetChar));
    }
}
