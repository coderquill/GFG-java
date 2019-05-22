//https://practice.geeksforgeeks.org/problems/biginteger-mod/1/?track=module-3-classes%20and-biginteger-java&batchId=114
{

import java.io.*;
import java.util.*;
import java.math.BigInteger;

class BigIntegerMod {
	
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
		    
		    // Calling function add to find mod two BigIntegers
		    MathematicalOperation obj = new MathematicalOperation();
		    System.out.println(obj.mod(x, y));
		}
		
		
	}
}
}

class MathematicalOperation{
    
    static BigInteger mod(BigInteger x, BigInteger y){
        return x.mod(y);  
    }
    
}
