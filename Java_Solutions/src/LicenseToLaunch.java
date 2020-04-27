import java.util.Scanner;

public class LicenseToLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int lowest = 9999;
        int day = 0;
        for(int i = 0; i < max; i++) {
            int val = sc.nextInt();
            if (val < lowest) {
                lowest = val;
                day = i;
            }
        }
        System.out.println(day);
    }
}
