package com.lryg.s20260723;

public class searchtext4 {
    public static void main(String[] args) {
        //分块查找
        int[] arr = {16, 5, 9, 12, 21, 18,
                     32, 23, 37, 26, 45, 34,
                     50, 4861, 52, 73, 66};
        BlockSearch blockSearch = new BlockSearch(21,0,5);
        BlockSearch blockSearch2 = new BlockSearch(45,6,11);
        BlockSearch blockSearch3 = new BlockSearch(73,12,16);
        BlockSearch[] blocks = {blockSearch, blockSearch2, blockSearch3};
        int number = 45;
        for (BlockSearch block : blocks) {
            if (block.getMax() >= number) {
                for (int i = block.getStart(); i <= block.getEnd(); i++) {
                    if (arr[i] == number) {
                        System.out.println("找到数字" + number + "在数组中的位置是：" + i);
                    }
                }
            }
        }


    }


    }
class BlockSearch {
    private int max;
    private int start;
    private int end;
    public BlockSearch() {
    }

    public BlockSearch(int max, int start, int end) {
        this.max = max;
        this.start = start;
        this.end = end;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }}
