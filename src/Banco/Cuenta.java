package Banco;

public class Cuenta {
   private long numCuenta;
   private double saldo;
   private String titular;
   private double cantidaMaxDescubierto = 0.0D;
   private double cantidadMaxCajero = 600.0D;

   public Cuenta(long numCuenta, double saldo, String titular) {
      this.numCuenta = numCuenta;
      this.saldo = saldo;
      this.titular = titular;
   }

   public Cuenta(long numCuenta, double saldo, String titular, double cmd, double cmc) {
      this.numCuenta = numCuenta;
      this.saldo = saldo;
      this.titular = titular;
      this.cantidaMaxDescubierto = cmd;
      this.cantidadMaxCajero = cmc;
   }

   public String getTitular() {
      return this.titular;
   }

   public void setTitular(String titular) {
      this.titular = titular;
   }

   public long getNumCuenta() {
      return this.numCuenta;
   }

   public void setNumCuenta(long numCuenta) {
      this.numCuenta = numCuenta;
   }

   public double getSaldo() {
      return this.saldo;
   }

   public void setSaldo(double saldo) {
      this.saldo = saldo;
   }

   public double getCantidaMaxDescubierto() {
      return this.cantidaMaxDescubierto;
   }

   public void setCantidaMaxDescubierto(int cantidaMaxDescubierto) {
      this.cantidaMaxDescubierto = (double)cantidaMaxDescubierto;
   }

   public double getCantidadMaxCajero() {
      return this.cantidadMaxCajero;
   }

   public void setCantidadMaxCajero(int cantidadMaxCajero) {
      this.cantidadMaxCajero = (double)cantidadMaxCajero;
   }

   public String toString() {
      return "Cuenta{numCuenta=" + this.numCuenta + ", saldo=" + this.saldo + ", titular=" + this.titular + ", cantidaMaxDescubierto=" + this.cantidaMaxDescubierto + ", cantidadMaxCajero=" + this.cantidadMaxCajero + "}";
   }

   public boolean retirar(double cantidad) {
      return true;
   }

   public boolean ingresar(double cantidad) {
      return true;
   }

   public boolean transferir(double cantidad, Cuenta origen, Cuenta destino) {
      return true;
   }
}
