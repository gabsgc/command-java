import java.util.List;

public class Pedido {
    private String situacao;

    public Pedido(int numero, List<String> itens) {
    }

    public String getSituacao() {
        return situacao;
    }

    public void prepararPedido() {
        this.situacao = "Pedido preparado";
    }

    public void entregarPedido() {
        this.situacao = "Pedido entregue";
    }
}
