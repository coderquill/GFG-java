//https://practice.geeksforgeeks.org/problems/consonants-and-vowels-check-java/1/?track=module-2-arrays-and-strings-java

{
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class vowelConsonent
{
    
	public static void main (String[] args)
	{
    	 Scanner sc = new Scanner(System.in);
    	 int t = sc.nextInt();
    	 sc.nextLine();
    	 boolean flag = false;
    	 while(t-- > 0){
    	  String s=sc.nextLine();
    	  Geeks obj=new Geeks();
    	  obj.checkString(s);
    	   
    	 }
    }
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
class Geeks{
    
    static void checkString(String s)
    {
        int v=0;
        int c=0;
        int k = 0;
        //Your code here
        for(int i= 0; i<s.length(); i++){
            if(s.charAt(i) =='a' || s.charAt(i) =='e' || s.charAt(i) =='i' || 
            s.charAt(i) =='o' || s.charAt(i) =='u')
            v++;
            else if(s.charAt(i) == ' ')
                k++;
            else 
            c++;
        }
       
        if(v>c)
        System.out.print("Yes");
        else if(c>v)
        System.out.print("No");
        else
       System.out.print("Same");
        
        System.out.println();
    }
}
//Position this line where user code will be pasted.

