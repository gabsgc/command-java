public class EntregaPedidoComanda implements Comanda {
    private Pedido pedido;

    public EntregaPedidoComanda(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void executar() {
        this.pedido.entregarPedido();
    }
}
