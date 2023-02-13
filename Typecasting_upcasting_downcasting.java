//Programon upcasting and downcasting

class Typecasting_upcasting_downcasting
{
public static void main(String[] args)
{
	System.out.println("Upcasting");
	System.out.println("Only Superclass data will be able to access");
Demo d1=new Sample();
System.out.println(d1.a);
System.out.println("**********************************");
System.out.println("Downcasting");
System.out.println("We can access both subclass and superclass data");
Sample S1=(Sample)d1;
S1.disp();
System.out.println(S1.a);

}
}
class Demo
{
int a=10;
}
class Sample extends Demo
{
void disp()
{
System.out.println("This is Test");
}
}