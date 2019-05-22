//https://practice.geeksforgeeks.org/problems/pair-in-java/1/?track=module-3-classes%20and-biginteger-java&batchId=114

{

import java.io.*;
import java.util.*;
// Pair class
class Pair{
    int x;
    int y;
    
    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class PairArraySorting {
    
    // Driver code
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    int N = sc.nextInt();
		    
		    // Creating an array of Pair
		    Pair arr[] = new Pair[N];
		    
		    for(int i = 0;i<N;i++){
		        int x = sc.nextInt();
		        int y = sc.nextInt();
		        arr[i] = new Pair(x, y);
		    }
		    
		    custom_Compare obj = new custom_Compare();
		    
		    obj.sortPairs(arr, N);
		}
	}
}
}

class custom_Compare{
    
    
    static void sortPairs(Pair arr[], int N){
        
        for(int i = 0;i<N;i++){
            System.out.print(arr[i].x + " " + arr[i].y + " ");
        }
        System.out.println();
    }
}
