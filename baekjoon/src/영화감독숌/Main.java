package 영화감독숌;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();

        int num = 666;
        int cnt = 1;

        while (cnt != n) {
            num++;
            if (String.valueOf(num).contains("666")) {
                cnt++;
            }
        }
        System.out.println(num);
    }
}
