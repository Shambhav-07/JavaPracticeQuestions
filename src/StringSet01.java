//String Problems ( Basic to Advanced - Set 01 )
//
//        1.Print a string.
//        2.Find length of a string.
//        3.Convert string to uppercase.
//        4.Convert string to lowercase.
//        5.Compare two strings.
//        6.Concatenate two strings.
//        7.Check if string is empty.
//        8.Get character at given index.
//        9.Find index of character.
//        10.Replace characters in string.
public class StringSet01 {
    public static String printAString(String str){
      return str;
    }
    public static int lengthOfAString(String str){
        return str.length();
    }

    public static void convertToUppercase(String str){
        System.out.println(str.toUpperCase());
    }
    public static void convertToLowercase(String str){
        System.out.println(str.toLowerCase());
    }

    public static void compareString(String str1, String str2){
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }

    public static String concatenateTwoString(String str1, String str2){
        return str1+str2;
    }
    public static void checkStringISEmpty(String str){
        if (str.length()==0){
            System.out.println("String is empty");
        }else {
            System.out.println("String is not empty");
        }
    }

    public static char getChar (String str, int idx){
        char ch = str.charAt(idx);
        return ch;
    }

    public static int getIdx(String str, char ch){
        return str.indexOf(ch);
    }
    public static String replaceChar(String str){
      return str.replace('H','N');

    }
    public static void main(String[] args) {
        String str =  "Hello World";
        String str1 = "Apple";
        String str2 = "apple";
        System.out.println(printAString("Hello World"));
        System.out.println(lengthOfAString(str));
        convertToUppercase(str);
        convertToLowercase(str);
        compareString(str1,str2);
        System.out.println(concatenateTwoString(str1,str2));
        checkStringISEmpty(str);
        System.out.println( getChar(str,2));
        System.out.println(getIdx(str,'H'));
        System.out.println(replaceChar(str));
    }
}
