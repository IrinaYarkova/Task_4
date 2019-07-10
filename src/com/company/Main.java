package com.company;
import java.util.Scanner;

public class Main

{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите бинарное число: ");

        String num = in.nextLine();

        System.out.print(num + " = ");

        System.out.println(Integer.parseInt(num, 2));

        in.close();

    }

}
