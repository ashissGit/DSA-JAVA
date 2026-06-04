//  first unique char in a string 

import java.util.Scanner;
import java.util.HashMap;
class main{
    public static char font(String s){
        int n= s.length();
        HashMap<Character, Integer> f = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            f.put(ch, f.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (f.get(ch) == 1) {
                return ch; 
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        String testStr = "leetcode";
        char index = font(testStr);
        
        System.out.println("The index of the first unique character is: " + index);
    }
}

