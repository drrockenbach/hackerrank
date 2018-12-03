package br.com.diomar.hackerrank.array;


/*Create a list, , of  empty sequences, where each sequence is indexed from  to . The elements within each of the  sequences also use -indexing.
Create an integer, , and initialize it to .
The  types of queries that can be performed on your list of sequences () are described below:
Query: 1 x y
Find the sequence, , at index  in .
Append integer  to sequence .
Query: 2 x y
Find the sequence, , at index  in .
Find the value of element  in  (where  is the size of ) and assign it to .
Print the new value of  on a new line
Task 
Given , , and  queries, execute each query.

Note:  is the bitwise XOR operation, which corresponds to the ^ operator in most languages. Learn more about it on Wikipedia.

Input Format

The first line contains two space-separated integers,  (the number of sequences) and  (the number of queries), respectively. 
Each of the  subsequent lines contains a query in the format defined above.

Constraints

It is guaranteed that query type  will never query an empty sequence or index.
Output Format

For each type  query, print the updated value of  on a new line.

Sample Input

2 5
1 0 5
1 1 7
1 0 3
2 1 0
2 1 1
Sample Output

7
3
Explanation

Initial Values: 
 
 
 = [ ] 
 = [ ]

Query 0: Append  to sequence . 
 
 = [5] 
 = [ ]

Query 1: Append  to sequence . 
 = [5] 
 = [7]

Query 2: Append  to sequence . 
 
 = [5, 3] 
 = [7]

Query 3: Assign the value at index  of sequence  to , print . 
 
 = [5, 3] 
 = [7]

7
Query 4: Assign the value at index  of sequence  to , print . 
 
 = [5, 3] 
 = [7]

3*/



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DynamicArray {

	static List<Integer> retorno = new ArrayList<Integer>();
	
    static List<List<Integer>> seqList = new ArrayList<List<Integer>>();
    static int lastAnswer;

    static void query1(int x, int y, int N) {
        int colIndex = 0;
        int rowIndex = (x ^ lastAnswer) % N;
        colIndex = y % seqList.get(rowIndex).size();
        lastAnswer = seqList.get(rowIndex).get(colIndex);
        retorno.add(lastAnswer);
    }

    static void query2(int x, int y, int N) {
        int rowIndex = (x ^ lastAnswer) % N;
        seqList.get(rowIndex).add(y);
    }

    // Complete the dynamicArray function below.
    static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        for (int i = 0; i < n; i++) {
            seqList.add(new ArrayList<Integer>());
        }
        for(List<Integer> lista : queries) {

            if (lista.get(0) == 1) {
                query2(lista.get(1), lista.get(2), n);
            } else {
                query1(lista.get(1), lista.get(2), n);
            }
        }

        return retorno;
    }
    
    public static void main(String[] args) throws IOException {
       
    	
       
        
    }
}
