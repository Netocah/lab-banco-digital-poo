public class ContaPoupanca extends Conta {
    @Override
    public void imprimirExtrato(){
        System.out.println("*** Extrato da conta Poupança ***");
        super.imprimirDadosComuns();
    }
    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }
}
