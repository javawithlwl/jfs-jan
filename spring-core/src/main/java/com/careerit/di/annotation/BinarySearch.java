package com.careerit.di.annotation;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component("binarySearch")
public class BinarySearch implements SearchingTechnique {
    @Override
    public int search(String[] arr, String ele) {
        Arrays.sort(arr);
        int index = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid].equals(ele)) {
                index = mid;
                break;
            } else if (arr[mid].compareTo(ele) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }
}