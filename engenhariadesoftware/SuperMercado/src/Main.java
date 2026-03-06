import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class Main{

    public void main(){

        Scanner ler = new Scanner(System.in);

        SuperMercado superMercado = new SuperMercado();

        IO.println("Digite o nome do produto:");
        String nome = ler.next();

        IO.println("Digite o preço do produto:");
        double preco = ler.nextDouble();

        IO.println("Digite o peso do produto:");
        double peso = ler.nextDouble();

        Produto produto = new Produto(nome, preco, peso);

        superMercado.cadastrarProduto(produto);

        ler.close();

        

    }

}

