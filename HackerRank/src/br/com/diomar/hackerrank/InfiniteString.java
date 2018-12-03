package br.com.diomar.hackerrank;

import java.io.IOException;

public class InfiniteString {

	static long repeatedString(String s, long n) {
		long count = 0;
		long qtdAs = countA(s);
		
		long x = n / s.length();
		count = x * qtdAs;
		
		long sobra = n % s.length();
		
		if (sobra > 0) {
			count += countA(s.substring(0, (int)sobra));
		}
		
		return count;
	}
	
    static long countA(String s) {
    	
    	long count = 0;
    	
    	for (int i = 0; i < s.length(); i++) {
			if (s.substring(i,i+1).equals("a")) {
				count++;
			}
		}
    	
    	return count;
    }
    
    public static void main(String[] args) throws IOException {
       
    	String in = "a";
    	long repeat = 1000000000000l;
    	
//    	String in = "aba";
//    	long repeat = 10;
    	
        long result = repeatedString(in, repeat);
        
        System.out.println(result);
       
    }
}
