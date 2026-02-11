package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subseqence {
    public static void main(String[] args) {
        String str3= "abc";
        //System.out.println(str3.charAt(0));
        List<String> list = new ArrayList<>();
        substring("" ,str3,0,list);
        Collections.sort(list);
        System.out.println(list);
    }

    public static void substring(String str,String str2, int index , List<String> list){

        if(index == str2.length()){
            if(str.length()!=0) list.add(str);
            return;
        }

        char ch = str2.charAt(index);
        substring(str+ch,str2,index+1,list);//pick
        substring(str,str2,index+1,list); //skip


    }
}
