package biblioteca;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros () {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public void pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (livroList.isEmpty()){
            System.out.println("A lista está vazia");
        } else {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor))
                    livrosPorAutor.add(l);
            }
            System.out.println(livrosPorAutor);
        }
    }

    public void pesquisaPorIntervaloAnos (int anoInicial, int anoFinal){
        List<Livro> livrosPorAno = new ArrayList<>();
        if (livroList.isEmpty()) {
            System.out.println("A lista está vazia");
        } else {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorAno.add(l);
                }
            }
            System.out.println(livrosPorAno);
        }
    }

    public void pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                } 
            }      
            System.out.println(livroPorTitulo);
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        CatalogoLivros catalogolivros = new CatalogoLivros();

        catalogolivros.adicionarLivro("As 5 Lingugens do Amor", "Gary", 2015);
        catalogolivros.adicionarLivro("O Temperamento que Deus me Deu", "X", 2010);

        catalogolivros.pesquisaPorIntervaloAnos(2000, 2011);

        catalogolivros.pesquisarPorAutor("Gary");

        catalogolivros.pesquisarPorTitulo("O temperamento que Deus me deu");
    }

}
