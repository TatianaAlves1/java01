package modelos;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public ContaPoupanca(int agencia, int numero, double saldo, Cliente titular, double taxaRendimento) {
        super(agencia, numero, saldo, titular);
        this.taxaRendimento = taxaRendimento;
    }

    public ContaPoupanca(int agencia, int numero, Cliente titular, double taxaRendimento) {
        super(agencia, numero, titular);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    

    // public static void main(String[] args) {
    //     ContaPoupanca cp = new ContaPoupanca();
    //     cp.sacar(200);
    //     cp.depositar(1000);
    // }
}
