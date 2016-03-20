package ar.fiuba.tdd.template.tp0;

public class RandomExpression implements Expression {

    String alphabet = "abcdefghijklmn�opqrstuvwxyzABCDEFGHIJKLMN�OPQRSTUVWXYZ0123456789����������!@#%&/()=?�+*[]{}.:,;-_<>";

    @Override
    public String generateExpression() {
        int randomAlphabetChar = (int) (Math.random() * (alphabet.length()));
        return String.valueOf(alphabet.charAt(randomAlphabetChar));
    }
}
