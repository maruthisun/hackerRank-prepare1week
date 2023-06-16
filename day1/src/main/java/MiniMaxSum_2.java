package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class MiniMaxSum_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Result2.miniMaxSum(arr);

        bufferedReader.close();
    }
}

class Result2 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long total = arr.stream().mapToLong(e -> e).sum();
        long[] longArr = new long[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            longArr[i] = total - arr.get(i);
        }

        Arrays.sort(longArr);
        System.out.println(longArr[0] + " " + longArr[longArr.length - 1]);
    }
}

//256741038 623958417 467905213 714532089 938071625