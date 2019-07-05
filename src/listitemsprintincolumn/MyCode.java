package listitemsprintincolumn;

// package whatever; // don't place package name!
/*
  @author:Pranav Kapoor
*/
import java.util.*;

class MyCode{
	private void toolBxIt(String[] words){
		String[] myWords = words;
        Arrays.sort(myWords);
        int columns = 3;
        int rows = rows((double)myWords.length/3);
        for(int i = 0; i < rows; i++) {
        	createRows(i, myWords, rows, columns);
        	System.out.println();
        }
    }
	private void createRows(int i, String[] words, int rows, int columns) {
		int initRows = 0;
		for(int k = 0;k<columns;k++) {
			for(int j = 0; j <1; j++) {
				if(i+initRows<words.length) {
					System.out.print(words[i+initRows] + " ");
					  if(k==columns-1 && (i+initRows+1)==words.length-1 && (i+initRows+1)%3==0) { 
						  System.out.println();
						  System.out.print("  "+"  "+words[i+initRows+1] + " "); }
					}
				
				initRows+=rows;
	    	}
		}	
		
	}
	
	private int rows(double doubleNumber) {
		String doubleAsString = String.valueOf(doubleNumber);
		int indexOfDecimal = doubleAsString.indexOf(".");
		int rows = Integer.parseInt(doubleAsString.substring(0, indexOfDecimal));
		double decimalPart = Double.parseDouble(doubleAsString.substring(indexOfDecimal));
		return decimalPart>0.5?rows+1:rows;
	}
	

    public static void main(String[] args){
		/* 
    
    Input from console doesn't seem supported by codeinterview.io 
    The same code can be used on any jvm by uncommenting the bellow commented code for console input.
    */
		Scanner in = new Scanner(System.in);
		System.out.println("enter words separated by spaces");
        String line = "";
        if(in.hasNextLine()){line =  in.nextLine();}
        String[] words = line.split(" ");
        //String[] words = {"cat", "caterpillar", "pie", "frog", "elephant", "pizza"};
		new MyCode().toolBxIt(words);
		in.close();
    }
}
