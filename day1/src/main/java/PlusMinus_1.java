package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.*;

public class PlusMinus_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float posCount = 0;
        float negCount = 0;
        float zeroCount = 0;
        float totalElements = arr.size();

        for (Integer num : arr) {
            if (num == 0) {
                zeroCount += 1;
            } else if (num > 0) {
                posCount += 1;
            } else {
                negCount += 1;
            }
        }
        float posRatio = posCount / totalElements;
        float negRatio = negCount / totalElements;
        float zeroRatio = zeroCount / totalElements;

        System.out.printf("%.6f %n", posRatio);
        System.out.printf("%.6f %n", negRatio);
        System.out.printf("%.6f %n", zeroRatio);

        System.out.println(posRatio);
        System.out.println(negRatio);
        System.out.println(zeroRatio);
    }
}