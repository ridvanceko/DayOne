public class TaskTwo {
    public static void main(String args[]) {

        int myAge = 29;
        float myHeight = 1.74f;
        int myWeight = 70;
        float height2 = myHeight*myHeight;

        System.out.println("I am " + myAge + " years old");
        System.out.println("My height is " + myHeight + " cm" );
        System.out.println("I am " + myWeight + " kg" );

      System.out.println("Body Max Index " + myWeight/height2);
}
}
