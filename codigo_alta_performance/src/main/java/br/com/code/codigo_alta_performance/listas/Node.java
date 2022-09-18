package br.com.code.codigo_alta_performance.listas;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Node<T> {
    private T value;
    private Node<T> next;
}
