public class Buy20D {
    public static int TwentyDCost = 20;
    public static int winnings20 = (int) Math.round(Math.random() * 250);
    public static void execute() {
        if (Main.prebalance >= TwentyDCost) {
            Main.prebalance = Main.prebalance - TwentyDCost;
            if (Main.winRandomizer >= 0 && Main.winRandomizer <= 90) {
                winnings20 = (int) Math.round(Math.random() * 250);
            } else if (Main.winRandomizer >= 91 && Main.winRandomizer <= 98) {
                winnings20 = (int) Math.round(Math.random() * 1000);
            } else {
                winnings20 = (int) Math.round(Math.random() * 50000);
            }
            Main.winRandomizer = (int) Math.round(Math.random() * 100);
            if (Main.winRandomizer >= 0 && Main.winRandomizer <= 20) {
                Buy20D.karen();
            } else {
                Main.prebalance = Main.prebalance + winnings20;
                Main.balance = Main.money.format(Main.prebalance);
                System.out.print("You now have ");
                System.out.println(Main.balance);
                Main.winRandomizer = (int) Math.round(Math.random() * 100);
            }
        } else {
            System.out.println("You do not have enough money!");
        }
    }
    public static void karen() {
        System.out.println("While shopping, a karen in front of you is berating the cashier!");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Main.prebalance = Main.prebalance + winnings20;
        Main.balance = Main.money.format(Main.prebalance);
        System.out.print("You now have ");
        System.out.println(Main.balance);
        Main.winRandomizer = (int) Math.round(Math.random() * 100);
    }
}
