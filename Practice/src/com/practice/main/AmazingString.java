package com.practice.main;

public class AmazingString {
	public static int solve(String A) {
        int l = A.length();
        int count = 0;
        for(int i=0;i<l;i++){
            if(checkSpecialCharacter(A.charAt(i))){
               count = l-i+count; 
            }
        }
        return (count%10003);
    }
    
    public static boolean checkSpecialCharacter(char ch){
        if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch =='O' || ch =='U'){
        return true;
      }
      return false;
    }
    public static void main(String args[]) {
    	System.out.println(solve("pGpEusuCSWEaPOJmamlFAnIBgAJGtcJaMPFTLfUfkQKXeymydQsdWCTyEFjFgbSmknAmKYFHopWceEyCSumTyAFwhrLqQXbWnXSn"));
    }
}
