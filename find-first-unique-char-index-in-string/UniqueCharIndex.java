public class UniqueCharIndex{

    private int findIndex(String inputWord){
        String word = inputWord.toLowerCase();
        System.out.println("word: "+word);
        int index = -1;
        if(word.length()>0 && !word.equals(null) && !word.equals("")){
            int[] ch = new int[26];
            for(int i = 0;i<word.length();i++){
                ch[word.charAt(i) - 'a']++;
            }
            
            for(int i = 0;i<word.length();i++){
                if(ch[word.charAt(i) - 'a']==1){
                    index = i;
                    break;
                }
            }
        }
        return index;
    }
    public static void main(String[] args){
        int result = new UniqueCharIndex().findIndex("leetcode");
        if(result == -1){
            System.out.println("No unique character!");
        }else{
            System.out.println("Unique character found at index: "+result);
        }
    }
}