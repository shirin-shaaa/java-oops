import java.util.*;

class Array
{
    public static void main(String args[])
    {
        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        fruits.add(3, "Pomegranate");

        System.out.println("ORIGINAL LIST:");
        for(String str : fruits)
        {
            System.out.println(str);
        }

        fruits.remove("Blueberry");
        fruits.remove(2);

        System.out.println("\nREMOVED LIST:");
        for(String str : fruits)
        {
            System.out.println(str);
        }

        fruits.set(3, "Chickoo");

        System.out.println("\nUPDATED LIST:");
        for(String str : fruits)
        {
            System.out.println(str);
        }

        Collections.sort(fruits);

        System.out.println("\nSORTED LIST:");
        for(String str : fruits)
        {
            System.out.println(str);
        }

        System.out.println("\nSize of the list: " + fruits.size());
        System.out.println("Object at second position is: " + fruits.get(2));

        System.out.println("Apple is in list: " + fruits.contains("Apple"));
        System.out.println("Lemon is in list: " + fruits.contains("Lemon"));
    }
}