import java.util.Locale;

public class DataTypes {
    public static void main(String[] args) {
        // cele mai folosite 5 tipuri de date

        // String = sir de caractere delimitate de " "
        String marca =  "Dacia";
        String model = "1310";

        // aflam dimensiunea unui string
        System.out.println(marca.length());

        // scriem cu litere mari
        System.out.println(marca.toUpperCase());

        // integer = numar intreg, (int)
        int an_fabricatie = 1987;
        System.out.println(an_fabricatie);

        // double = numar zecinal
        double pret = 2300.50;
        System.out.println(pret);

        // boolean = adevarat sau fals
        boolean inmatriculata= false;
        System.out.println(inmatriculata);

        // char = un singur caracter #, $
        char nota = 'A';
    }
}
