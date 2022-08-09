package model.entities;

public class Lojista {
    private String CNPJ;
    private String nomeFantasia;
    private String senha;

    public Lojista(){
    }

    public Lojista(String CNPJ, String nomeFantasia, String senha) {
        this.CNPJ = CNPJ;
        this.nomeFantasia = nomeFantasia;
        this.senha = senha;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void valLogin(String CNPJ, String senha){
        if(senha == this.senha && CNPJ == this.CNPJ){

        }
    }
}
