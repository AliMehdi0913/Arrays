import java.util.Scanner;
class AveragePurchase {
    private final double[] purchases;
    public AveragePurchase(int n) {
        purchases = new double[n];   }
    public void takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + purchases.length + " purchases:");
        for (int i = 0; i < purchases.length; i++) {
            purchases[i] = sc.nextDouble();  }  }
    public void displayPurchases() {
        System.out.println("Purchased Items:");
        for (double item : purchases) {
            System.out.println(item);   }   }
    public double calculateAverage() {
        double sum = 0;
        for (double item : purchases) {
            sum += item;   }
        return sum / purchases.length;}
    public static void main(String[] args) {
        AveragePurchase ap = new AveragePurchase(3);
        ap.takeInput();
        ap.displayPurchases();
        System.out.println("Average Purchase: " + ap.calculateAverage());   }}
