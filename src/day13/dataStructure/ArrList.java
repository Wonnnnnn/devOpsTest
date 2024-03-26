package day13.dataStructure;

import java.util.NoSuchElementException;

public class ArrList<E> {

  private E[] a;
  private int size = 0; // 인스턴스 변수라 0으로 자동 초기화임. 근데 확실하게 하려면 0주기

  public ArrList() {
    a = (E[])new Object[10]; // 최초로 10개의 원소를 가지는 배열 생성
  }

  //get, add, remove 메서드 선언
  public E get(int num){
    if(size == 0) {
      throw new NoSuchElementException();
    }
    return a[num];
  }

  public void add(E v) {
    if (a.length == size){
      resize(size*2);
    } else {
      a[size] = v;
      size++;
    }
  }

  public int size(){
    return size;
  }

  public E removeLast(){
    if(size == (int)a.length/4){
      resize((int)a.length/2);
    }
    E ret = a[size -1];
    a[size-1] = null;
    size --;
    return ret;
//    return a[size--];
  }

  private void resize(int newSize) {
    Object[] t = new Object[newSize];
    for (int i = 0; i < size; i++) {
      t[i] = a[i];
    }
    a= (E[])t;
  }


}
