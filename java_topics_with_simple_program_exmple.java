Java Program
---------------
Variable declaration,initialization,utilization

datatype variable_name= value;
int a=10;
---------------
Local variable declaration and global variable declaration

class Class_name //class declaration
{
static int a =10; // global variale
public static void main (String [] args)
{
int b = 10; // local variables

}
}
---------------
Printing a statement
System.out.println (data);
---------------
Normal program to print 2 Number

class Sample
{
public static void add()
{
int a =10;
int b =10;
int c = a+b;
System.out.println("c");
}
}
---------------
Prog to add 2 number using methods

class Sample
{
	static void add()
	{
int a =10;
int b =20;
int c=a+b;
System.out.println(c);
	}
	public static void main(String [] args)
	{
 add();
	}
}
---------------
prog to add 2 numbers using mehtods with parameters and arguements

class Sample
{
 	static void add(int a, int b)
 	{
int c = a+b;
System.out.println(c);
 	}
 	public static void main(String [] args)
 	{
add(5,6);
 	}
}
---------------
prog to add 2 numbers using methods with return type

class Sample 
{
	static int add()
	{
int a =10;
int b =10;
int c =a+b;
return c;
	}
	public static void main (string [] args)
	{
int x =add();
System.out.println(x);
	}
}
---------------
prog to add 2 numbers using static, methods between the classes

class Sample
{
	static void add ()
	{
int a=10;
int b=10;
int c =a+b;
System.out.println(c);
	}
}
class Test
{
public static void main (String [] args)
{
Sample.add();
}
}
---------------
prog to add 2 numbers using methods with parameters between the classes

class Sample
{
 static void add(int a, int b)
 {
int c = a+b;
System.out.println(c);
 }
}
class Test
{
public static void main (String [] args)
{
Sample.add(5,6);
}
}
---------------
prog to add 2 numbers using methods with return type between the classes

class Sample 
{
static int add()
{
int a=10;
int b=10;
int c a+b;
return c;
}
}
class Tester 
{
public static void main (String [] args)
{
int x = Sample.add();
System.out.println(x);
}
}
---------------
prog to add 2 numbers using methods non-static to static

class Sample 
{
void add()
{
int a= 10;
int b= 10;
int c=a+b;
System.out.println(c);
}
new Sample().add();
}
---------------
prog to add 2 numbers using methods non static to static, with parameter and arguements

class Sample 
{
void add(int a, int b)
{
int c = a+b;
System.out.println(c);
}
public static void main (String [] args)
{
new Sample().add(5,6);
}
}
---------------
program to add 2 numbers using method return type and non static to static

class Sample 
{
int add()
{
int a=10;
int b=10;
int c=a+b;
return c;
}
public static void main(String [] args)
{
int x = new Sample().add();
System.out.println(x);
}
}
---------------
prog to add 2 numbers using method with declaring reference variable_name

class Sample
{
void add()
{
int a = 10;
int b = 10;
int c = a+b;
System.out.println(c);
}
public static void main (String [] args)
{
Sample d = new Sample();
d.add();
d.add();
}
}
---------------
prog to add numbers using method with parameters by declaring reference variable
class Sample 
{
void add(int a, int b)
{
int c = a+b;
System.out.println(c);
}
public static void main (String [] args)
{
Sample x= new Sample();
x.add(4,6);
}
}
---------------
prog to add 2 numbers using methods with return type by declaring reference variable

class Sample
{
int add()
{
int a = 10;
int b=10;
int c = a+b;
return c;
}
public static void main (String [] args)
{
Sample x = new Sample();
int y = x.add();
System.out.println(y);
}
}
---------------
write a prog to add 2 numbers using methods between the clases non-static to static through ref variable

class Demo
{
void add()
{
int a =10;
int b =10;
int c =a+b;
System.out.println(c)
}
}
class Prog_bw_classes_using_ref_variable
{
public static void main(String [] args)
{
Demo d1 = new Demo();
d1.add()
}
}
---------------
write a prod to add 2 numbers using methods with para between the classes using ref variable

class Demo
{
void add(int a, int b)
{
int c =a+b;
System.out.println(c);
}
}
class prog_bw_classes_with_para_using_ref_variable
{
public static void main(String[] args)
{
	Demo D1 = new Demo();
	D1.add(5,6);
}
}
---------------
write a prog to add 2 numbers using methods with return type b/w classes using ref variable

class Demo
{
int add()
{
int a=10;
int b=10;
int c=a+b;
return c;
}
}
class prog_bw_classes_with_rtype_using_ref_variable
{
public static void main(String [] args)
{
Demo D1= new Demo();
int x= D1.area();
}
}
---------------
prog to print the reference variable 

class Print_ref_variable
{
public static void main (String[] args)
{
Print_ref_variable D1 = new Print_ref_variable();
Print_ref_variable D2 = new Print_ref_variable();
System.out.println(D1); // printing the reference variable
System.out.println(D2); // printing the reference variable
Print_ref_variable D3=D2; //here we are assigning address of ref_variable D2 to new ref_variable D3
System.out.println(D3);
}
}
---------------
Real time example for differentiating between static and non static

if the variable value is changing as per the requirement we declare that variable or method as Non-static variable.
if the value of the variuable is not chaging and if remains constant till the end of the prof then 
we decalre it as static variable or method 

class Student 
{
	int java_mock_rating;
Static string in_name="Jspider";  // here we have initialized in_name as static variable because institute will be same
public static void main(String[] args)
{
Student S1=new Student();
S1.java_mock_rating=1; // mock rating of one student
System.out.println(S1.java_mock_rating);
Student S2=new Student();
S2.java_mock_rating=2; // mock rating of second student
System.out.println(S2.java_mock_rating);
S2.java_mock_rating=1; // here we have updated the value from 2 to 1 this is done because we have declared as non-static
System.out.println(S2.java_mock_rating);
}
}
---------------
Blocks
1]Static Initiation Block (SIB)
Here SIB Block will execute before the main program executes.
SIB is used for initialization of static variable
2]Instance Initiation Block(IIB)
Here the IIB will get executed when the object is created. 

example for the combination of SIB and IIB

class IIB_SIB
{
static
{
System.out.println("Hello SIB Block");
}
{
System.out.println("Hello IIB Block");
}
public static void main(String[] args)
{
System.out.println("Main Starts");
new IIB_SIB();
System.out.println("Main Ends");
}
}
---------------
Constructor
here we have 2 types 
a] Default Constructor : while class is created there will be a default Constructor
						 It will be in picture till there is a user defined Constructor	
b] User defined Constructor
	b1] parameterized Constructor
	b2] Non-parameterized Constructor

Prog using parameterized Constructor
here is a example  showing student marks and student roll numbers

class Stu_details
{
int Stdid;
double Stdmarks;
Stu_details(int a,double b)
{
Stdid=a;
Stdmarks=b;
return;
}
public static void main(String[] args)
{
Stu_details S1= new Stu_details(1,25)
System.out.println(S1.Stdid);
System.out.println(S1.Stdmarks);
}
}
-----------------






