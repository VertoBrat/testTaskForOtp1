package ru.photorex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstIp;
        String secondIp;
        boolean isIp;
        do {
            System.out.println("Введите первый ip");
            firstIp = reader.readLine();
            isIp = Util.checkIp(firstIp);
            if (!isIp) System.out.println("Неверный формат");
        } while (!isIp);

        do {
            System.out.println("Введите второй ip");
            secondIp = reader.readLine();
            isIp = Util.checkIp(secondIp);
            if (!isIp) System.out.println("Неверный формат");
        } while (!isIp);

        long first = Util.ipToLong(firstIp);
        long second = Util.ipToLong(secondIp);

        long difference = Math.abs(second - first);
        if (difference <= 1) {
            System.out.println("Нет подходящих ip");
            return;
        }
        System.out.println("Подходящие адреса:");
        if (first < second) {
            for (long i = 1; i < difference; i++)
                System.out.println(Util.longToIp(first + i));
        } else if (first > second) {
            for (long i = 1; i < difference; i++)
                System.out.println(Util.longToIp(second + i));
        }
    }
}
