package ordem_de_pessoas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }


    public static void main(String[] args) throws Exception {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Jontz", 33, 1.74);
        ordenacaoPessoas.adicionarPessoa("Debs", 31, 1.68);
        ordenacaoPessoas.adicionarPessoa("Chileno", 70, 1.6);
        ordenacaoPessoas.adicionarPessoa("Cidinha", 60, 1.5);

        System.out.println("A lista de pessoas contém: " + ordenacaoPessoas.pessoaList);

        ordenacaoPessoas.ordenarPorIdade();
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        ordenacaoPessoas.ordenarPorAltura();
        System.out.println(ordenacaoPessoas.ordenarPorAltura());


    }
}
