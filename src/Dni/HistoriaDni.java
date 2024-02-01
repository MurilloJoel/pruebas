package Dni;

public class HistoriaDni {
   public static void main(String[] args) {
      CalcularDni DNI = new CalcularDni();

      try {
         DNI.set(47582566);
         System.out.println(DNI.getNIF());
      } catch (Exception var3) {
         System.out.println(var3.getMessage());
      }

   }
}
