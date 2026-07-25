package com.lryg.s20260725;

public class text1 implements text<String> {
    private String[] arr = new String[10];
    private int count = 0;

    @Override
    public void add(String element) {
        arr[count++] = element;
    }

    @Override
    public String get(int index) {
        return arr[index];
    }

    @Override
    public boolean remove(String element) {
        for (int i = 0; i < count; i++) {
            if (arr[i].equals(element)) {
                // 元素前移覆盖
                System.arraycopy(arr, i+1, arr, i, count-i-1);
                count--;
                return true;
            }
        }
        return false;
    }

}
