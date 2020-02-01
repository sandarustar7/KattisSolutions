package Spavanac;

import java.util.Scanner;

public class Spavanac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hours = sc.nextInt();
        int min = sc.nextInt();

        min = min - 45;
        if (min < 0) {
            min += 60;
            hours--;
        }
        if (hours < 0) {
            hours += 24;
        }
        System.out.println(hours + " " + min);
    }
}
