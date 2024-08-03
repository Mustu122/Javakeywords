/**
 * finEx
 */
public class finEx {

 public static void main(String[] args) {
    try {
        int a=1/0;
        System.out.println(a);
    } catch (Exception e) {
        System.out.println("handle exception");
    }
    finally{
        System.out.println("try and catch block executed");
    }
 }
}