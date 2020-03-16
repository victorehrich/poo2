import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Escolha a opção desejada:\n 1) Testa Calculadora\n 2) Testa Conta \n 3) Testa Banco");
    int opcao = scanner.nextInt();
    switch(opcao) {
      case 1: testaCalculadora();
              break;
              
      case 2: testaConta();
              break;
              
      case 3: testaBanco();
              break;
              
      default: System.out.println("Opção inexistente!");
              break;
    }
  }


  public static void testaCalculadora() {
    //escreva o código de teste aqui
    Calculadora calc = new Calculadora();
    //double b = Math.PI;
    double a = calc.adicionar(12,3);
    System.out.println("adicionar: " + a);
    a = calc.subtrair(12,3);
    System.out.println("subtrair: " + a);
    a = calc.multiplicar(12,3);
    System.out.println("multiplicar: " + a);    
    a = calc.dividir(12,3);
    System.out.println("dividir: " + a);
    a = calc.potencia(12,3);
    System.out.println("potencia: " + a);
    a = calc.raiz(16);
    System.out.println("raiz: " + a);
    a = calc.seno(0);
    //olha math.pi pq nao esta funcionando
    System.out.println("seno: " + a);
    a = calc.coseno(0);
    System.out.println("coseno: " + a);
    a = calc.tangente(0);
    System.out.println("tangente: " + a);
  }

  public static void testaConta() {
    //escreva o código de teste aqui
    Conta conta  = new Conta("123123");
    double a;
    String b;
    conta.creditar(500);
    conta.debitar(-100);
    b = conta.getNumero();
    System.out.println(b);
    a = conta.getSaldo();
    System.out.println(a);
  }
  
  public static void testaBanco() {
    //escreva o código de teste aqui
    Banco banco = new Banco();
    Conta conta1 = new Conta("123123");
    Conta conta2 = new Conta("123124");
    banco.cadastrar(conta1);
    banco.cadastrar(conta2);
    banco.creditar("123123",500);
    banco.debitar("123123",100);
    System.out.println(banco.saldo("123123"));
    banco.transferir("123123","123124",500);
    System.out.println(banco.saldo("123123"));
    System.out.println(banco.saldo("123124"));

  }

}
