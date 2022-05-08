// https://www.hackerrank.com/challenges/plus-minus/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        double positive = 0;
        double negative = 0;
        double zero = 0;
        double total = arr.size();
        
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) > 0){
                positive++;
            }
            if(arr.get(i) < 0){
                negative++;
            }
            if(arr.get(i) == 0){
                zero++;
            }
        }
        
        System.out.format("%.6f \n", positive/total);
        System.out.format("%.6f \n", negative/total);
        System.out.format("%.6f \n", zero/total);
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
