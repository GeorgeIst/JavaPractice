package project.middleCharFromString;

public class MiddleCharFromString {
    public static void main(String[] args) {
      String testString = "aaafbaaa";
      displayMiddleChar(testString);


    }

    private static void displayMiddleChar(String testString) {
        int lenght = testString.length();
        System.out.println("String length " + lenght);
        if(lenght%2!=0){
            int position = lenght/2;
            System.out.println("Middle Character is " + testString.charAt(position));

        }else{
            char c2 = testString.charAt(lenght/2);
            char c1 = testString.charAt(lenght/2-1);
            System.out.println(String.valueOf(c1)+String.valueOf(c2));

        }
    }


}
