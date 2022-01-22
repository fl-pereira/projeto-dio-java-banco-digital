public class Main {

    public static void main(String[] args) {

        // Criamos um cliente
        Cliente felipe = new Cliente();
        // Inserimos os dados
        felipe.setNome("Felipe Luiz Pereira");
        felipe.setNome("07684329952");
        felipe.setEndereco("R Dirce Ferreira, Londrina");

        // Alocamos as contas ao cliente
        Conta cc = new ContaCorrente(felipe);
        Conta pp = new ContaPoupanca(felipe);

        // Valor depositado através do método 'depositar'
        cc.depositar(100);
        // Valor transferido através do método 'transferir'
        cc.transferir(100, pp);

        // Impressão de extrato pelo método 'imprimirExtrato'
        cc.imprimirExtrato();
        pp.imprimirExtrato();
    }

}