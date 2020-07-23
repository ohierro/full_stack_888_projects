package com.hiberus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Time time = new Time(23, 59, 59);
//        Time time = new Time();

//        Scanner scanner = new Scanner(System.in);
//        time.setHours(scanner.nextInt());
//        time.setMinutes(scanner.nextInt());
//        time.setSeconds(scanner.nextInt());

        System.out.println(time);

        time.setMinutes(30);
        System.out.println(time);

        time.nextSecond();
        System.out.println(time);

        time.setHours(16);
        time.setMinutes(59);
        time.setSeconds(59);
        System.out.println(time);

        time.nextSecond();
        System.out.println(time);

        time.setHours(23);
        time.setMinutes(59);
        time.setSeconds(59);
        System.out.println(time);

        time.nextSecond();
        System.out.println(time);
    }
}
