public class Buy60D {
    public static int SixtyDCost = 60;
    public static int winnings60 = (int) Math.round(Math.random() * 1340);
    public static void execute() {
        if (Main.prebalance >= SixtyDCost) {
            Main.prebalance = Main.prebalance - SixtyDCost;
            if (Main.winRandomizer >= 0 && Main.winRandomizer <= 90) {
                winnings60 = (int) Math.round(Math.random() * 1340);
            } else if (Main.winRandomizer >= 91 && Main.winRandomizer <= 98) {
                winnings60 = (int) Math.round(Math.random() * 2750);
            } else {
                winnings60 = (int) Math.round(Math.random() * 220000);
            }
            Main.prebalance = Main.prebalance + winnings60;
            Main.balance = Main.money.format(Main.prebalance);
            System.out.print("You now have ");
            System.out.println(Main.balance);
            Main.winRandomizer = (int) Math.round(Math.random() * 100);
        } else {
            System.out.println("You do not have enough money!");
        }
    }
}
