public class Buy2D {
    public static int TwoDCost = 2;
    public static int winnings2 = (int) Math.round(Math.random() * 25);
    public static void execute() {
        if (Main.prebalance >= TwoDCost) {
            Main.prebalance = Main.prebalance - TwoDCost;
            if (Main.winRandomizer >= 0 && Main.winRandomizer <= 90) {
                winnings2 = (int) Math.round(Math.random() * 25);
            } else if (Main.winRandomizer >= 91 && Main.winRandomizer <= 98) {
                winnings2 = (int) Math.round(Math.random() * 390);
            } else {
                winnings2 = (int) Math.round(Math.random() * 7000);
            }
            Main.prebalance = Main.prebalance + winnings2;
            Main.balance = Main.money.format(Main.prebalance);
            System.out.print("You now have ");
            System.out.println(Main.balance);
            Main.winRandomizer = (int) Math.round(Math.random() * 100);
        } else {
            System.out.println("You do not have enough money!");
        }
    }
}
