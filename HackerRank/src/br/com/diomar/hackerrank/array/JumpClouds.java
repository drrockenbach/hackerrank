package br.com.diomar.hackerrank.array;

import java.io.IOException;

public class JumpClouds {

    static int jumpingOnClouds(int[] c) {
    	
    	int jumps = 0;
    	
    	for (int i = 0; i < c.length; i++) {
			
    		if (c[i] == 1) {
    			jumps++;
    		}
    		
    		if (i < c.length-1 && c[i] == 0 && c[i+1] == 0) {
    			jumps++;
    			i++;
    		}
    		
		}
    	
    	return jumps;
    }

    public static void main(String[] args) throws IOException {
       
//    	int[] clouds = {0,0,1,0,0,1,0};
    	int[] clouds = {0,0,0,0,1,0};
    	
        int result = jumpingOnClouds(clouds);
        
        System.out.println(result);
       
    }
}
