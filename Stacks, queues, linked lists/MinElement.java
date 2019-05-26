{
import java.io.*;
import java.util.*;
class MinElement {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    PriorityQueue<Integer>arr=new PriorityQueue<>();
		    
		    for(int i=0;i<n;i++)
		    {
		        arr.add(sc.nextInt());
		    }
		    
		    Geeks obj=new Geeks();
		    obj.minElements(arr);
		    System.out.println();
		}
	}
}
}
class Geeks
{
    static void minElements(PriorityQueue<Integer>arr)
    {
        
        Iterator itr = arr.iterator();
        while(itr.hasNext()){
            System.out.print(arr.poll()+" ");
        }
    
    }
}
