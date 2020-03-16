import java.lang.Math;

public class Conta{
  private String numero;
  private double saldo;
  public Conta(String numero){
    this.numero = numero;
    saldo = 0;
  }
  public void creditar(double valor){
    saldo += Math.abs(valor);
  }
  public void debitar(double valor){
      saldo -= Math.abs(valor);
  }
  public String getNumero(){
    return numero;
  }
  public double getSaldo(){
    return saldo;
  }
}
