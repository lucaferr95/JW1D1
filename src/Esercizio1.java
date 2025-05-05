import java.util.Arrays;

public class Esercizio1 {
    public static void main(String[] args) {
      //  -------------1-----------
       int m= molt(4,3);
        System.out.println(m);
        //--------------------------2----------------
        int age = 29;
        String io= "La mia età è di anni ";
        String Luca= concat (io, age);
        System.out.println(Luca);
        //------------3---------------
        String [] myGirls= {"AnnalisaScarrone", "SadieSink", "AnaMena", "JennaOrtega", "ValentinaLodovini"};
        String otherGirl= "SarahToscano";
        myGirls[3]=otherGirl+","+ myGirls[3];
        System.out.println(myGirls[3]);
        System.out.println(Arrays.toString(myGirls));
        }
        //---------METODI---------------
        //-----------1----------------
        public static int molt(int a, int b) {
            return a * b;

    }

    // -------------------------2-----------

    public static  String concat (String io, int age) {
        return  io+age;
    }
    }
