{
//Initial Template for Java
/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
//Position this line where user code will be pasted.
class sumPair {
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
		    long sum=sc.nextLong();
		    Geeks obj=new Geeks();
		   obj.findPairs(arr,n,sum);
		    
		    
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
    static void findPairs(long arr[],int n,long sum) 
    {
        int flag = 0;
        for(int i = 0; i<n; i++){
            long toSearch = sum - arr[i]; 
            if(toSearch<=arr[i] )
               break;
            if(bSearch(arr,0,n-1,toSearch)!=-1){
            	System.out.println(arr[i]+" "+arr[bSearch(arr,0,n-1,toSearch)]+" "+sum);
            	flag = 1;
            }
        }

        if(flag == 0)
            System.out.println("-1");
    }
    static int bSearch(long arr[], int l, int r, long x){
        if(r>=l){
        	int mid = l+(r-l)/2;
        
        	if(arr[mid]<x){
            		l = mid+1;
            		return bSearch(arr,l,r,x);
        	}
        	else if(arr[mid]>x){
            		r = mid-1;
            		return bSearch(arr,l,r,x);
        	}
        	else if(arr[mid]==x){
            		return mid;
        	}

        }
        return -1;
    }
}
