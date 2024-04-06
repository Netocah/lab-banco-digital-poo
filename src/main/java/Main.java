public class Main {
    public static void main(String[] args) {
        Cliente neto = new Cliente();
        neto.setNome("Neto");
        Conta cc = new ContaCorrente(neto);
        Conta cp = new ContaPoupanca(neto);
        cc.depositar(800);
        cc.transferir(50, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
