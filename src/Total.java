public class Total {
    public static double total(double bill, double tipPercentage){
        return bill + (tipPercentage / 100 * bill);
    }
    public static void even(int[] num){
        for (int i : num) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
