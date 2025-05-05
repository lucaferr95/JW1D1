import java.util.Scanner;

public class Esercizio3 {    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    //-----------1---------
    double b= 10.2;
    double h= 20.4;
    double rettangolo= perimetroRettangolo (b,h);
    System.out.println(rettangolo);
}
//---------METOFI
public static  double perimetroRettangolo (double b, double h) {
    return 2*b+2*h;
}

}

