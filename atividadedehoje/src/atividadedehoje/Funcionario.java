package atividadedehoje;

import java.time.LocalDate;
import java.time.Period;


public class Funcionario extends Pessoa{
    
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String cpf, String rg, LocalDate dataNascimento, double salario, int id, String nome, Genero genero, Endereco endereco) {
        super(id, nome, genero, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "\n id: " + super.id +
               "\n nome:" + super.nome +
               "\n genero:" + super.genero +
               "\n logradouro:" + super.endereco.logradouro +
               "\n numero: " + super.endereco.numero +
               "\n cep: " + super.endereco.cep +
               "\n cidade: " + super.endereco.cidade +
               "\n uf: " + super.endereco.uf +
               "\n complemento: " + super.endereco.complemento +
               "\n cpf: " + this.cpf +
               "\n rg :" + this.rg +
               "\n dataNascimento: " + Util.formatDate(dataNascimento) +
               "\n salario: " + this.salario;
    }

    
    
}
