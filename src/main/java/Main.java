import java.util.ArrayList;

public class Main {
    public  static String longestCommonPrefix1(String[] strs) {
        String tempStr = "";
        int i , j , k ;
        int subst = 1;
        int counter = 0 ;
        int l = 0 ;
        ArrayList<String> tempCharL = new ArrayList<String>() ;
        i = 0 ;
        j = 1 ;
        k = 0 ;
        l = 0 ;
        subst = 1;
        tempStr = "" ;
        boolean control = true ;
        if(strs.length >1 ){
            int minLenght = strs[0].length() ;
            for(i = 1 ; i<strs.length ; i++){
                if(strs[i].length() < minLenght){
                    minLenght = strs[i].length() ;
                }
            }
            for(i =0 ;minLenght>0 ; minLenght --,i++){
                if(control){
                    if(strs[0].charAt(i) == strs[1].charAt(i)){
                        tempCharL.add(String.valueOf(strs[0].charAt(i))) ;
                        l ++ ;
                    }
                    else {
                        control =false;
                    }} }
            tempStr = "";
            for(i = 0 ; tempCharL.size() > i; i++){
                tempStr = tempStr + tempCharL.get(i) ; }
            for(i = 2 ; i<strs.length; i++){
                if(strs[i].contains(tempStr)&& strs[i].substring(0,tempStr.length()).equals(tempStr)){
                }
                else {
                    if(counter< strs.length){
                        tempStr = "" ;
                        for(i = 0 ; (tempCharL.size()-subst) > i; i++){
                            tempStr = tempStr + tempCharL.get(i) ;
                        }
                        subst ++ ;
                        i =1 ;
                    }
                    counter ++ ;
                }    } }
        else{
            if(strs.length > 0){
                tempStr = strs[0] ;
            }else {
                tempStr = "" ;
            }    }
        return tempStr;
    }


public static String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++)
        while (strs[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length() - 1);
            if (prefix.isEmpty()) return "";
        }
    return prefix;
}
    public static void main(String[] args){
        String[] strs =  {"bar","barb","bar","bcbcbar"} ;
        System.out.println(longestCommonPrefix(strs));
    }

}
