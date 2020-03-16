import java.lang.Math;

public class Calculadora{
  public Calculadora(){
    
  }
    
  public double adicionar(double numero1, double numero2){
    double resultado = numero1 + numero2;
    return resultado;
  }
    
  public double subtrair(double numero1, double numero2){
    double resultado = numero1 - numero2;
    return resultado;
  }
    
  public double multiplicar(double numero1, double numero2){
    double resultado = numero1 * numero2;
    return resultado;
  }
    
  public double dividir(double numero1, double numero2){
    if(numero2 == 0){
      System.out.println("Impossivel dividir");
      return 0;
    }
    else{
      double resultado = numero1 / numero2;
      return resultado;
    }
  }
    
  public double potencia(double numero1, int expoente){
    double resultado = Math.pow(numero1,expoente);
    return resultado;
  }
    
  public double raiz(double numero1){
    double resultado = Math.sqrt(numero1);
    return resultado;
  }
    
  public double seno(double angulo){
    //System.out.println("digite o valor do angulo em radianos:");
    double resultado = Math.sin(angulo) ;
    return resultado;
  }
    
  public double coseno(double angulo){
    //System.out.println("digite o valor do angulo em radianos:");
    double resultado = Math.cos(angulo) ;
    return resultado;
  }
    
  public double tangente(double angulo){
    System.out.println("digite o valor do angulo em radianos:");
    double resultado = Math.tan(angulo) ;
    return resultado;
  }
}
