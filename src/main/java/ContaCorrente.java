public class ContaCorrente extends Conta {
    @Override
    public void imprimirExtrato(){
        System.out.println("*** Extrato da conta Corrente ***");
        super.imprimirDadosComuns();
    }
    public ContaCorrente(Cliente cliente){
        super(cliente);
    }
}
