package caesar_cipher;

/***
 * Caesar Cypher implmentation basd on given
 * string iText
 * int orient
 * int k
 * will output the encrypted_string
 * ****/
public class Solution {
    private static String cc_encryptor(String iText,int orient, int k){
        if(iText == null || iText.isEmpty()){
            return "";
        }
        StringBuilder res = new StringBuilder();

        for(char ch : iText.toCharArray()){
            if(Character.isLetter(ch)){
                //calc base based on upperCase or lowerCase
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                //calculate offset from the base
                int offset = ch - base;
                //calculate initial shift from initial location based on orient
                int shift = (orient == 1) ? (offset - k) : (offset + k);
                //adjust the shift so that it's contained on original letter bounds
                shift = ((shift % 26) + 26) % 26;
                //append new calculated char based on new location from base
                res.append((char)(base + shift));
            }else{
                res.append(ch); //if non char just append it as it is
            }
        }
        return res.toString();
    }

    public static void main(String[] args){
        System.out.println("efg -> " + cc_encryptor("efg",1,4));
        System.out.println("XYz -> " + cc_encryptor("XYz",2,2));
    }
}
