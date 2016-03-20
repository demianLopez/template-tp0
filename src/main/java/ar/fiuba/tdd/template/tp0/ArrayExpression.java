package ar.fiuba.tdd.template.tp0;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayExpression implements Expression {
    ArrayList<Expression> expressionArray;

    public ArrayExpression() {
        expressionArray = new ArrayList<>();
    }

    public void addExpression(Expression expression) {
        expressionArray.add(expression);
    }

    @Override
    public String generateExpression() {
        Iterator<Expression> expressionIterator = expressionArray.iterator();
        String finalExpression = "";

        while (expressionIterator.hasNext()) {
            Expression currentExpression = expressionIterator.next();
            finalExpression += currentExpression.generateExpression();
        }

        return finalExpression;
    }
}
