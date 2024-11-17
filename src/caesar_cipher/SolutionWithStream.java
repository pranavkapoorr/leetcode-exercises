package caesar_cipher;

import java.util.stream.Collectors;

/***
 * Caesar Cypher implmentation basd on given
 * string iText
 * int orient
 * int k
 * will output the encrypted_string
 * ****/
public class SolutionWithStream {
    private static String cc_encryptor(String iText,int orient, int k){
        if(iText == null || iText.isEmpty()){
            return "";
        }

        return iText.chars()
                        .map(ch -> {
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
                                return (char)(base + shift);
                            }else{
                                return ch; //if non char just append it as it is
                            }
                        })
                        .mapToObj(ch -> (char) ch)
                        .map(String::valueOf)
                        .collect(Collectors.joining());

    }

    public static void main(String[] args){
        System.out.println("efg -> " + cc_encryptor("efg",1,4));
        System.out.println("XYz -> " + cc_encryptor("XYz",2,2));
    }
}
