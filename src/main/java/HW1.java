public class HW1 {

    public static double moneyToReturn(int DaysTillReturn) {

        int Price = 1000;
        double ReturnSum = 0;

        if (DaysTillReturn >= 10) {
            ReturnSum = Price;
        } else if (DaysTillReturn < 10 && DaysTillReturn >= 5) {
            ReturnSum = Price * 0.8;
        } else if (DaysTillReturn < 5 && DaysTillReturn < 1) {
            ReturnSum = Price * 0.6;
        } else if (DaysTillReturn >= 0 && DaysTillReturn <= 1) {
            ReturnSum = Price * 0.2;
        } else {

            System.out.println("go home");
        }
        return  ReturnSum;
    }


}
