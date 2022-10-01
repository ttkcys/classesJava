
package classes;

public class Classes {

    public static void main(String[] args) {
        Math math = new Math();
        
        int sonuc = math.Addition(3, 4);
        int sonuc2 = math.Division(12, 3);
        int sonuc3 = math.Multiplication(2, 8);
        int sonuc4 = math.Subtraction(78, 49);
        
        System.out.println(sonuc);
        System.out.println(sonuc2);
        System.out.println(sonuc3);
        System.out.println(sonuc4);
        
    }
    
}
