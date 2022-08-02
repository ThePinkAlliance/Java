public class Buy30D {
    public static int ThirtyDCost = 30;
    public static int winnings30 = (int) Math.round(Math.random() * 650);
    public static void execute() {
        if (Main.prebalance >= ThirtyDCost) {
            Main.prebalance = Main.prebalance - ThirtyDCost;
            if (Main.winRandomizer >= 0 && Main.winRandomizer <= 90) {
                winnings30 = (int) Math.round(Math.random() * 650);
            } else if (Main.winRandomizer >= 91 && Main.winRandomizer <= 98) {
                winnings30 = (int) Math.round(Math.random() * 1400);
            } else {
                winnings30 = (int) Math.round(Math.random() * 70000);
            }
            Main.prebalance = Main.prebalance + winnings30;
            Main.balance = Main.money.format(Main.prebalance);
            System.out.print("You now have ");
            System.out.println(Main.balance);
            Main.winRandomizer = (int) Math.round(Math.random() * 100);
        } else {
            System.out.println("You do not have enough money!");
        }
    }
}
