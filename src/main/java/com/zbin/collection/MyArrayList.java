package com.zbin.collection;

/**
 * com.zbin.collection.MyArrayList
 *
 * @author Zbin
 * @date 2019/04/24
 */

public class MyArrayList<E> implements MyList<E>{

  private static final int DEFAULT_SIZE = 3;

  private int size = 0;

  private Object[] arr;

  MyArrayList() {
    this(DEFAULT_SIZE);
  }

  private MyArrayList(int initialCapacity) {
    this.arr = new Object[initialCapacity];
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public boolean contains(Object o) {
    for (int i = 0; i < size; i++) {
      if (arr[i] == o && arr[i].equals(o)) {
        return true;
      }
    }
    return false;
  }

  public boolean add(E e) {
    ensureCapacity(size + 1);
    arr[size++] = e;
    return true;
  }

  public boolean remove(Object o) {
    if (o == null) {
      for (int i = 0; i < size; i++) {
        if (arr[i] == null) {
          fastRemove(i);
          return true;
        }
      }
    } else {
      for (int i = 0; i < size; i++) {
        if (arr[i].equals(o)) {
          fastRemove(i);
          return true;
        }
      }
    }
    return false;
  }

  private void fastRemove(int index) {
    System.arraycopy(arr, index + 1, arr, index, size - index);
    arr[--size] = null;
  }

  public boolean containsAll(MyList<?> c) {
    return false;
  }

  public boolean addAll(MyList<? extends E> c) {
    return false;
  }

  public boolean removeAll(MyList<?> c) {
    return false;
  }

  public boolean retainAll(MyList<?> c) {
    return false;
  }

  public void clear() {
    for (int i = 0; i < size; i++) {
      arr[i] = null;
    }
    size = 0;
  }

  public E get(int index) {
    rangeCheck(index);
    return getVal(index);
  }

  public E set(int index, E e) {
    rangeCheck(index);
    E oldVal = getVal(index);
    arr[index] = e;
    return oldVal;
  }

  public int indexOf(Object o) {
    if (o != null) {
      for (int i = 0; i < size; i++) {
        if (o.equals(arr[i])) {
          return i;
        }
      }
      return -1;
    } else {
      return -1;
    }
  }

  public int lastIndexOf(Object o) {
    if (o != null) {
      for (int i = size; i > 0; i--) {
        if (o.equals(arr[i])) {
          return i;
        }
      }
      return -1;
    } else {
      return -1;
    }
  }

  public MyList<E> subList(int fromIndex, int toIndex) {
    if (fromIndex < 0 || toIndex > size) {
      throw new IndexOutOfBoundsException();
    }
    MyList<E> newList = new MyArrayList<>(toIndex - fromIndex);
    System.arraycopy(arr, fromIndex, newList, 0, toIndex - fromIndex);
    return newList;
  }

  private void ensureCapacity(int minCapacity) {
    if (arr.length < minCapacity) {
      Object[] newArr = new Object[arr.length * 2];
      for (int i = 0; i < size; i++) {
        System.arraycopy(arr, 0, newArr, 0, size);
      }
      arr = newArr;
    }
  }

  @Override
  public void print() {
    System.out.print("[");
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i]);
      if (i != size - 1) {
        System.out.print(", ");
      }
    }
    System.out.println("]");
  }

  @Override
  public E remove(int index) {
    rangeCheck(index);
    E oldVal = getVal(index);
    fastRemove(index);
    return oldVal;
  }

  @SuppressWarnings("unchecked")
  private E getVal(int index) {
    return (E) arr[index];
  }

  private void rangeCheck(int index) {
    if (index >= size) {
      throw new IndexOutOfBoundsException();
    }
  }
}
