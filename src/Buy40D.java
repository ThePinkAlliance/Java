public class Buy40D {
    public static int FortyDCost = 40;
    public static int winnings40 = (int) Math.round(Math.random() * 820);
    public static void execute() {
        if (Main.prebalance >= FortyDCost) {
            Main.prebalance = Main.prebalance - FortyDCost;
            if (Main.winRandomizer >= 0 && Main.winRandomizer <= 90) {
                winnings40 = (int) Math.round(Math.random() * 820);
            } else if (Main.winRandomizer >= 91 && Main.winRandomizer <= 98) {
                winnings40 = (int) Math.round(Math.random() * 1800);
            } else {
                winnings40 = (int) Math.round(Math.random() * 86000);
            }
            Main.prebalance = Main.prebalance + winnings40;
            Main.balance = Main.money.format(Main.prebalance);
            System.out.print("You now have ");
            System.out.println(Main.balance);
            Main.winRandomizer = (int) Math.round(Math.random() * 100);
        } else {
            System.out.println("You do not have enough money!");
        }
    }
}
