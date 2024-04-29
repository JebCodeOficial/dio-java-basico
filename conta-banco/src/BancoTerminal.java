public class BancoTerminal {

    public static void main(String[] args) {
        // Simular uma operação de saque
        double saldo = 25;
        double valorSolicitado = 18;
        
        // Verificar se o saldo é suficiente para o saque
        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado; // Atualizar o saldo
        } else {
            System.out.println("Saldo insuficiente");
        }
        
        // Imprimir o valor do saldo
        System.out.println("Saldo atual: " + saldo);

        // Execução com outros valores
        saldo = 15;
        valorSolicitado = 22;
        
        // Verificar se o saldo é suficiente para o saque
        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado; // Atualizar o saldo
        } else {
            System.out.println("Saldo insuficiente");
        }
        
        // Imprimir o valor do saldo
        System.out.println("Saldo atual: " + saldo);
    }
}
