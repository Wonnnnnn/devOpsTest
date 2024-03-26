package day13.dataStructure;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class MyStack<E> {
  private Node<E> top;
  private int size;

  public MyStack() {
    top = null;
    size = 0;
  }

  public int size() {
    return size;
  }
  public void push(E item) {
    Node<E> newNode = new Node<>(item, null);
    newNode.setNext(top);
    top = newNode;
    size++;
  }

  public E pop() {
    if(size == 0) {
      throw new NoSuchElementException();
    }
    Node<E> temp = top;
    E retItem = temp.getItem();
    top = temp.getNext();
    temp = null;
    size--;
    return retItem;
  }

  public boolean isEmpty() {
    if (size==0){
      return true;
    } else {
      return false;
    }
  }

  public E peek() {
    if(isEmpty()) {
      throw new EmptyStackException();
    }
    return top.getItem();
  }

}
