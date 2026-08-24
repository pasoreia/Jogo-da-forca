
public class App {
    public static void main(String[] args) throws Exception {
      
        /*Usuario u = new Usuario("Matheus" );
        Login login = new Login();
        String senha;


        login.autorizar(u);
     

        System.out.println("Status atual: " + login.getStatus());*/

        GerenciadorTarefas g = new GerenciadorTarefas();
        
     
        g.adicionar(1, "COMER");
        g.adicionar(2, "REZAR");
        g.adicionar(3, "AMAR");
        g.remover(2);

        g.listar();





    }
}
