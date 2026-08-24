import java.util.Scanner;

enum StatusLogin{
    LOGADO,
    BLOQUEADO,
    NAO_LOGADO

}

public class Login {

    private Usuario usuario;
    private StatusLogin status;


    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public StatusLogin getStatus() {
        return status;
    }

    public void setStatus(StatusLogin status) {
        this.status = status;
    }

    public void autorizar(Usuario usuario){
        Scanner scanner = new Scanner(System.in);
        String senhaDigitada;
        int tentativas = 0;

        do{
            System.out.println("Escreva sua senha: ");
            senhaDigitada = scanner.nextLine();
            tentativas++;
             if(usuario.validarSenha(senhaDigitada)){
                this.status = StatusLogin.LOGADO;
                System.out.println("Login realizado com sucesso!.");
                break;
            }else{
                this.status = StatusLogin.NAO_LOGADO;
                
                
            }
        }while(tentativas < 3);
        if(tentativas >= 3 ){
            this.status = StatusLogin.BLOQUEADO;
            System.out.println("Login bloquado apos 3 tentativas!.");
        }
    }
        
}
