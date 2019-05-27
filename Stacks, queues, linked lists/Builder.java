//https://practice.geeksforgeeks.org/contest-problem/geek-the-builder-java/1/
{
import java.io.*;
import java.util.*;
class Builder {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    ArrayList<Integer>arr=new ArrayList<>();
		    
		    for(int i=0;i<n;i++)
		    {
		        arr.add(sc.nextInt());
		    }
		    
		    Geeks obj=new Geeks();
		    obj.builder(arr);
		    System.out.println();
		}
	}
}

}

class Geeks
{
    static void builder(ArrayList<Integer>arr)
    {
      Iterator itr = arr.iterator();
      int top = (int)arr.get(0);
      
      while(itr.hasNext()){
          int in = (int)itr.next();
          if(in<= top){
            top = in;
          } else {
              in = top;
          }
          System.out.print(in+" ");
      }
    }
}

