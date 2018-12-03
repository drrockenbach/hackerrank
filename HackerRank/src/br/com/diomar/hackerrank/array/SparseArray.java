
/*
There is a collection of input strings and a collection of query strings. For each query string, determine how many times it occurs in the list of input strings.

For example, given input  and , we find  instances of ',  of '' and  of ''. For each query, we add an element to our return array, .

Function Description

Complete the function matchingStrings in the editor below. The function must return an array of integers representing the frequency of occurrence of each query string in strings.

matchingStrings has the following parameters:

strings - an array of strings to search
queries - an array of query strings
Input Format

The first line contains and integer , the size of . 
Each of the next  lines contains a string . 
The next line contains , the size of . 
Each of the next  lines contains a string .

Constraints

 
 
 .

Output Format

Return an integer array of the results of all queries in order.

Sample Input 1

CopyDownload
Array: strings
aba
baba
aba
xzxb

 



Array: queries
aba
xzxb
ab

 
4
aba
baba
aba
xzxb
3
aba
xzxb
ab
Sample Output 1

2
1
0
Explanation 1

Here, "aba" occurs twice, in the first and third string. The string "xzxb" occurs once in the fourth string, and "ab" does not occur at all.


Sample Input 2

CopyDownload
Array: strings
def
de
fgh

 



Array: queries
de
lmn
fgh

 
3
def
de
fgh
3
de
lmn
fgh
Sample Output 2

1
0
1

Sample Input 3

CopyDownload
Array: strings
abcde
sdaklfj
asdjf
na
basdn
sdaklfj
asdjf
na
asdjf
na
basdn
sdaklfj
asdjf

 



Array: queries
abcde
sdaklfj
asdjf
na
basdn

 
13
abcde
sdaklfj
asdjf
na
basdn
sdaklfj
asdjf
na
asdjf
na
basdn
sdaklfj
asdjf
5
abcde
sdaklfj
asdjf
na
basdn
Sample Output 3

1
3
4
3
2
*/

package br.com.diomar.hackerrank.array;

public class SparseArray {
	
	
	static int[] matchingStrings(String[] strings, String[] queries) {

        int[] result = new int[queries.length];
        int count = 0;
        for (int y = 0; y < queries.length; y++) {
            count = 0;
            for (int x = 0; x < strings.length; x++) {
                if (strings[x].equals(queries[y])) {
                    count++;
                }
            }
            result[y] = count;
        }
        return result;
    }
	
	public static void main(String[] args) {
		
		String[] queries = {"aba","xzxb","ab"};
		String[] strings = {"aba", "baba", "aba", "xzxb"};
		
	
		int[] result = matchingStrings(strings, queries);
		
		for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
		
		
	}
	
	
	
	
	
	
	
	

}
