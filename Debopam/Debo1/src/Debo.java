/*
public class Demo1 {
public static void main(String[] args) {
	int x=10;
	int y=++(++x);
	System.out.println(y);
}

}*/

/*public class Debo {
public static void main(String[] args) {
	int x=124;
	 byte b=(byte)x;
	System.out.println(b);
}
}*/

/*public class Demo1 {
public static void main(String[] args) {
	final int x=10;
	int x=11;
	System.out.println(x);
}
}*/
/*
public class Debo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=100;
x++;
System.out.println(x);
	}

}
*/

/*public class Debo{
	public static void main(String[] args) {
		char ch='a';
		ch++;
		System.out.println(ch);}}*/

/*public class Debo{
	public static void main(String[] args) {
		double d=10.5;
		d++;
		System.out.println(d);
	}
}*/

/*public class Debo{
	public static void main(String[] args) {
		boolean b=true; //BOOLEAN NOT POSSIBLE FOR INCREMENT OR DECREAMENT
		b++;
		System.out.println(b);
	}
}*/

/*public class Debo{
	public static void main(String[] args) {

		int x=10;
		if (x)
		{
			System.out.println("Hello");// JAVA DOESNOT SUPPORT 0 -> False and 1-> True UNLESS SPECIFICALLY STATED.
		}
		else
		{
			System.out.println("Hi");
		}
	}
}*/

/*public class Debo{
	public static void main(String[] args) {

		int x=10;
		if (x=20) 							//CANNOT convert INT to BOOLEAN
		{
			System.out.println("Hello");	// JAVA DOESNOT SUPPORT 0 -> False and 1-> True UNLESS SPECIFICALLY STATED.
		}
		else
		{
			System.out.println("Hi");
		}
	}
}*/

/*public class Debo{
	public static void main(String[] args) {

		int x=10;
		if (x==20)							// COMPARING x=10 with x=20, FLASE(BOOLEAN) Hence, the Else statement is executed.
		{
			System.out.println("Hello");	// JAVA DOESNOT SUPPORT 0 -> False and 1-> True UNLESS SPECIFICALLY STATED.
		}
		else
		{
			System.out.println("Hi");
		}
	}
	
	
	
	
	
}*/

/*public class Debo{
	public static void main(String[] args) {
		boolean b=true;
		if (b=false)						//BOOLEAN OUTPUT
		{
			System.out.println("Hello");
		}
		else
		{
			System.out.println("Hi");
		}
	}
}*/


/*public class Debo{
	public static void main(String[] args) {

		boolean b=false;
		if (b==false) 							//BOOLEAN condition SATISFIES. TRUE
		{
			System.out.println("Hello");     	// JAVA DOESNOT SUPPORT 0 -> False and 1-> True UNLESS SPECIFICALLY STATED.
		}
		else
		{
			System.out.println("Hi");
		}
	}
}*/

/*public class Debo{
	public static void main(String[] args) {
		if (true)								// CONDITION IS TRUE
			System.out.println("Hello");
	}
}*/

/*public class Debo{
	public static void main(String[] args) {
		if (true); 							// This statement is VALID as there is no condition in the if-else statement. CONDITION IS NULL.
	}
}*/

/*public class Debo{
	public static void main(String[] args) {
		if (true)
			int x; 							// This statement is NOT VALID. NOTE: Without curly braces we can take only single statement and it must NOT be DECLARATIVE.
}											// if (true)
*/											//{
											//int x=10; -> CORRECT FORMAT
											//}


//SWITCH CASES

/*public class Debo{
	public static void main(String[] args) {
		int x=10; 
		switch (x) {						// Empty switch cases are VALID
	}}
}*/

/*public class Debo{
	public static void main(String[] args) {
		int x=10;

		switch (x) {			
		System.out.println("Hello"); //COMPILETIME ERROR! NOTE: In Switch statements, every statement should be under some CASE or DEFAULT. INDEPENDENT statements are not allowed.
	}}
}*/
//NOTE: In Switch statements, every statement should be under some CASE or DEFAULT. INDEPENDENT statements are not allowed.

/*public class Debo{
	public static void main(String[] args) {
		int x=10;
		int y=20;
		switch (x) {			
		case 10: System.out.println(10); 
		break;
		case y: System.out.println(20); //COMPILETIME ERROR! VARIABLES CANNOT BE THERE IN SWITCH CASES
		break;
		default: System.out.println("No Output");
	}}}

}*/

