public class PreparacaoPedidoComanda implements Comanda {
    private Pedido pedido;

    public PreparacaoPedidoComanda(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void executar() {
        this.pedido.prepararPedido();
    }
}
