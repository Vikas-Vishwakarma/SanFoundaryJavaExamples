//This is a Java Program to Print a Semicolon without using a Semicolon anywhere in the Code.
//We take a integer variable and assign it a value of fifty nine. 
//Now with the help Implicit Casting we convert this integer value into char and 
//since ASCII value of semicolon(;) is fifty nine we get the output as semicolon.

package sanfoundary.special;

public class Semicolon {
	public static void main(String[] args) {
		int n = 59;
		char ch = (char) n;
		System.out.println(ch);
	}
}
