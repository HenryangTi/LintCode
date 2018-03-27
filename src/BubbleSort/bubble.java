package BubbleSort;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class bubble {
    public static void main(String[] args) {
        String str = "12345679";
        char[] char1 = {'1','2','3','4','5','6','7','8','9','0'};
        char[] char2 ;
        List ll = new LinkedList();
            char2 = str.toCharArray();
            Set set = new HashSet();

            for(int i = 0; i < char2.length; i++){
                set.add(char2[i]);
            }
            for(int j = 0; j < char1.length; j++){
                if(!set.contains(char1[j])){
                    ll.add(char1[j]);
                }
            }
            int[] arr = new int[ll.size()];
            for(int k = 0; k < ll.size(); k++){
                arr[k] = (char)ll.get(k) - '0';
            }

            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr.length - i - 1; j++){
                    if(arr[j] > arr[j+1]) {
                        int temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            String str1="";
            if(arr[0] == 0){
                for(int i = 1; i<arr.length;i++){
                    str1 = ""+1;
                }
                str1 += arr[0];
            }
            else{
                for(int i = 1; i<arr.length;i++){
                    str1 = ""+arr[i];
                }
            }
            System.out.println(str1);
    }
}
