package math.sgu.ru_HelloWorld;

//object/HelloDocTest.java
//TIJ4 Chapter Object, Exercises 15, page 91
/* Take the program in Exercise 2 and add comment documentation to it. Extract
* this comment documentation into an HTML file using Javadoc and view it with
* your Web browser.
*/
import java.util.*;
/** 
* Public class contained in file of the same name that includes main()
*/
public class main {
	/** main method executed by java
	*/
	static int x,y,sum,mult;
	
	public static void main(String[] args){
		System.out.println("Hello world today date is:");
		System.out.println(new Date());
		x = 4;
		y = 6;
		sum = x + y;
		mult = x * y;
		out("Your sum result is next:",sum);
		out("Your mult result is next:",mult);
		if (x == 4) mult = 10;
		out("Your sum result is next:",sum);
		
	}
}


public static void out(String Comment , int Value){
	
	System.out.print(Comment);
	System.out.println(Value);
}
