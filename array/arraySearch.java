
//Initial Template for Java
/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
//Position this line where user code will be pasted.
class arraySearch {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    long arr[]=new long[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        long x=sc.nextLong();
		        arr[i]=x;
		    }
		    long num=sc.nextLong();
		    Geeks obj=new Geeks();
		   System.out.println(obj.search(arr,n,num)?"Yes":"No");
		    
		    
		}
		
	}
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
class Geeks
{
    static boolean search(long arr[],long n,long x) 
    {
       for(int i = 0; i<n; i++){
           if(arr[i] == x)
            return true;
       }
       return false;
    }
}
