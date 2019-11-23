package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListMainClass {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();

        for(int i = 0; i < 100; i++) {
            numbers.add(i); //Добавление елементов в коллекцию ArrayList
        }

        //Заполнение коллекции evenNumbers натуральными числами
        for(int number = 0; number <= 50; number++) {
            if(number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        //Слияние двух коллекций типа ArrayList<Integer>
        numbers.addAll(evenNumbers);


        //Искать нужное число в коллекции ArrayList
        for (int index = 0; index <= numbers.size(); index++) {
            Integer requiredNumber = numbers.get(index);
            if(requiredNumber == 50) {
                System.out.println("Number is found. Index is: " + index);
                break;
            }
        }

        for (Integer number : numbers) {
            System.out.println(number); //Печать коллекции ArrayList на экран
        }
    }
}
