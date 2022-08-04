public class Buy100D {
    public static int HundredDCost = 100;
    public static int winnings100 = (int) Math.round(Math.random() * 2000);
    public static void execute() {
        if (Main.prebalance >= HundredDCost) {
            Main.prebalance = Main.prebalance - HundredDCost;
            if (Main.winRandomizer >= 0 && Main.winRandomizer <= 85) {
                winnings100 = (int) Math.round(Math.random() * 2000);
            } else if (Main.winRandomizer >= 86 && Main.winRandomizer <= 93) {
                winnings100 = (int) Math.round(Math.random() * 10000);
            } else  if (Main.winRandomizer >= 94 && Main.winRandomizer <= 96) {
                winnings100 = (int) Math.round(Math.random() * 800000);
            } else {
                if (Kidnap.hasKnife) {
                    System.out.println("While shopping, the store was robbed and he pointed his weapon at you!");
                    System.out.println("However, you remember that you still have a knife, and you defend yourself, successfully defeating the robber!");
                } else {
                    System.out.println("While shopping, the store was robbed and you were shot!");
                    Main.isDead = true;
                    Dead.execute();
                    System.exit(1);
                }
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
