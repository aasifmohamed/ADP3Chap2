import org.junit.Test;

public class Q2_Test2 implements Q2_Inter_Test2{

    @Test
    public String print(String name, int age){
        return name + " " + age;
    }

    public static void main(String args[]) {
        Q2 q = new Q2();
        String name = q.print("Barry",28);
        System.out.println(name);
    }

}