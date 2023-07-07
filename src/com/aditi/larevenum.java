package com.aditi;
import java.util.*;
public class larevenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str= sc.next();
        str=str.replaceAll("[A-za-z]"," ");
        str=str.replaceAll("//W"," ");
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<str.length();i++)

           hs.add(Integer.parseInt (String.valueOf(str.charAt(i))));
           ArrayList<Integer> list=new ArrayList<>(hs);
            Collections.sort(list, Collections.reverseOrder());

        boolean noEven=true;
        int len= list.size();

    }
}


