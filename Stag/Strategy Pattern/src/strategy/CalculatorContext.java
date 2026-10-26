package strategy;

public class CalculatorContext {
    private OperationStrategy strategy;

    public CalculatorContext(OperationStrategy initialStrategy) {
        this.strategy = initialStrategy;
    }

    public void setStrategy(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public double executeOperation(double a, double b) {
        return strategy.execute(a, b);
    }
}