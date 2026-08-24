public class Tarefas {
    private int id;
    private String descricao;
    private boolean status = false;

    public Tarefas(int id, String descricao ) {
        this.descricao = descricao;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean concluir(){
        return this.status = true;
    }

    public void exibir(){
        System.out.println("Id: " + this.id);
        System.out.println("Descricao: " + this.descricao);
        System.out.println("Status: " + this.status);
    }



}
