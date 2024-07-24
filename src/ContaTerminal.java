import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numero = input.nextInt();
        input.nextLine();  // Consumir a nova linha pendente

        System.out.print("Digite sua agência: ");
        String agencia = input.nextLine();

        System.out.print("Digite seu nome: ");
        String nomeCliente = input.nextLine();

        System.out.print("Digite o saldo da conta: ");
        float saldo = input.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque%n", nomeCliente, agencia, numero, saldo);

        input.close();
    }
}
