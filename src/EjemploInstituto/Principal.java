package EjemploInstituto;

import java.time.LocalDate;

public class Principal {
   public static void main(String[] args) {
      Persona p = new Persona("Pepe", "Martin", LocalDate.of(2000, 5, 12));
      Alumno a = new Alumno("Lola", "Carmina", LocalDate.of(2005, 2, 10), "1ºDAM A", 8.5D);
      Profesor pr = new Profesor("Luis", "Zamora", LocalDate.of(1995, 11, 25), "Matematicas", 2000.0D);
      System.out.println("\n---------------------------------------------------\n");
      p.mostrar();
      System.out.println("\n---------------------------------------------------\n");
      a.mostrar();
      System.out.println("\n---------------------------------------------------\n");
      pr.mostrar();
      System.out.println("\n---------------------------------------------------\n");
   }
}
