import java.util.Scanner;

public class ContaTerminal
{


  public static void main (String[]args)
  {
    //TODO: Conhecer e importar a classe Scanner
    Scanner sc = new Scanner (System.in);
       int numero;
       String agencia;
       String nomeCliente;
       double saldo; 

    //Exibir as mensagens para o nosso usuC!rio
    //Obter pela scanner os valores digitados no terminal
      System.out.println ("Digite o numero da sua conta: ");
      numero = sc.nextInt ();
      System.out.println("Digite o numero da sua agência no seguinte formato (XXX-Y): ");
      agencia = sc.next ();
      System.out.println ("Digite o seu nome: ");
      nomeCliente = sc.next ();
      System.out.println ("Digite o valor que você vai depositar: ");
      saldo = sc.nextDouble ();

    //Exibir a mensagem da conta criada
      System.out.println ("Olá! " + nomeCliente +
			  " , obrigado por criar uma conta em nosso banco, sua agência é "
			  + agencia + " , conta " + numero + " e seu saldo " +
			  saldo + " já está disponível para saque.");
  }
}
