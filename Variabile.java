public class Variabile {
    public static void main(String[] args) {
        // declarare si initializare
        String marcaMasina = "Volvo";
        String modelMasina = "XC 60";

        // strongly typed - trebuie sa specificati tipul de date
        System.out.println("Am cumparat o masina: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        // suprascriere
        modelMasina = "XC 60 facelift";

        System.out.println("Am cumparat o masina: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        // declarare
        String prenume;
        String nume;
        // initializare
        prenume = "Raul";
        nume = "Matiu";
        int varsta = 41;
        // concatenare de stringuri
        System.out.println(prenume + " " + nume + "cu varsta de" + " " + varsta + "ani");

    }
}
