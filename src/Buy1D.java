public class Buy1D {
    public static int OneDCost = 1;
    public static int winnings1 = (int) Math.round(Math.random() * 10);
    public static void execute() {
        if (Main.prebalance >= OneDCost) {
            Main.prebalance = Main.prebalance - OneDCost;
            if (Main.winRandomizer >= 0 && Main.winRandomizer <= 90) {
                winnings1 = (int) Math.round(Math.random() * 10);
            } else if (Main.winRandomizer >= 91 && Main.winRandomizer <= 98) {
                winnings1 = (int) Math.round(Math.random() * 275);
            } else {
                winnings1 = (int) Math.round(Math.random() * 5000);
            }
            Main.prebalance = Main.prebalance + winnings1;
            Main.balance = Main.money.format(Main.prebalance);
            System.out.print("You now have ");
            System.out.println(Main.balance);
            Main.winRandomizer = (int) Math.round(Math.random() * 100);
        } else {
            System.out.println("You do not have enough money!");
        }
    }
}
