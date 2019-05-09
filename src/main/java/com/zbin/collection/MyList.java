package com.zbin.collection;

/**
 * com.zbin.collection.MyList
 *
 * @author Zbin
 * @date 2019/04/24
 */

public interface MyList<E> {

  int size();

  boolean isEmpty();

  boolean contains(Object o);

  boolean add(E e);

  boolean remove(Object o);

  E remove(int index);

  boolean containsAll(MyList<?> c);

  boolean addAll(MyList<? extends E> c);

  boolean removeAll(MyList<?> c);

  boolean retainAll(MyList<?> c);

  void clear();

  E get(int index);

  E set(int index, E e);

  int indexOf(Object o);

  int lastIndexOf(Object o);

  MyList<E> subList(int fromIndex, int toIndex);

  void print();
}
