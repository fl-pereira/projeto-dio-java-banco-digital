public class Main {

    public static void main(String[] args) {
        Cliente felipe = new Cliente();
        felipe.setNome("Felipe Luiz Pereira");
        felipe.setNome("07684329952");
        felipe.setEndereco("R Dirce Ferreira, Londrina");

        Conta cc = new ContaCorrente(felipe);
        Conta pp = new ContaPoupanca(felipe);

        cc.depositar(100);
        cc.transferir(100, pp);

        cc.imprimirExtrato();
        pp.imprimirExtrato();
    }

}