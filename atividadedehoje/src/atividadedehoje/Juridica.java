package atividadedehoje;

import java.time.LocalDate;


public class Juridica extends Pessoa{
    
    private String cnpj;
    private String inscricaoEstadual;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private double valorContrato;

    public Juridica() {
    }

    public Juridica(String cnpj, String inscricaoEstadual, LocalDate dataInicio, LocalDate dataTermino, double valorContrato, int id, String nome, Genero genero, Endereco endereco) {
        super(id, nome, genero, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.valorContrato = valorContrato;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
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
               "\n cnpj: " + this.cnpj +
               "\n dataInicio :" + Util.formatDate(dataInicio) +
               "\n inscricaoEstadual: " + this.inscricaoEstadual +
               "\n dataTermino: " + Util.formatDate(dataTermino) +
               "\n valorContrato: " + this.valorContrato;
    }
    
    
            
}
