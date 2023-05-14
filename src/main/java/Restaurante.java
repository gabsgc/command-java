import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private List<Comanda> comandas = new ArrayList<>();

    public void executarComanda(Comanda comanda) {
        this.comandas.add(comanda);
        comanda.executar();
    }
}
