package ar.fiuba.tdd.template.tp0;

import java.util.ArrayList;
import java.util.List;

public class RegExGenerator {
    public List<String> generate(String regEx, int numberOfResults) {
        RegularExpressionGenerator regularExpressionGenerator = new RegularExpressionGenerator();

        Expression regularExpression = regularExpressionGenerator.generateExpression(regEx);
        ArrayList<String> results = new ArrayList<>();

        for (int i = 0; i < numberOfResults; i++) {
            results.add(regularExpression.generateExpression());
        }

        return results;
    }
}