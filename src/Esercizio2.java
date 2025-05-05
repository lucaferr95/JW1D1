import java.util.Scanner;

public class Esercizio2 {    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    System.out.println("Inserisci una stringa, farabutto");
    String a= scanner.next();
    System.out.println("Inserisci un'altra stringa, capra!");
    String b= scanner.next();
    System.out.println("Inserisci un'altra stringa ancora, nullafacente");
    String c= scanner.next();
    String threeStrings= concat(a,b,c);
    System.out.println(threeStrings);
    String reverseStrings= concat(c,b,a);
    System.out.println(reverseStrings);
}
    public static  String concat (String a, String b, String c) {
        return  a+b+c;
    }
}
