public class Total {
    public static double total(double bill, double tipPercentage){
        return bill + (tipPercentage / 100 * bill);
    }
    public static void even(int[] num){
        for (int j : num) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
    }
}
