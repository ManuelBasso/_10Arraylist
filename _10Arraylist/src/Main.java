import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Creare un ArrayList con n elementi e stamparlo in console.
        List<Student> listStudent = new ArrayList<>();
        System.out.println("Arraylist vuota: " + listStudent);

        //Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console
        Student st1 = new Student("Manuel", 34);
        Student st2 = new Student("Luca", 22);
        Student st3 = new Student("Enzo", 21);
        Student st4 = new Student("Mirco", 21);

        listStudent.add(st1);
        listStudent.add(st2);
        listStudent.add(st3);
        listStudent.add(st4);
        System.out.println("Arraylist aggiornata: " + listStudent);

    }
}