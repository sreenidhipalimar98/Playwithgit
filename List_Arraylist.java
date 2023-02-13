
//Program on array list and its different methods

/*int[] array1 = {1, 2, 3, 4, 5};
int[] array2 = new int[array1.length]; just for reference*/



import java.util.ArrayList;
class List_Arraylist
{

public static void main(String[] args)
{
ArrayList l2=new ArrayList();
l2.add("Test");
l2.add(69);
l2.add("JAVA");

ArrayList l3=new ArrayList();
l3.add("Test2");
l3.add(100);

ArrayList l1=new ArrayList();
l1.add(10);
l1.add(20.52);
l1.add('b');
l1.add("JAVA");
l1.add("JAVA");
l1.add(true);
System.out.println(l1);

for (int i=0;i<l1.size();i++)
{
System.out.println(l1.get(i)); //this is going to print all the data inside the list one by one
}

l1.add("Mysore");
System.out.println(l1); //we are going to add one data into list l1

l1.add(1,99);
System.out.println(l1); //we are going to add value 99 in 1th index, this will push the 1th index value to 2nd index

l1.addAll(l2);
System.out.println(l1); //here we have added collection l2 to collection l1

l1.addAll(0,l3);
System.out.println(l1);

l1.remove(l1.get(0));
System.out.println(l1); //here we have removed 0th index value from the list


ArrayList l4= l1();
l2.removeAll(l4);
System.out.println(l2);
}
}