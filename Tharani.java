/*program for priting the sum of two numbers without using +operator.other operators are used*/

package Operator;// here I have created a package as Operator

import java.util.Scanner;
   //import scanner class is in util folder inside the java folder
	//util contains utility classes
	//scanner is a predefined class for taking inputs from user
public class Tharani{
	//declares a class called Tharani
	//classes are the basics of opps(object oriented programming)
	static int add(int d, int e){//here we are declaring the the variables by taking static
		                        //int a primitive datatype which promotes addition operation of d,e
		int f = 0 ;//to initialize the variables,initializing f value
		while (e!=0){// if e not equals to zero the condition gets false until the loop executes
			         //while loop repeatedly executes a target statement as long as a given condition is true
			         //condition assessed first and if it returns true then the statement inside while loop executes
			f =d&e;//we are using the operator to add 
			d = d^e;//sum of two bits is d XOR e
			e = f <<1;//shifts carry to 1 bit to calculate sum
			
		}
		return d;//return the value d
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	   //Here public is a access modifier which defines who can access this method
	   //Here static a keyword which identifies class related thing
	  //void is used to define return type of the method,void means method wont return any value
	  //main is name of method
	  //declares method String[]
	 //String[]args means arguments will be passed into main method and says that main() as parameter
		Scanner sc = new Scanner (System.in);// to scan the values which we initialize
		System.out.println("enter the values of d,e");
		int d= sc.nextInt();//nextInt()reads the intput d
		int e=sc.nextInt();//nextInt() reads  thee input 
		
		System.out.println("summ of values is "+add(d,e));
		//success
       //system is used to return code
		//out is a static number
	   //Println is used to print text,adds input d,e and gives output
}}

