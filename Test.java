public class Test {
    public static void main (String[] args)
    {
        // boolean este un tip de date ce poate fi `adevarat` sau `fals`, doar una din cele doua valori.

        int i;
        for (i = 1; i < 20; i = i + 3)
            System.out.println(i);

        // String = sir de caractere delimitate de " "
        String marca =  "Hyundai";
        String model = "Tucson";

        // aflam dimensiunea unui string
        System.out.println(marca.length());

        // scriem cu litere mari
        System.out.println(marca.toUpperCase());

        // integer = numar intreg, (int)
        int an_fabricatie = 2017;


        // double = numar zecinal
        double pret = 21000.70;

        // boolean = adevarat sau fals
        boolean inmatriculata= false;
    }
}