import modelos.Cliente;
import modelos.ContaCorrente;
import modelos.Endereco;

public class App {
    public static void main(String[] args) throws Exception {
        Endereco end1 = new Endereco();
        Cliente cli = new Cliente("Fulano", end1, "fulano@gmail.com");
        ContaCorrente cc = new ContaCorrente(222, 123432, 200, cli);

      
    }
}
