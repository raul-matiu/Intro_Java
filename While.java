public class While {
    public static void main(String[] args) {
        // while - loop, ciclu repetitiv
        // zona de cod care se repeta atata timp cat o conditie este adevarata

        // problema: masina merge atat imp cat inca are benzina
        int litri_benzina = 10;
        while (litri_benzina > 0) {
            // acceleram
            System.out.println("Vruum vruum!");
            // scadem benzina
            litri_benzina = litri_benzina-1;
            // aprindem beculetu cand mai avem <= 3 litri
            if (litri_benzina <= 3 ){
                System.out.println("Se aprinde becul rosu!");
            }

        }
        System.out.println("Stop! Nu mai avem benzina");

    }
}
