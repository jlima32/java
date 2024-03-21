import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Por favor, digite o nome do cliente (Pressione ENTER para o próximo campo): ");
        String nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o número da Agência (Pressione ENTER para o próximo campo): ");
        String agencia = sc.nextLine();

        System.out.print("Por favor, digite o número da conta  (Pressione ENTER para o próximo campo): ");
        int numero = sc.nextInt();

        System.out.print("Por favor, digite o saldo  (Pressione ENTER para o próximo campo): ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar sua conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$ " + saldo + " já está disponível para saque." );

        sc.close();
    
    }
}
