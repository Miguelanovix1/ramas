import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


import java.time.temporal.ChronoUnit;


public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
 
        System.out.println("Introduce tus datos:");


        System.out.println("Nombre:   ");
        String nombre=teclado.nextLine();


        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Introduce tu fecha de nacimiento (dd/MM/yyyy):");
        String edad= teclado.nextLine();
        LocalDate fechaNac = LocalDate.parse(edad, fmt);
        LocalDate ahora = LocalDate.now();

        System.out.println("Hola "+nombre);



        //24-May-2017, change this to your desired
        // Start Date
        LocalDate dateBefore = LocalDate.parse(edad,fmt);
        // 29-July-2017, change this to your desired
        // End Date
        LocalDate dateAfter = LocalDate.now();
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
        System.out.printf("\nDias vividos: "+noOfDaysBetween);



        System.out.println("\nHolaa "+nombre+" Su fecha de nacimiento es:"+edad);


        System.out.println("Introduce tus dni:");
        System.out.println("DNI:   ");
        String dni=teclado.nextLine();
        System.out.println("Con dni:"+dni);



    }
}
