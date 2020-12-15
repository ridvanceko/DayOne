import java.sql.SQLOutput;

public class RemainderPractice2 {

    public static void main(String [] args) {


        short phonePrice=687;

        int monthlyPayment = phonePrice/15;

        System.out.println(monthlyPayment);



        //how can we find out last month payment if I pay $100 each month
        int lastMonthPayment = phonePrice%100;
        System.out.println(lastMonthPayment);
    }
}
