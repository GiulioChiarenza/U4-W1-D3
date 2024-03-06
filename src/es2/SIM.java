package es2;
public class SIM {
    public static void  main(String[] args) {
        System.out.println("hello");
        SIM sim = new SIM("1234567890");

        sim.aggiungiChiamata(10, "123456789");
        sim.aggiungiChiamata(1, "1111122222");
        sim.aggiungiChiamata(7, "1222211111");
        sim.aggiungiChiamata(100, "3333333333");
        sim.aggiungiChiamata(13, "5555555555");

        sim.stampaDatiSIM();
    }
    private String numeroTelefono;
    private double creditoDisponibile;
    private Chiamata[] ultimeChiamate;
    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.creditoDisponibile = 0;
        this.ultimeChiamate = new Chiamata[5];
    }
    public void aggiungiChiamata(int durata, String numeroChiamato) {
        for (int i = ultimeChiamate.length - 1; i > 0; i--) {
            ultimeChiamate[i] = ultimeChiamate[i - 1];
        }
        ultimeChiamate[0] = new Chiamata(durata, numeroChiamato);
    }
    public void stampaDatiSIM() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + creditoDisponibile + " euro");
        System.out.println("Ultime 5 chiamate:");
        for (Chiamata chiamata : ultimeChiamate) {
            if (chiamata != null) {
                System.out.println("Numero chiamato: " + chiamata.getNumeroChiamato() +
                        ", Durata: " + chiamata.getDurata() + " minuti");
            }
        }
    }
}
