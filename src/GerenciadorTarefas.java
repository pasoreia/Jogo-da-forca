import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private List<Tarefas> tarefas = new ArrayList<>();

    public List<Tarefas> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Tarefas> tarefas) {
        this.tarefas = tarefas;
    }

    public void adicionar(int id, String descricao){
        Tarefas tarefa = new Tarefas(id, descricao);
        tarefa.setStatus(true); 
        tarefas.add(tarefa);
    }

    public void listar(){
        for(Tarefas t : tarefas){
           t.exibir();
        }
    }

    public void remover(int id){
        if(tarefas.isEmpty()){
            System.out.println("Lista esta vazia!.");
        }else{
            Boolean removido = tarefas.removeIf(t-> t.getId() == id);
            if(removido){
                System.out.println("Item removido com sucesso!.");
            }else{
                System.out.println("Item com id " + id + " nao encontrado");
            }
        }
    }

    public void buscar(int id){
        if(tarefas.isEmpty()){
            System.out.println("Lista esta vazia!.");
        }else{
            Tarefas encontrado = tarefas.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
            if(encontrado !=null){
                encontrado.exibir();
            }else{
                System.out.println("Tarefas com id: " + id + " nao encontrada");
            }
        }
    }




}






