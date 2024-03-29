package 회의실배정;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                if (o1[1] == o2[1]) return o1[0] - o2[0];

                return o1[1]-o2[1];
            }
        });

//        for(int[] n : arr) System.out.println(n[0] + " " + n[1]);
        int n = 0;
        int answer = 0;
        for (int i = 0; i < N; i++) {

            if (n <= arr[i][0]) {
                answer++;
                n = arr[i][1];
            }
        }
        System.out.println(answer);
    }
}
