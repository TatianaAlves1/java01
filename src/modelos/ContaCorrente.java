package modelos;
public class ContaCorrente extends Conta{
    private double taxaOperacional;
    private double limite;


    public ContaCorrente(int agencia, int numero, double saldo, Cliente titular) {
        super(agencia, numero, saldo, titular);
        this.taxaOperacional = 0.15;
        this.limite = 500;
    }

    @Override
    public boolean sacar(double valor){
        double chequeEspecial = this.getSaldo()+ this.limite;
        System.out.println("Limite máximo de: "+chequeEspecial);
        if( chequeEspecial >= valor+this.taxaOperacional){
            this.setSaldo(this.getSaldo()-(valor+this.taxaOperacional));
            return true;
        } 
            return false;
    }

    public double getTaxaOperacional() {
        return taxaOperacional;
    }

    public double getLimite() {
        return limite;
    }

}   
