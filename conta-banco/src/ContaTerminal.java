import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        //TODO: Exibir as mensagens para o nosso usuário
        
        System.out.println("Por favor, digite o número da sua CONTA :");
        String inputConta = scanner.nextLine();
        Integer numero = Integer.parseInt(inputConta);

        System.out.println("Por favor, digite o número da sua AGENCIA :");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o SEU NOME COMPLETO :");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o valor do seu DEPÓSITO INICIAL :");
        String inputSaldo = scanner.nextLine();
        Float saldo = Float.parseFloat(inputSaldo);

        //TODO: Obter pela classe Scanner os valores digitados no terminal
        System.out.println("Você digitou a CONTA: " + numero);
        System.out.println("Você digitou a AGÊNCIA: " + agencia);
        System.out.println("Você digitou o NOME DO CLIENTE: " + nomeCliente);
        System.out.println("Você digitou o VALOR PARA DEPÓSITO DE R$: " + saldo);
        
        //TODO: Exibir a mensagem final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo +  " 1021já está disponível para saque");

        scanner.close();
    }
}
