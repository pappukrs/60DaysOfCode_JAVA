
package Pappu.DAY8;

public class StringLengthExample{

    public static int stringLength(String str){
        if(str.equals("")) return 0;

        return 1+stringLength(str.substring(1)) ;
    }

    public static void main(String[] args){
        String str = "cheatercheater";
        int length = stringLength(str);
        System.out.println(length);
    }
}
