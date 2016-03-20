package ar.fiuba.tdd.template.tp0;

public class RegularExpressionGenerator extends ExpressionGenerator {
    @Override
    protected ChainExpressionParser buildExpressionParserChain() {
        return new LiteralExpressionParser(new RandomExpressionParser(new GroupExpressionParser(
                new IterativeExpressionParserPlus(new IterativeExpressionParserStarKey(
                        new IterativeExpressionParserInterrogation(new SimpleExpressionParser()))))));
    }
}
