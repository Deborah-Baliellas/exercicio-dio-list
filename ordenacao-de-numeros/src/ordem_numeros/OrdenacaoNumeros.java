package ordem_numeros;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeroList;

    public OrdenacaoNumeros (){
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeroList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        if (!numeroList.isEmpty()) {
            List<Integer> numerosAscendentes = new ArrayList<>(this.numeroList);
            Collections.sort(numerosAscendentes);
            return numerosAscendentes;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numeroList.isEmpty()) {
            System.out.println(this.numeroList);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        if (!numeroList.isEmpty()) {
            List<Integer> numerosAscendentes = new ArrayList<>(this.numeroList);
            numerosAscendentes.sort(Collections.reverseOrder());
            return numerosAscendentes;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) throws Exception {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);
    
        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();
    
        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());
    
        // Exibindo a lista
        numeros.exibirNumeros();
    
        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());
    
        // Exibindo a lista
        numeros.exibirNumeros();
    }
}
