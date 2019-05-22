{
//Initial Template for Java
import java.io.*;
import java.util.*;
import java.math.BigInteger;
//Position this line where user code will be pasted.
// Driver class with main function
class BigIntegerSum {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    // Taking first element 
		    // in BigInteger x
		    BigInteger x = sc.nextBigInteger();
		    
		    // Taking second element in
		    // BigInteger y
		    BigInteger y = sc.nextBigInteger();
		    
		    // Calling function add to add two BigIntegers
		    MathematicalOperation obj = new MathematicalOperation();
		    System.out.println(obj.add(x, y));
		}
		
		
	}
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
/* Class MathematicalOperation with add fucntion
* x, y : Two parameters of BigIntegers to add
*/
class MathematicalOperation{
    
    static BigInteger add(BigInteger x, BigInteger y){
            
        // Your code here
        BigInteger z = x.add(y);
        return z;
        
    }
    
}
