public abstract class Conta {
    //Atributos
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected double saldo;
    protected int numero;
    protected int agencia;
    protected Cliente cliente;
    //Construtores
    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0;
        this.cliente = cliente;
    }
    //Métodos Personalizados
    public void sacar(double valor){
        saldo -= valor;
        System.out.println("Saque de R$"+valor+" realizado com sucesso na conta: "+this.numero+" do Titular: "+this.cliente.getNome());
    }
    public void depositar(double valor){
        saldo += valor;
        System.out.println("Depósito de R$"+valor+" realizado com sucesso na conta: "+this.numero+" do Titular: "+this.cliente.getNome());
    }
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.println("Valor de:"+valor+" transferido com sucesso da conta: "+this.numero+" para a conta: "+contaDestino.getNumero());
    }
    public abstract void imprimirExtrato();
    protected void imprimirDadosComuns(){
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
    //Getters
    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
