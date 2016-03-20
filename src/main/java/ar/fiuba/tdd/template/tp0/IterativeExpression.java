package ar.fiuba.tdd.template.tp0;

public class IterativeExpression implements Expression {

    Expression expression;
    int numberOfMaxIterations;
    int numberOfMinIterations;

    public IterativeExpression(Expression expression, int numberOfMinIterations, int numberOfMaxIterations) {
        this.expression = expression;
        this.numberOfMaxIterations = numberOfMaxIterations;
        this.numberOfMinIterations = numberOfMinIterations;
    }

    @Override
    public String generateExpression() {
        String finalExpression = "";
        int numberOfIterations = (int) (numberOfMinIterations + Math.random() * (numberOfMaxIterations - numberOfMinIterations + 1));

        for (int i = 0; i < numberOfIterations; i++) {
            finalExpression += expression.generateExpression();
        }
        return finalExpression;
    }
}
