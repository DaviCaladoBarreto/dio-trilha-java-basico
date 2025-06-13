import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        int Conta;
        String Agencia;
        String nomeCliente;
        float Saldo;

        System.out.println("Por favor,digite o Número de sua conta");
        Conta = Leitor.nextInt();
        System.out.println("Por favor,digite o número de sua Agência");
        Agencia = Leitor.next();
        System.out.println("Por favor, digite o seu nome");
        nomeCliente = Leitor.next();

        Leitor.nextLine();

        System.out.println("Qual o Saldo da sua Conta?");
        String saldo = Leitor.nextLine().replace(",", "."); //Adiciona suporte para números decimais usando tanto a virgula "," quanto ponto "."
        Saldo = Float.parseFloat(saldo);

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponivel para saque",nomeCliente,Agencia,Conta,Saldo);
    }
}