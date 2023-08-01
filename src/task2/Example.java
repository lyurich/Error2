package task2;

import task1.InvalidNumberException;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) throws DivisionByZeroException {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Введите число: ");
            int num1 = Integer.parseInt(scan.nextLine());
            int num2 = Integer.parseInt(scan.nextLine());
            if (num2 == 0){
                throw new DivisionByZeroException("Деление на ноль недопустимо");
            } else System.out.println("Результат деления: " + num1/num2);

        } catch (DivisionByZeroException e){
            System.out.println("Ощибка: " + e.getMessage());
        }
    }
}
