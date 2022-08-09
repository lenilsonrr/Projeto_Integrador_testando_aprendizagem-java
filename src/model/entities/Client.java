package model.entities;

public class Client {
    private String nome;
    private String senha;
    private String email;
    private String cel;

    public Client() {
    }

    public Client(String nome, String cpf, String email, String cel) {
        this.nome = nome;
        this.senha = cpf;
        this.email = email;
        this.cel = cel;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCel(){
        return cel;
    }

    public void setCel(String cel){
        this.cel = cel;
    }


    @Override
    public String toString() {
        return getNome() + ", "+ getSenha()+", "+getEmail()+", "+getCel();
    }
}
