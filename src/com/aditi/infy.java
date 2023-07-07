package com.aditi;
import java.util.*;
public class infy
{
    public static void main(String[] args) {
        System.out.println("original array");
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(40);
        System.out.println(list);
        System.out.println("removing duplicate elements");
        HashSet<Integer> hs = new HashSet<>(list);
        for(Integer r: hs){
            System.out.println(r);
        }
    }
}
