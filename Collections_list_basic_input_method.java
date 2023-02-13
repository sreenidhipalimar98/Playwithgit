//prog on collection_list_topics

import java.util.ArrayList;

class Collections_list_basic_input_method
{
public static void main(String[] args)
{
Collections_list_basic_input_method l1= new Collections_list_basic_input_method();
Collections_list_basic_input_method l2=new Collections_list_basic_input_method();
l1.State_name();
l2.City_name();
}
void State_name()
{
ArrayList l1=new ArrayList();
l1.add("Rajasthan");
l1.add("Tamil Nadu");
l1.add("Maharashtra");
l1.add("Uttar Pradesh");
l1.add("Madya Pradesh");
l1.add("Karnataka");
l1.add("Gujarat");
l1.add("Kerala");
l1.add("West Bengal");
l1.add("Bihar");
for(int i=0;i<l1.size();i++)
{
System.out.println(l1.get(i));
}
System.out.println(l1);
}
void City_name()
{
ArrayList l2=new ArrayList();
l2.add("Mumbai");
l2.add("Bengaluru");
l2.add("Kolkata");
l2.add("Hyderabad");
l2.add("chennai");
l2.add("Pune");
l2.add("Surat");
l2.add("New Delhi");
l2.add("Jaipur");
l2.add("Indore");
for(int i=0;i<l2.size();i++)
{
System.out.println(l2.get(i));
}
System.out.println(l2);
}
}