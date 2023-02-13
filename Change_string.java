//prog to print the 4th char of given string

class Change_string
{
public static void main(String[] args)
{
String str="hello";
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
int no=(int)ch+4;
ch=(char)no;
System.out.println(ch);
}
}
}