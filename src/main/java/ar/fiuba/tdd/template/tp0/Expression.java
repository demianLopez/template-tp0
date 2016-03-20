package ar.fiuba.tdd.template.tp0;

public abstract class Expression {
    boolean isDisabled = false;

    public String generateExpression() {
        if (!isDisabled) {
            return buildExpression();
        }

        return "";
    }

    public void setDisabled(boolean disabled) {
        this.isDisabled = disabled;
    }

    protected abstract String buildExpression();
}
