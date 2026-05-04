package org.example;
import java.util.List;
import java.util.LinkedList;

public class RockStore {

    Camisa camisa;
    CD cd;

    public RockStore(Camisa camisa, CD cd){
        this.camisa = camisa;
        this.cd = cd;
    }

    public RockStore(){}

    private List<Camisa> camisas = new LinkedList<Camisa>();

    public List<Camisa> getCamisas(){
        return camisas;
    }

    public void cadastrarCamisa(Camisa camisa){
        camisas.add(camisa);
    }

    public List<Camisa> buscarCamisasMarca(String marca){
        List<Camisa> encontradas = new LinkedList<Camisa>();
        for(Camisa camisa:camisas){
            if (camisa.getMarca().equals(marca))
                encontradas.add(camisa);
        }
        return encontradas;

    }
}
