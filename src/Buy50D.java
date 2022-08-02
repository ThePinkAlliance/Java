public class Buy50D {
    public static int FiftyDCost = 50;
    public static int winnings50 = (int) Math.round(Math.random() * 1000);
    public static void execute() {
        if (Main.prebalance >= FiftyDCost) {
            Main.prebalance = Main.prebalance - FiftyDCost;
            if (Main.winRandomizer >= 0 && Main.winRandomizer <= 90) {
                winnings50 = (int) Math.round(Math.random() * 1000);
            } else if (Main.winRandomizer >= 91 && Main.winRandomizer <= 98) {
                winnings50 = (int) Math.round(Math.random() * 2000);
            } else {
                winnings50 = (int) Math.round(Math.random() * 100000);
            }
            Main.prebalance = Main.prebalance + winnings50;
            Main.balance = Main.money.format(Main.prebalance);
            System.out.print("You now have ");
            System.out.println(Main.balance);
            Main.winRandomizer = (int) Math.round(Math.random() * 100);
        } else {
            System.out.println("You do not have enough money!");
        }
    }
}
