package br.com.diomar.hackerrank.array;

public class LeftRotation {

//	static int[] leftRotation(int arrLenght, int nrRotation, int[] arr) {
//		 
//        int primeiro = 0;
//        
//        for(int i = 0; i < nrRotation; i++) {
//            for(int x = 0; x < arrLenght-1; x++) {
//                if (x == 0) {
//                    primeiro = arr[x];
//                }
//                
//                arr[x] = arr[x+1];
//            }
//            arr[arrLenght-1] =primeiro;
//          
//        }
//
//        for(int x = 0; x < arrLenght; x++) {
//            System.out.print(arr[x]);
//            System.out.print(" ");
//        }
//
//        return arr;
//    }
	
	static void leftRotate(int a[], int start, int end) {
        while (start < end) {

            int temp = a[start];
            a[start++] = a[end];
            a[end--] = temp;

        }

    }
	
/*	public static void main(String[] args) {
		
		leftRotate(a, 0, rotacoes - 1);
        leftRotate(a, rotacoes, numeroItens - 1);
        leftRotate(a, 0, numeroItens - 1);
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
	}*/

	
}