/*public class Debo{
	public static void main(String[] args) {
		int x=10;
		final int y=20; //Final makes y as 20
		switch (x) {			
		case 10: System.out.println(10); //Hence, no ERROR
		break;
		case y: System.out.println(20); 
		break;
		default: System.out.println("No Output");
	}}}*/

/*public class Debo{
	public static void main(String[] args) {
		byte b=10; 										//RANGE FROM -128 to 127
		switch (b) {			
		case 10: System.out.println(10);
		break;
		case 100: System.out.println(100); 
		break;
		case 1000: System.out.println(1000); 			//1000 is out of range. COMPILE TIME ERROR
		break;
		default: System.out.println("No Output");
	}}}
*/

/*public class Debo{
	public static void main(String[] args) {
		int x=10; 										//RANGE FROM -128 to 127
		switch (x) {			
		case 97: System.out.println(97);
		break;
		case 98: System.out.println(98); 
		break;
		case 'a': System.out.println("a"); 			   // CHAR in colons implicates to INT. Hence returning its ASCII value of 97. 
		break;										   // Hence, it comes to case duplication compiletime error.
		default: System.out.println("No Output");
	}}}*/

//_______________________WHILE LOOP_______________________________________________________________________________//
/*
public class Debo{
	public static void main(String[] args) {
	int x=10;
	while(1)											// We CANNOT put ZERO or ONE in JAVA. ONLY BOOLEAN TURE or FALSE
	{
		System.out.println("Hello");
	}
	}}*/
/*
public class Debo{
	public static void main(String[] args) {
	int x=10;
	while(true)											// Continuous Hello Hello aayega. WHILE is INFINITE Loop.
	{
		System.out.println("Hello");
	}
	}}*/


/*public class Debo{
	public static void main(String[] args) {
	int x=10;
	while(true);										// Empty while statements are VALID 
	}}*/

/*public class Debo{
	public static void main(String[] args) {
	int x=10;
	while(true)
		{System.out.println("Hello");			//NOTE: In Switch statements, every statement should be under some CASE or DEFAULT. INDEPENDENT statements are not allowed.
	}}}*/

/*public class Debo{
	public static void main(String[] args) {
	int x=10;
	while(true)
		{System.out.println("Hello");			//NOTE: INFINTE LOOP
	}
	System.out.println("Hi");   //UNREACHABLE Statements are not allowed in JAVA. COMPILETIME ERROR
	}}
*/

/*public class Debo{
	public static void main(String[] args) {
	int x=10;
	while(false)
		{System.out.println("Hello");			//NOTE: UNREACHABLE LOOP
	}
	System.out.println("Hi");   //UNREACHABLE Statements are not allowed in JAVA. COMPILETIME ERROR
	}}
*/

/*public class Debo{
	public static void main(String[] args) {
	int a=10, b=20;
	while(a<b)
		{System.out.println("Hello");			//NOTE: INFINTE LOOP. Anywherein the program, the values of a and b can be changed.
	}

	System.out.println("Hi");  				   
	}}
*/

/*public class Debo{
	public static void main(String[] args) {
	final int a=10, b=20;
	while(a>b)
		{System.out.println("Hello");			//NOTE: FINAL INT X. Every final variable will be replaced by the value at
											    //compile time only. At runtime, unreachable statement is nvr going to be checked. 
												// To check unreachable statement, it is th duty og the compiler and not the JVM
	}
	System.out.println("Hi");  				   //UNREACHABLE Statements are not allowed in JAVA. COMPILETIME ERROR
	}}

*/


//_________________________________________FOR LOOP___________________________________________________


/*public class Debo{
	public static void main(String[] args) {
	for (int i=0; i<10; i++)
	{
		System.out.println("Hello"); //10 times print
	
	}
	}
}
*/

/*public class Debo{
	public static void main(String[] args) {
	for (int i=0; true; i++)       //
	{
		System.out.println("Hello"); //infinite times print
	
	}
	}
}
*/

/*public class Debo{
	public static void main(String[] args) {
	for (int i=0; i<10; i++); 				//EMPTY FOR LOOP. VALID
	}
}
*/

/*public class Debo{
	public static void main(String[] args) {
	for (int i=0; i<10; i++)
	{
		int j=10; // Delclarative statement-INVALID
	
	}
	}
}
*/
/*public class Debo{
	public static void main(String[] args) {
	int i=0;
		for (System.out.println("Hello boss you are sleeping"); i<3; i++)//Initialization is already done. direct condition check 
	{
		System.out.println("No boss you are Sleeping");
	
		
	}
	}
}
*/

//________________________________________________ONE DIEMNSIONAL ARRAY__________________________________________________

