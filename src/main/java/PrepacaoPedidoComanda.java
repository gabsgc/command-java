public class PrepacaoPedidoComanda implements Comanda {
    private Pedido pedido;

    public PrepacaoPedidoComanda(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void executar() {
        this.pedido.prepararPedido();
    }
}
