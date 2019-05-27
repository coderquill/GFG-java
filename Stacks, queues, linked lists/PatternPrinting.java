//https://practice.geeksforgeeks.org/contest-problem/pattern-printer-java/1/
{
import java.util.*;
class PatternPrinting {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    String s=sc.next(); //Taking string as input
		    Queue<Character>q=new LinkedList<>();
		    for(int i=0;i<s.length();i++)
		    {
		        q.add(s.charAt(i)); //Putting s into a queue
		    }
		    Geeks obj=new Geeks();
		    obj.patternPrint(q); //passing queue to the function that you need to complete
		     System.out.println();  //new line already added, don't add.
		}
	}
}

}

class Geeks
{
    static void patternPrint(Queue<Character>q)
    {
       Stack<Character> stack = new Stack<Character>();
       Iterator<Character> itr = q.iterator();
       while(itr.hasNext()){
           stack.push(itr.next());
       }
       Iterator<Character> itr2 = q.iterator();
       int count = 0;
       while(itr2.hasNext()&&count!=q.size()){
           count = count+2;
           System.out.print(itr2.next()+""+stack.pop());
           
       }
       
    }
}
