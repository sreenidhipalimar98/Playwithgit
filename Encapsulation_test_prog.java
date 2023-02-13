//encapsulation

class Demo
{
private int a=10;
public int geta()
{
return a;
}
public void seta(int a)
{
this.a=a;
}
}
class Encapsulation_test_prog
{
public static void main(String[] args)
{
Demo d1=new Demo();
System.out.println(d1.geta());
d1.seta(80);
System.out.println(d1.geta());
}
}