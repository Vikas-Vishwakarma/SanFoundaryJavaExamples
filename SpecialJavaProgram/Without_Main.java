//Java Program without using the Main() Function
 
package sanfoundary.special;

/**
 *	We put the statement to be printed in a static block.
 *	The static block executes before main method hence we get the desired output.
 * 	But in case of JDK7 the code would not execute as it looks for main method before any other thing.
 */
public class Without_Main {
	static {
		System.out.println("Hello World");
		System.exit(0);
	}
	//Does not work with JDK 7
}
