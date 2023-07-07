package com.aditi;
import java.util.*;
public class Search_in_String
{
    public static void main(String[] args)
    {
String s="AditiSingh";
        char ch1='A';
        System.out.println(Arrays.toString(s.toCharArray()));
        System.out.println(search(s,ch1));
    }
    static boolean search(String str,char c)
    {
        if(str.length()==0)
        {
            return false;
        }
        for(char ch: str.toCharArray())
        {
            if(ch==c)
            {
                return true;
            }
        }
        return false;
    }
}
