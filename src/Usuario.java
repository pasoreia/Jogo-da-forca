public class Usuario {
    private String nome;
    private String senha;


    public Usuario(String nome) {
        this.nome = nome;
        
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


    public boolean  validarSenha(String senha){
        String regexSenha = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        boolean valida = senha.matches(regexSenha);
        if(!valida){
            System.out.println("Senha incorreta!.");
        }else{
            System.out.println("Senha confirmada!.");
        }
        
        return valida;
    }








}
