package com.careerit.di.annotation;

import org.springframework.stereotype.Component;

@Component("linearSearch")
public class LinearSearch implements SearchingTechnique {
    @Override
    public int search(String[] arr, String ele) {
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(ele)){
                index = i;
                break;
            }
        }
        return index;
    }
}
