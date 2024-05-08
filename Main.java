public class Main {
    public static void main(String[] args) {
        System.out.println(tc01CheckEmpty());
        System.out.println(tc02CheckSpecialCharacter());
        System.out.println(tc03CheckNumbers());
        System.out.println(tc04CheckAlphabitsWithNumbersSpecialCharacters());
        System.out.println(tc05CheckAllLowerAlphabets());
        System.out.println(tc06CheckSingleCharacter());
        System.out.println(tc07CheckNull());
    }

    public static String toUpperCase(String str){
        String s = "";

        for(int i=0 ; i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                s += (char)(str.charAt(i)-32);
            }
            else{
                s += (char)str.charAt(i);
            }
        }
        return s;
    }

    public static boolean tc01CheckEmpty(){
        String input =" ";
        String expected=" ";
        return toUpperCase(input).equals(expected);
    }

    public static boolean tc02CheckSpecialCharacter(){
        String input="@#$%^";
        String expected="@#$%^";
        return toUpperCase(input).equals(expected);

    }

    public static boolean tc03CheckNumbers(){
        String input="123456789";
        String expected="123456789";
        return toUpperCase(input).equals(expected);
    }

    public static boolean tc04CheckAlphabitsWithNumbersSpecialCharacters(){
        String input="abc1234@";
        String expected="ABC1234@";
        return toUpperCase(input).equals(expected);
    }

    public static boolean tc05CheckAllLowerAlphabets(){
        String input="abcd";
        String expected="ABCD";
        return toUpperCase(input).equals(expected);
    }

    public static boolean tc06CheckSingleCharacter(){
        String input="c";
        String expected="C";
        return toUpperCase(input).equals(expected);
    }

    public static boolean tc07CheckNull(){
        String input=null;
        String expected="Null pointer Exception";
        return toUpperCase(input).equals(expected);
    }
}