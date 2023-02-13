//String class


class String_class_test
{

public static void main(String[] args)
{
String s1="ok";
String s2="ok";

System.out.println(s1==s2);
System.out.println(s1.equals(s2));

System.out.println("*********************************************************");

String s3=new String("ok");
String s4=new String("ok");

System.out.println(s3.equals(s4));
System.out.println(s3==s4);
}
}