package calculator;

import java.util.Scanner;

public class CalculatorRunner {

    public static void main(String[] args) {
        Scanner keyReader = new Scanner(System.in);
        Menu calculatorMenu = new Menu();
        ConsoleCalculator calculator = new ConsoleCalculator();
        int key;
        do {
            calculatorMenu.printConsoleMenu();
            key = keyReader.nextInt();
            if(!calculatorMenu.isKeyInputValid(key)) {
                System.out.println("Incorrect input found!");
                break;
            }
            int number_1, number_2;
            switch (key) {
                case 1:
                    System.out.println("Please enter two numbers: ");
                    number_1 = keyReader.nextInt();
                    number_2 = keyReader.nextInt();
                    calculator.sum(number_1, number_2);
                    break;
                case 2:
                    System.out.println("Please enter two numbers: ");
                    number_1 = keyReader.nextInt();
                    number_2 = keyReader.nextInt();
                    calculator.minus(number_1, number_2);
                    break;
                case 3:
                    System.out.println("Please enter two numbers: ");
                    number_1 = keyReader.nextInt();
                    number_2 = keyReader.nextInt();
                    calculator.div(number_1, number_2);
                    break;
                case 4:
                    System.out.println("Please enter two numbers: ");
                    number_1 = keyReader.nextInt();
                    number_2 = keyReader.nextInt();
                    calculator.mult(number_1, number_2);
                    break;
                case 5:
                    calculator.saveToMemory();
                    break;
                case 6:
                    calculator.addFromMemory();
                    break;
                case 7:
                    calculator.minusFromMemory();
                    break;
            }
        }while (key != 0);
    }
}
