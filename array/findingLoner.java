{
//Initial Template for Java
/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
//Position this line where user code will be pasted.
class findingLoner {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        int x=sc.nextInt();
		        arr[i]=x;
		    }
		    Geeks obj=new Geeks();
		   System.out.println(obj.findLoner(arr,n));
		    
		    
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
    static long findLoner(int arr[],int n) 
    {
        int answer = 0;
         for(int i = 0; i<n; i++){
             answer = answer ^ arr[i];
         }
         if(answer == 0)
            return -1;
        return (long)answer;
    }
}
