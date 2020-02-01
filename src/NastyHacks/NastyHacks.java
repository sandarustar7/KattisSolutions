package NastyHacks;

import java.util.Scanner;

public class NastyHacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();

        while(sc.hasNextInt()) {
            int revenue = sc.nextInt();
            int adRevenue = sc.nextInt();
            int costOfAdvertising = sc.nextInt();

            if (revenue > adRevenue - costOfAdvertising) {
                System.out.println("do not advertise");
            } else if (revenue < adRevenue - costOfAdvertising) {
                System.out.println("advertise");
            } else {
                System.out.println("does not matter");
            }
        }
    }
}
