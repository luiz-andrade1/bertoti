package org.example;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Teste {

    @Test
    void teste(){

        RockStore store = new RockStore();

        store.cadastrarCamisa(new Camisa("PP","Poliester","Adidas"));
        assertEquals(store.getCamisas().size(), 1);

        List<Camisa> encontrados = store.buscarCamisasMarca("Adidas");

        assertEquals(encontrados.get(0).getTamanho(),"PP");

    }

}
