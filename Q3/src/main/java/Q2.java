import java.lang.*;
public class Q2 implements Q2_Inter
{
    @Override
    public String print(String name, int age){
        return name + " " + age;
    }
    
    public static void main(String args[]) {
      Q2 q = new Q2();
      String name = q.print("John",22);
      System.out.println(name);
   }
}


