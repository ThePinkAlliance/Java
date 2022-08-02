public class Buy5D {
    public static int FiveDCost = 5;
    public static int winnings5 = (int) Math.round(Math.random() * 50);
    public static void execute() {
        if (Main.prebalance >= FiveDCost) {
            Main.prebalance = Main.prebalance - FiveDCost;
            if (Main.winRandomizer >= 0 && Main.winRandomizer <= 90) {
                winnings5 = (int) Math.round(Math.random() * 50);
            } else if (Main.winRandomizer >= 91 && Main.winRandomizer <= 98) {
                winnings5 = (int) Math.round(Math.random() * 500);
            } else {
                winnings5 = (int) Math.round(Math.random() * 10000);
            }
            Main.prebalance = Main.prebalance + winnings5;
            Main.balance = Main.money.format(Main.prebalance);
            System.out.print("You now have ");
            System.out.println(Main.balance);
            Main.winRandomizer = (int) Math.round(Math.random() * 100);
        } else {
            System.out.println("You do not have enough money!");
        }
    }
}
