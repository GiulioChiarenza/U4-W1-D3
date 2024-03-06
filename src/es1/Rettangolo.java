package es1;

import java.util.Scanner;

public class Rettangolo {

        public static void  main(String[] args){
            System.out.println("hello");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Inserisci altezza e larghezza del rettangolo1: ");
            Rettangolo rettangolo1 = new Rettangolo(scanner.nextInt(), scanner.nextInt());
            System.out.print("Inserisci altezza e larghezza del rettangolo2: ");
            Rettangolo rettangolo2 = new Rettangolo(scanner.nextInt(), scanner.nextInt());

            stampaDueRettangoli(rettangolo1, rettangolo2);
            scanner.close();
        }
        private double altezza;
        private double larghezza;

        public Rettangolo(double altezza, double larghezza) {
            this.altezza= altezza;
            this.larghezza= larghezza;
        }
        public double area(){
            return altezza * larghezza;
        }
        public double perimetro(){
            return 2* (altezza+larghezza);
        }
        public void stampaRettangolo() {
            System.out.println("Area: " + area());
            System.out.println("Perimetro: " + perimetro());
        }
        public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
            System.out.println("Rettangolo 1:");
            rettangolo1.stampaRettangolo();
            System.out.println("Rettangolo 2:");
            rettangolo2.stampaRettangolo();

            double areaTotale = rettangolo1.area() + rettangolo2.area();
            double perimetroTotale = rettangolo1.perimetro() + rettangolo2.perimetro();

            System.out.println("Somma delle aree: " + areaTotale);
            System.out.println("Somma dei perimetri: " + perimetroTotale);
        }



}
