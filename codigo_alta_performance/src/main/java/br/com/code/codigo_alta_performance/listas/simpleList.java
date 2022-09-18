package br.com.code.codigo_alta_performance.listas;

import java.util.Objects;

public class simpleList<T> {

    private Node<T> head;
    private int size = 0;

    public void add(T value){
        Node<T> node = new Node<T>();
        node.setValue(value);
        node.setNext(head);
        this.head = node;
        this.size++;
    }

    public int getSize(){
        return size;
    }

    @Override
    public String toString() {
       StringBuffer sb = new StringBuffer();
       sb.append("[");
       Node p = head;
       while(Objects.nonNull(p)){
            sb.append(p.getValue() + ",");
            p = p.getNext();
       }
        sb.append("]");
       return sb.toString();
    }
}
