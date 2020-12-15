public class TaskFour {

    public static void main(String args[]) {

        int meter = 1;
        float foot = 0.3048f;
        int centiMeter = 1000;


        meter = 5;

        System.out.println(meter);
        System.out.println(foot);
        System.out.println(centiMeter);

        System.out.println("5 meter = " + meter*foot + "foot");
        System.out.println("5 meter = " + meter*centiMeter + " centimeter");
    }
}
