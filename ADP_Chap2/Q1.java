import java.util.*;

class Dog implements Comparator<Dog>, Comparable<Dog> {
   private String name;
   private int age;
   Dog() {
   }

   Dog(String n, int a) {
      name = n;
      age = a;
   }

   public String getDogName() {
      return name;
   }

   public int getDogAge() {
      return age;
   }

   public int compareTo(Dog d) {
      return (this.name).compareTo(d.name);
   }

   public int compare(Dog d, Dog d1) {
      return d.age - d1.age;
   }
}

public class Q1
{
     public static void main(String args[]) {
      List<Dog> list = new ArrayList<Dog>();

      list.add(new Dog("Shaggy", 3));
      list.add(new Dog("Lacy", 2));
      list.add(new Dog("Roger", 10));
      list.add(new Dog("Tommy", 4));
      
      Collections.sort(list);   

      for(Dog a: list) 
         System.out.print(a.getDogName() + ", ");

      
      Collections.sort(list, new Dog());
      System.out.println(" ");
      
      for(Dog a: list)
         System.out.print(a.getDogName() +"  : "+ a.getDogAge() + ", ");
         
      Set s1 = new HashSet(); 
      s1.add("Zara");
      s1.add("Mahnaz");
      s1.add("Ayan");
      System.out.println();
      System.out.println(" Set Elements");
      System.out.print("\t" + s1);

      Map m1 = new HashMap(); 
      m1.put("Zara", "8");
      m1.put("Mahnaz", "31");
      m1.put("Ayan", "12");
      m1.put("Daisy", "14");
      System.out.println();
      System.out.println(" Map Elements");
      System.out.print("\t" + m1);
   }
}
