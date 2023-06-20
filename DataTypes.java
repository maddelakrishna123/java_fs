
import java.util.Scanner ;

class DataTypes
{


public static void main(String[] args)
{
// 1 import Scanner from Util package 




// Create Scanner Class Object

Scanner input = new Scanner(System.in);

// 3 Call appropriate methods to read values 

//Scanner : java.util 

// byte -nextByte() short - nextShort() int - nextInt() long - nextLong() char  - NO method for char        boolean - nextBoolean() float - nextFloat() double - nextDouble()   -- String 



int num1 = input.nextInt();
int num2 = input.nextInt();

int sum = num1 + num2;

System.out.println(num1 + " + "+num2+" = "+sum);  // printf();  scanf()
}


}



/* 


 Read any two number  and add them print the sum 

 56 , 89 
 
 90 100 

The sum is 147


67 + 80 = 147


1) Primary Data Types 


     a) Integer - byte - 1 byte , short  2 bytes , int  4 bytes ,long 8 bytes
	 
	 b) Real - float - 4 bytes , double - 8 bytes
	 
	 b) Character : char  - 2 bytes 
	 
	 d) Boolean : boolean  - 1 bit 


2) Secondary Data Types 

   String 

*/