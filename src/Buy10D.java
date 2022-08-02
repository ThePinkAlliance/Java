public class Buy10D {
    public static int TenDCost = 10;
    public static int winnings10 = (int) Math.round(Math.random() * 100);
    public static void execute() {
        if (Main.prebalance >= TenDCost) {
            Main.prebalance = Main.prebalance - TenDCost;
            if (Main.winRandomizer >= 0 && Main.winRandomizer <= 90) {
                winnings10 = (int) Math.round(Math.random() * 100);
            } else if (Main.winRandomizer >= 91 && Main.winRandomizer <= 98) {
                winnings10 = (int) Math.round(Math.random() * 750);
            } else {
                winnings10 = (int) Math.round(Math.random() * 30000);
            }
            Main.prebalance = Main.prebalance + winnings10;
            Main.balance = Main.money.format(Main.prebalance);
            System.out.print("You now have ");
            System.out.println(Main.balance);
            Main.winRandomizer = (int) Math.round(Math.random() * 100);
        } else {
            System.out.println("You do not have enough money!");
        }
    }
}
