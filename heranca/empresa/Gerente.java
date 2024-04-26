package heranca.empresa;

public class Gerente {

    private String nome;
    private Integer cpf;
    private Integer telefone;
    private Double salario;
    private Integer quantidadesGerenciados;

    private Gerente(){}
    


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
        return this.cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getTelefone() {
        return this.telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getQuantidadesGerenciados() {
        return this.quantidadesGerenciados;
    }

    public void setQuantidadesGerenciados(Integer quantidadesGerenciados) {
        this.quantidadesGerenciados = quantidadesGerenciados;
    }
    public Double getBonificacao(){
        return this.salario *0.25;
    
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", salario='" + getSalario() + "'" +
            ", quantidadesGerenciados='" + getQuantidadesGerenciados() + "'" +
            ", bonificacao='" + getQuantidadesGerenciados() + "'" +
            "}";
    }

    

    
}
    

    
}
