package Longest_Palindrome;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        String s = "abecccdd";
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) set.remove(c);
            else set.add(c);
        }

        int remove = set.size();
        if (remove > 0)
            remove -= 1;
        System.out.println(s.length() - remove);
    }
}
