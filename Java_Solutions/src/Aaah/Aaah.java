package Aaah;

import java.util.Scanner;

public class Aaah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String person = sc.nextLine();
        String doctor = sc.nextLine();

        System.out.println((person.length() >= doctor.length() ? "go" : "no"));
    }
}
