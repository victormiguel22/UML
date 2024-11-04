package generalizacao;
import java.util.Scanner;

public class ContaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // criando a conta
        Conta conta = new Conta();
        System.out.println("Criando Conta:");
        System.out.print("Banco: ");
        conta.setBanco(scanner.nextLine());
        System.out.print("Agência: ");
        conta.setAgencia(scanner.nextInt());
        System.out.print("Número da Conta: ");
        conta.setNumeroConta(scanner.nextInt());
        
        System.out.println("Conta criada:");
        System.out.println(conta);
        
        // depositos e saques
        System.out.print("Valor para depósito: R$ ");
        double depositoValor = scanner.nextDouble();
        conta.deposito(depositoValor);
        System.out.println("Após depósito de R$" + depositoValor + ":");
        System.out.println(conta);
        
        System.out.print("Valor para saque: R$ ");
        double saqueValor = scanner.nextDouble();
        conta.saque(saqueValor);
        System.out.println("Após saque de R$" + saqueValor + ":");
        System.out.println(conta);

        // criando conta
        ContaSimples contaSimples = new ContaSimples();
        System.out.println("\nCriando Conta Simples:");
        scanner.nextLine(); // limpa o buffer
        System.out.print("Banco: ");
        contaSimples.setBanco(scanner.nextLine());
        System.out.print("Agência: ");
        contaSimples.setAgencia(scanner.nextInt());
        System.out.print("Número da Conta: ");
        contaSimples.setNumeroConta(scanner.nextInt());
        
        System.out.println("Conta Simples criada:");
        System.out.println(contaSimples);
        
        // depósitos e saques
        System.out.print("Valor para depósito: R$ ");
        depositoValor = scanner.nextDouble();
        contaSimples.deposito(depositoValor);
        
        System.out.print("Valor para depósito na poupança: R$ ");
        double depositoPoupancaValor = scanner.nextDouble();
        contaSimples.depositoPoupanca(depositoPoupancaValor);
        
        System.out.println("Após depósitos:");
        System.out.println(contaSimples);
        
        System.out.print("Valor para saque da poupança: R$ ");
        saqueValor = scanner.nextDouble();
        contaSimples.saquePoupanca(saqueValor);
        System.out.println("Após saque de R$" + saqueValor + " da poupança:");
        System.out.println(contaSimples);
        
        // criar conta especial
        ContaEspecial contaEspecial = new ContaEspecial();
        System.out.println("\nCriando Conta Especial:");
        scanner.nextLine(); // limpa o buffer
        System.out.print("Banco: ");
        contaEspecial.setBanco(scanner.nextLine());
        System.out.print("Agência: ");
        contaEspecial.setAgencia(scanner.nextInt());
        System.out.print("Número da Conta: ");
        contaEspecial.setNumeroConta(scanner.nextInt());
        
        System.out.print("Limite: R$ ");
        contaEspecial.setLimite(scanner.nextDouble());
        System.out.print("Dias sem juros: ");
        contaEspecial.setDiasSemJuros(scanner.nextInt());
        
        System.out.println("Conta Especial criada:");
        System.out.println(contaEspecial);
        
        // saque e deposito
        System.out.print("Valor para depósito: R$ ");
        depositoValor = scanner.nextDouble();
        contaEspecial.deposito(depositoValor);
        System.out.println("Após depósito de R$" + depositoValor + ":");
        System.out.println(contaEspecial);
        
        System.out.print("Valor para saque: R$ ");
        saqueValor = scanner.nextDouble();
        contaEspecial.saque(saqueValor);
        System.out.println("Após saque de R$" + saqueValor + ":");
        System.out.println(contaEspecial);
        
        // mostrar o saldo das contas
        System.out.println("\nSaldos finais:");
        System.out.println("Conta: " + conta.getSaldo());
        System.out.println("Conta Simples: " + contaSimples.getSaldo() + ", Saldo Poupança: " + contaSimples.getSaldoPoupanca());
        System.out.println("Conta Especial: " + contaEspecial.getSaldo());

        scanner.close();
    }
}
