import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] tokens = {"(", "x + y", ")", " * 5"};
        Delimiters a = new Delimiters("(", ")");
        System.out.println(a.getDelimitersList(tokens));        // test case 1
        String[] tokens2 = {"<q>", "yy", "</q>", "z", "</q>"};
        a = new Delimiters("<q>", "</q>");
        System.out.println(a.getDelimitersList(tokens2));       // test case 2
        
        String open = "<sup>";
        String close = "</sup>";
        a = new Delimiters(open, close);
        ArrayList<String> delimiters = new ArrayList<String>();
        String[] delims = {open, open, close, open, close, close};
        for(String x : delims) {
            delimiters.add(x);
        }
        System.out.println(a.isBalanced(delimiters));       // test case 3

        delimiters.clear();
        String[] delims2 = {open, close, close, open};
        for(String x : delims2) {
            delimiters.add(x);
        }
        System.out.println(a.isBalanced(delimiters));      // test case 4

        delimiters.clear();
        String[] delims3 = {close};
        for(String x : delims3) {
            delimiters.add(x);
        }
        System.out.println(a.isBalanced(delimiters));      // test case 5

        delimiters.clear();
        String[] delims4 = {open, open, close};
        for(String x : delims4) {
            delimiters.add(x);
        }
        System.out.println(a.isBalanced(delimiters));       // test case 6
    }
}