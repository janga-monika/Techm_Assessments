package com.techm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToCollection {
    public static void main(String[] args) {
        String[] array={"apple","banana","cherry","date"};
        List<String> list = new ArrayList<>(Arrays.asList(array));
        list.add("elderberry");
        System.out.println("The modified collection is: "+list);
    }
}
