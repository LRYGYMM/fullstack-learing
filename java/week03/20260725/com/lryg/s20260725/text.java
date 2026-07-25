package com.lryg.s20260725;

public interface text<E> {
    void add(E element);
    // 获取元素
    E get(int index);
    // 删除元素
    boolean remove(E element);
}
