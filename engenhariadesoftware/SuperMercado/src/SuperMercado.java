import java.util.LinkedList;
import java.util.List;

public class SuperMercado {

    private List<Produto> catalogo = new LinkedList<>();

    public SuperMercado() {
    }

    public void cadastrarProduto(Produto produto){
        catalogo.add(produto);
    }
    public List<Produto> buscarProduto(String nome){

        List<Produto> encontrado = new LinkedList<>();
        for(Produto produto:catalogo){
            if(produto.getNome().equals(nome)){return encontrado;}
        }
    }
}
