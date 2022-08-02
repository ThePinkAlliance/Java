public class Buy100D {
    public static int HundredDCost = 100;
    public static int winnings100 = (int) Math.round(Math.random() * 2000);
    public static void execute() {
        if (Main.prebalance >= HundredDCost) {
            Main.prebalance = Main.prebalance - HundredDCost;
            if (Main.winRandomizer >= 0 && Main.winRandomizer <= 90) {
                winnings100 = (int) Math.round(Math.random() * 2000);
            } else if (Main.winRandomizer >= 91 && Main.winRandomizer <= 98) {
                winnings100 = (int) Math.round(Math.random() * 10000);
            } else {
                winnings100 = (int) Math.round(Math.random() * 800000);
            }
            Main.prebalance = Main.prebalance + winnings100;
            Main.balance = Main.money.format(Main.prebalance);
            System.out.print("You now have ");
            System.out.println(Main.balance);
            Main.winRandomizer = (int) Math.round(Math.random() * 100);
        } else {
            System.out.println("You do not have enough money!");
        }
    }
}
