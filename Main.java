public class Main {
    public static void main(String[] args) {

        Main obj=new Main();
        obj.toUpperCase("Anwesh");
    }

    public static void toUpperCase(String str){
        String s = "";
        for(int i=0 ; i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                s += (char)(str.charAt(i)-32);
            }
            else{
                s += (char)str.charAt(i);
            }
        }
        System.out.println(s);
    }
}