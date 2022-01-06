import java.util.*; 
import java.io.*;
import java.util.HashMap;

class Main {

  public static String MinWindowSubstring(String[] strArr) {
    // code goes here  
    String base = strArr[0];
    String cmp = strArr[1];
    int min = Integer.MAX_VALUE;
    String result = "";

    for (int i = 0; i < base.length(); i++) {
        StringBuilder match = new StringBuilder (cmp);
        for (int j = i; j < base.length(); j++) {
            String chr = String.valueOf(base.charAt(j));
            // if (match.toString().contains(chr)) {
                int index = match.indexOf(String.valueOf(chr));
                if (index != -1) match.replace(index, index + 1, "");
                if (match.length() == 0) {
                    if (j - i < min) {
                        min = j - i;
                        result = base.substring(i, j + 1);
                        break;
                    }
                }
        }
    }
    return result;
    
  }

  public static void main (String[] args) {  
    // keep this function call here     
    // Scanner s = new Scanner(System.in);
    System.out.println(MinWindowSubstring(new String[] {"aaabaaddae", "aed"})); 
    // System.out.print(MinWindowSubstring(new String[] {"ahffaksfajeeubsne", "jefaa"}));
  }

}