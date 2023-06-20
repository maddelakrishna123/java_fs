/* Operators : 
    
	 a = 8 
	 
	 b = 9 

    a + b  expression  will produce a value based on Operator and Operands
	
	 a and b are Operands 
	 
	  + is an Operator 
	  
	  
	  a + b = 17
	  
	  a - b = -1



2) 5 ( 2.5
   5
   
   -----
   0  remainder
   
   
   5/2 = 2
   
   4/2 = 2
   
   5.0 / 2  = 2.5
   
   
   
   % remainder 
   
   

1) Arithmetic Operators :  


     + , - , * ,  / , %(Modulas Operator )

*/

import java.util.Scanner;
class Operators {


public static void main(String []args){


Scanner scan = new Scanner(System.in); // System.in  // standurd input stream - console or command line or terminal 
int num1 ; 

double num2 ;
System.out.println("Enter two numbers ");
num1 = scan.nextInt();   // method call 
//System.out.println("Enter Second  Number ");
num2 = scan.nextInt();



System.out.println("Input values are :"+num1 + " and "+num2 );


double sum = num1 + num2 ; // arithmetic expression num1 =9 num2 = 5


System.out.println(num1 + " + "+num2 +" = "+sum);

System.out.println(num1 + " - "+num2 +" = "+(num1 - num2));


System.out.println(num1 + " * "+num2 +" = "+(num1 * num2));

System.out.println(num1 + " / "+num2 +" = "+(num1 / num2));

System.out.println(num1 + " % "+num2 +" = "+(num1 % num2));

// Assigment Operators : = , +=, -= , *= , /= (shorthand Operators )



 //num1 = num1+ num2;
 num1+=num2;


// Relational Operators or Boolean Operators  > <  >= , <= , ==, !=

// a > b relational expression or boolean expressio or conditional Expression

// Relational expression always produces true or false


// a = 90 b = 45   a > b =  true a < b = false , a == b false a != b = true a >= b = true  a <= b = false 

// relational expression are used to decision making 


// Logical Operators && AND || OR  ! NOT







}


}