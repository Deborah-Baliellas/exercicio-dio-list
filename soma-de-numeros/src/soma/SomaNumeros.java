package soma;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros (){
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros ) {
                soma += numero;
            } return soma;
        } else {
            System.out.println("A lista não contém números");
        }
        return soma;
    } 

    public int encontrarMaiorNumero() throws RuntimeException {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()){
            for (Integer numero : numeros){
                if (numero > maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public int encontrarMenorNumero() throws RuntimeException {
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                if (numero < menorNumero) {
                    menorNumero = numero;
                }
            } return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
         
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            System.out.println("A lista está vazia");
        }

    }

    public static void main(String[] args) throws Exception {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(11);
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);

        somaNumeros.exibirNumeros();

        System.out.println("Soma dos números: " + somaNumeros.calcularSoma());

        System.out.println("Maior numero da lista: " + somaNumeros.encontrarMaiorNumero());

        System.out.println("Menor número da lista: " + somaNumeros.encontrarMenorNumero());
    }
}
