package org.example.testes;
import org.example.Camisa;
import org.example.RockStore;
import org.junit.jupiter.api.Test;


import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AltaAcoplagem {

    List<Camisa> camisaComparada = new LinkedList<>();
    RockStore store = new RockStore();

    @Test
    void teste(){

        store.cadastrarCamisa(new Camisa("PP","Poliester","Adidas"));
        store.cadastrarCamisa(new Camisa("GG","Algodao","Adidas"));
        assertEquals(store.getCamisas().size(),2);
    }

    @Test
    void teste2() {

        store.cadastrarCamisa(new Camisa("GG","Algodao","Adidas"));
        store.cadastrarCamisa(new Camisa("PP","Algodao","Adidas"));

            if (((store.getCamisas().get(0).getMarca())+
                    (store.getCamisas().get(0).getMaterial())+
                    (store.getCamisas().get(0).getTamanho()))
                    .equals((store.getCamisas().get(1).getMarca())+
                            (store.getCamisas().get(1).getMaterial())+
                            (store.getCamisas().get(1).getTamanho())))
            {
                camisaComparada.add(store.getCamisas().get(0));
                camisaComparada.add(store.getCamisas().get(1));
            }
            assertEquals(camisaComparada.size(), 2);
            //tem que dar errado, pois, o material esta diferente.
        }

}
