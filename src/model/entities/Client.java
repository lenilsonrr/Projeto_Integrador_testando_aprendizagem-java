package model.entities;

public class Client {
    private String nome;
    private String senha;
    private String email;
    private String cel;

    public Client() {
    }

    public Client(String nome, String senha, String email, String cel) {
        this.nome = nome;
        this.senha = senha;
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

    public void valLogin(String nome, String senha){
        if(nome != getNome() || senha != getSenha()){
            System.out.print("Login ou senha incorreto!!");
        }
    }


    @Override
    public String toString() {
        return getNome() +", "+getEmail()+", "+getCel();
    }
}
