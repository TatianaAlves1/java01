public class Conta {
    protected int agencia;
    private int numero;
    private double saldo;
    private Cliente titular;

    //Construtores  
    public Conta() {
    }
    
    public Conta(int agencia, int numero, double saldo, Cliente titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public Conta(int agencia, int numero, Cliente titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    //definindo métodos
    public double mostrarSaldo(){
        return this.saldo;
    }
    public void sacar(double valor){    
        if(valor <= this.saldo){
            this.saldo -= valor;
        }     
    }
    public void depositar(double valor){       
        if(valor > 0){
           this.saldo += valor;
        } 
    }

    public void transferirSaldo(Conta destino, double valor){
        this.saldo -= valor;
        destino.depositar(valor);
    }

    public String mostrarExtrato(){
        String txt = "Cliente: "+this.titular.getNome()+"\nSaldo Atual: "+this.saldo;
        return txt;
    }

    //getters e setters
    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }
      
    public String toString(){
        return "Titular: "+this.titular.getNome()+" Saldo atual: "+this.saldo;
    }

}
