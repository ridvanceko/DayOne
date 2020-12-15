import java.sql.SQLOutput;

public class MuyltiplyNumber {

    public static void main(String [] args) {
        int number=57884;

        // NOTE: if you want to get the digits from your number
        //you need to find remainder with 10 and divide with 10

        //TASK: find multiplication of all digits from given number

        int first=number%10;  //4

        number=number/10;



        int second=number%10;  //8

        number = number/10;



        int third=number%10;  //8
        number=number/10;



        int forth=number%10;  //7
        number=number/10;


        int fifth=number%10; //5




        int multiply=first*second*third*forth*fifth;
        System.out.println(multiply);

    }
}
