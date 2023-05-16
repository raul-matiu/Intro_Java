public class Functii {
    // functie = logica delimitata care poate fi refolosita
    // nu putem folosi spatii in nume
    // nu putem defi o functie in alta functie

    // o functie simpla
    // nu ne da nici un rasp (nu are return)
    // nu are parametri
    public static void printGreeting(){
        System.out.println("Buna ziua! Bine ati venit!");
    }
    // o functie care saluta clientul in functie de numele lui
    // nu ne da nici un rasp (nu are return)
    // are nevoie de parametri
    public static void printGreetingByName(String nume, String prenume){
        System.out.println("Buna ziua " + nume + " " + prenume);
    }
    // o functie care calc suma a 3 nr
    // ne da un rasp - suma nr (are return)
    // ce tip de date va avea rasp
    // are nevoie de parametri
    public static double mediaNr(double a, double b, double c){
        double media = (a + b + c) / 3;
        return media;
    }

    // o functie care ne da valoarea lui pi
    // ne da un rasp ? da
    // rasp va fi double
    // are nevoie de parametri? nu
    public static double piValue(){
        // constanta care nu poate fi suprascrisa
        final double PI = 3.14;
        return PI;
    }


    public static void main(String[] args) {
        // intra clientul 1
        printGreeting();// se apeleaza functia

        // intra clientul 2
        printGreeting(); // CTRL+click pe f => ne duce la corpul ei
        // apelam o f cu paramentri oferind argumente
        printGreetingByName("Matiu", "Raul");
        printGreetingByName("Matiu", "Lucas");
        printGreetingByName("Matiu", "Giorgiana");

        System.out.println(mediaNr(3,3,4));
        double media1 = mediaNr(3215,3235,4254);
        double media2 = mediaNr(3085,3899,4784);
        double media3 = mediaNr(3000,3005,4004);
        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media3);

        System.out.println(piValue());
        System.out.println(piValue());

        // tema: aria unui dreptunghi
        // aria cercului
        // suma a 2 nr
        // o f care returneaza cate caractere are numele + prenume
    }
}
