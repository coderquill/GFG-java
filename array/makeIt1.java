{
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;
class makeIt1
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
        boolean firstRowZero = false;
        boolean firstColumnZero = false;
 
        //set first row and column zero or not
        for(int i=0; i<arr.length; i++){
            if(arr[i][0] == 1){
                firstColumnZero = true;
                break;
            }
        }
 
        for(int i=0; i<arr[0].length; i++){
            if(arr[0][i] == 1){
                firstRowZero = true;
                break;
            }
        }
 
        //mark zeros on first row and column
        for(int i=1; i<arr.length; i++){
            for(int j=1; j<arr[0].length; j++){
                if(arr[i][j] == 1){
                   arr[i][0] = 1;
                   arr[0][j] = 1;
                }
            }
        }
 
        //use mark to set elements
        for(int i=1; i<arr.length; i++){
            for(int j=1; j<arr[0].length; j++){
                if(arr[i][0] == 1 || arr[0][j] == 1){
                   arr[i][j] = 1;
                }
            }
        }
 
        //set first column and row
        if(firstColumnZero){
            for(int i=0; i<arr.length; i++)
                arr[i][0] = 1;
        }
 
        if(firstRowZero){
            for(int i=0; i<arr[0].length; i++)
                arr[0][i] = 1;
        }
        
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
 
    }

        
}

