package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MockTest_1_Median {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int result = Result4.findMedian(arr);

        System.out.println(result);

        bufferedReader.close();
    }
}

class Result4{
    static int findMedian(List<Integer> arr){
        arr.sort(Comparator.naturalOrder());
        int size = arr.size();
        return arr.get(size/2);
    }
}