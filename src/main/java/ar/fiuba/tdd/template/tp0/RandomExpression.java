package ar.fiuba.tdd.template.tp0;

public class RandomExpression extends Expression {

    String alphabet = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789áéíóúÁÉÍÓÚ!@#%&/()=?¿+*[]{}.:,;-_<>";

    @Override
    public String buildExpression() {
        int randomAlphabetChar = (int) (Math.random() * (alphabet.length()));
        return String.valueOf(alphabet.charAt(randomAlphabetChar));
    }
}
