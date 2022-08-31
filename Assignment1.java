//Question 1 : First Letter Printer
//provided with a string and returns a string with the first letter of every word in the string.


import java.util.Scanner;


class FirstLetterPrinter {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("enter string : ");
        String input = in.nextLine();
            System.out.println(firstLetterPrinter(input));
        

    }

    public static String firstLetterPrinter(String input) { //taking input from main method and writing logic
        String myStr = "";
        char outValue;

        String[] letterString = input.split(" ");  //Sentence with spaces is splitted and returned in String Array;

        for (int i = 0; i < letterString.length; i++ ) {
            outValue = letterString[i].charAt(0);    //CharAt(0) gives first character of the word;
            myStr+= Character.toString(outValue);    
        } 

        return myStr; // returns String with frst character in each word;
        
    } 
}
