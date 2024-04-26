package ContaBanco;

//Importando classes necessárias
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		int numeroConta;
		String agencia, nomeCliente;
		Double saldo;
		
		System.out.println("Por favor, digite seu nome completo: ");
		nomeCliente = sc.nextLine();
		
		System.out.println("Por favor, digite o número da conta: ");
		numeroConta = sc.nextInt();
		
		System.out.println("Por favor, digite o número da agência: ");
		agencia = sc.next();
		
		System.out.println("Por favor, digite o seu saldo: ");
		saldo = sc.nextDouble();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f R$ já está disponível para saque", nomeCliente, agencia, numeroConta, saldo);
		
	}

}
