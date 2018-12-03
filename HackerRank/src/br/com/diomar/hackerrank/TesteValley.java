package br.com.diomar.hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class TesteValley {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {

    	Integer level = 0;
        Integer valleys = 0;
        String[] steps = s.split("");
        Boolean seaLevel = true;
        Integer count = 0;
        for (String step: steps) {

            if (count == n) {
                break;
            }

            if ("U".equals(step)) {
                level++;
            } else {
                level--;
            }

            if (level < 0 && seaLevel) {
                valleys++;
                seaLevel = false;
            }

            if (level == 0) {
                seaLevel = true;
            }

            count++;
        }

        return valleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       
    	Integer n = 8;
    	
    	String s = "DDUUDDUDUUUD";
    	
        int result = countingValleys(n, s);
        
        System.out.println(result);
       
    }
}
