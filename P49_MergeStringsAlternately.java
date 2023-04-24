package com.exchange;

public class P49_MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int n=Math.max(word1.length(),word2.length());
        for (int i=0;i<n;i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        return sb.append(word1.substring(n)).append(word2.substring(n)).toString();
    }

    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
        System.out.println(mergeAlternately(word1,word2));
    }
}
