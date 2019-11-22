package calculator;

public class ConsoleCalculator extends AbstractCalculator {

    private int memory = 0;
    private int operationResult = 0;

    @Override
    protected void sum(int number_1, int number_2) {
        operationResult = number_1 + number_2;
        System.out.println("The 'SUM' result is: " + operationResult);
    }

    @Override
    protected void minus(int number_1, int number_2) {
        operationResult = number_1 - number_2;
        System.out.println("The 'MINUS' result is: " + operationResult);
    }

    @Override
    protected void div(int number_1, int number_2) {
        operationResult = number_1 / number_2;
        System.out.println("The 'DIVIDE' result is: " + operationResult);
    }

    @Override
    protected void mult(int number_1, int number_2) {
        operationResult = number_1 * number_2;
        System.out.println("The 'MULT' result is: " + operationResult);
    }

    public void saveToMemory() {
        memory = operationResult;
        System.out.println("Done adding to memory!!!");
    }

    public void addFromMemory() {
        memory += operationResult;
        System.out.println("Add from memory is: " + memory);
    }

    public void minusFromMemory() {
        memory -= operationResult;
        System.out.println("Minus from memory is: " + memory);
    }
}
