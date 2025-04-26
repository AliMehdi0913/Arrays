import java.util.Scanner;
class BillingApp {
    private int[][] stock = new int[2][2]; // { {1, 20}, {2, 25} }
    public void initializeStock() {
        stock[0][0] = 1; stock[0][1] = 20;
        stock[1][0] = 2; stock[1][1] = 25;    }
    public int calculateBill(int productCode, int quantity) {
        for (int[] product : stock) {
            if (product[0] == productCode) {
                return product[1] * quantity; }   }
        return 0;    }
    public void showInvoice(int productCode, int quantity, int totalBill) {
        System.out.println("Product Code: " + productCode);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill: " + totalBill);    }
    public static void main(String[] args) {
        BillingApp app = new BillingApp();
        app.initializeStock();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product code: ");
        int productCode = sc.nextInt();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        int bill = app.calculateBill(productCode, quantity);
        app.showInvoice(productCode, quantity, bill);    }}
