package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter the" +
                        " name: ");
                String name = in.nextLine();
                System.out.println("Enter the age: ");
                int age = in.nextInt();
                in.nextLine();
                User user = new User();
                user.setAge(age);
                user.setName(name);
            } catch (Exception e) {
                e.printStackTrace();
            }

            }


        }
    }

