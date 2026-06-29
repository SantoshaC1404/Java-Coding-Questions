package numbers;

public class LeapYear {
    public static void main(String[] args) {
        boolean leapYear = isLeapYear(2004);
        if (leapYear) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }
}
