package modelos;
public class Cliente implements inter {
    private String nome;
    private Endereco endereco;
    private String email;
    private Telefone[] telefones;

    //definindo construtores
    public Cliente() {
    }
    
    public Cliente(String nome, Endereco endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }


    //definindo setters
    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return this.nome;
    }

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }

    @Override
    public boolean validarCPF(String cpf) {
        if(cpf.length()==8){
           return true; 
        }
        return false;
        
    }
    
    

    
    



}
