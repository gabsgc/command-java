import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RestauranteTest {

    Restaurante restaurante;
    Pedido pedido;

    @BeforeEach
    void setUp() {
        restaurante = new Restaurante();
        pedido = new Pedido(1, List.of("2 Mini Almoço", "1 Coca-Cola 2L"));
    }

    @Test
    void devePrepararPedido() {
        Comanda prepararPedido = new PrepacaoPedidoComanda(pedido);
        restaurante.executarComanda(prepararPedido);

        assertEquals("Pedido preparado", pedido.getSituacao());
    }

    @Test
    void deveEntregarPedido() {
        Comanda entregaPedido = new EntregaPedidoComanda(pedido);
        restaurante.executarComanda(entregaPedido);

        assertEquals("Pedido entregue", pedido.getSituacao());
    }

}