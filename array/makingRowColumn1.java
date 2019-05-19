{
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;
class makingRowColumn1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int arr[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();
            }
            
            new Geeks().makeThemOne(arr, r, c);
        }
    }
}
//Position this line where user code will be pasted.

}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
class Geeks
{
    static void makeThemOne(int arr[][],int r,int c) 
    {
        int row[] = new int[r];
        int[] column = new int[c];
       
	int k = 0, l=0;
	while(k<r ){
		for(int i = 0; i<c; i++){
			if(arr[k][i] == 1){
				row[k] = 1;
			}
		}
		k++;
	}
	while(l<c ){
		for(int i = 0; i<r; i++){
			if(arr[i][l] == 1){
				column[l] = 1;	
			}
		}
		l++;
	}

	for(int i = 0; i<r; i++){
		if(row[i]==1){
		    for(int j = 0; j<c; j++)
		        arr[i][j] = 1;
		}
	}
    for(int j = 0; j<c; j++){
		if(column[j]==1){
		    for(int i = 0; i<r; i++){
		        arr[i][j] = 1;
		    }
		}
	}
     for(int i = 0; i<r; i++){
		    for(int j = 0; j<c; j++) 
		        System.out.print(arr[i][j]+" ");
		 System.out.println();
    }
    }
}

