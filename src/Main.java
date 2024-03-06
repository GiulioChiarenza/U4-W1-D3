import entities.Student;
import entities.TipoStudent;

public class Main {
    public static void main(String[] args) {

        Student aldo = new Student(); // I COSTRUTTORE
        Student giovanni = new Student("Giovanni"); // II COSTRUTTORE
        Student giacomo = new Student("Giacomo", "Poretti"); // III COSTRUTTORE
        Student giacomo2 = new Student("Giacomo", "Poretti");
        Student marina = new Student("Marina", "Massironi", TipoStudent.FRONTEND);

        // giacomo2.id = giacomo.id;

        Student ajeje = aldo; // NON COPIARE MAI GLI OGGETTI COSI'
        //ajeje.name = "Ajeje";

        // Esempi di utilizzo di metodi non statici
/*		aldo.sayHello();
		giovanni.sayHello();
		giacomo.sayHello();
		ajeje.sayHello();

		// Esempi di utilizzo di metodi statici
		System.out.println(Math.PI);
		System.out.println(Esercizio1.isBisestile(2024));
		System.out.println(Student.school);*/

        System.out.println(aldo);
        System.out.println(giovanni);
        System.out.println(giacomo);
        System.out.println(giacomo2);
        System.out.println(ajeje);
        System.out.println(marina);

        marina.setName("G");
        System.out.println(marina.getName());


        if (giacomo.equals(giacomo2)) {
            System.out.println("I due giacomo sono uguali");
        } else {
            System.out.println("Sono diversi");
        }
    }


}