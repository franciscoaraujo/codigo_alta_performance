package br.com.code.codigo_alta_performance.listas;

public class Main {

    public static void main(String[] args) {
        simpleList<Integer> lista = new simpleList<>();
        lista.add(1);
        lista.add(2);
        lista.add(7);

        System.out.println(lista);
        System.out.println(lista.getSize());
    }
}
