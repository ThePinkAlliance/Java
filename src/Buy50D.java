public class Buy50D {
    public static int FiftyDCost = 50;
    public static int winnings50 = (int) Math.round(Math.random() * 1000);
    public static void execute() {
        if (Main.prebalance >= FiftyDCost) {
            Main.prebalance = Main.prebalance - FiftyDCost;
            if (Main.winRandomizer >= 0 && Main.winRandomizer <= 85) {
                winnings50 = (int) Math.round(Math.random() * 2000);
            } else if (Main.winRandomizer >= 86 && Main.winRandomizer <= 93) {
                winnings50 = (int) Math.round(Math.random() * 10000);
            } else  if (Main.winRandomizer >= 94 && Main.winRandomizer <= 96) {
                winnings50 = (int) Math.round(Math.random() * 800000);
            } else {
                System.out.println("While sitting outside scratching your lottery ticket, a hooded man grabbed you, taking you into his van!");
                Kidnap.driving();
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
