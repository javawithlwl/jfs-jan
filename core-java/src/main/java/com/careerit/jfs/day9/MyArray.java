package com.careerit.jfs.day9;

public class MyArray {
    private int[] arr;
    int count;

    public MyArray(int size) {
        arr = new int[size];
    }

    public void add(int ele) {
        if (count == arr.length) {
            int[] temp = new int[arr.length + 3];
            System.arraycopy(arr, 0, temp, 0, arr.length);
            arr = temp;
        }
        arr[count++] = ele;
    }

    public void delete(int ele) {
        int index = indexOf(ele);
        if (index != -1) {
            int[] temp = new int[arr.length-1];
            if(index == 0){
                System.arraycopy(arr,index+1,temp,0,arr.length-1);
            }else{
                System.arraycopy(arr,0,temp,0,index);
                System.arraycopy(arr,index+1,temp,index,arr.length-index-1);
            }
            arr = temp;
            count--;
        }
    }
   private int indexOf(int ele) {
        for (int i = 0; i < count; i++) {
            if (arr[i] == ele) {
                return i;
            }
        }
        return -1;
    }

    public void showElements() {
        if (count == 0) {
            System.out.println("[]");
        } else {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < count - 1; i++) {
                sb.append(arr[i]).append(",");
            }
            sb.append(arr[count - 1]).append("]");
            System.out.println(sb.toString());
        }

    }

}