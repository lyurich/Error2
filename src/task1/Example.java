package task1;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) throws InvalidNumberException {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Введите число: ");
            int num = Integer.parseInt(scan.nextLine());
            if (num <=0){
                throw new InvalidNumberException("Некорректное число");
            } else System.out.println("Число корректно");
            System.out.println("Введено число: " + num);

        } catch (InvalidNumberException e){
            System.out.println("Ощибка: " + e.getMessage());
        }
    }
}
