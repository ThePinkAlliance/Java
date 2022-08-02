import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static NumberFormat money = NumberFormat.getCurrencyInstance();
    public static int prebalance = 10;
    public static int pregoal = 1000000;
    public static int winRandomizer = (int) Math.round(Math.random() * 100);
    public static String balance = money.format(prebalance);
    public static String goal = money.format(pregoal);
    public static void main(String[] args) {

        boolean NewGSBought = false;
        int NGSCost = 500;

        do {
            if (prebalance > 0) {
            System.out.println("You'd lost it all. But now at least, you have " + balance + ". You know that you must purchase scratch-offs and earn back the " + goal + " that you lost.");
            System.out.println("You enter a gas-station, and find 6 scratch-offs. Which do you choose?");
            if (NewGSBought) {
                System.out.println("[1]. Buy $2 scratch-off");
                System.out.println("[2]. Buy $10 scratch-off");
                System.out.println("[3]. Buy $20 scratch-off");
                System.out.println("[4]. Buy $40 scratch-off");
                System.out.println("[5]. Buy $60 scratch-off");
                System.out.println("[6]. Buy $100 scratch-off");
                System.out.print("I'll choose: ");
            } else {
                System.out.println("[1]. Buy $1 scratch-off");
                System.out.println("[2]. Buy $5 scratch-off");
                System.out.println("[3]. Buy $10 scratch-off");
                System.out.println("[4]. Buy $20 scratch-off");
                System.out.println("[5]. Buy $30 scratch-off");
                System.out.println("[6]. Buy $50 scratch-off");
                System.out.println("[7]. Buy taxi to new gas station ($500)");
                System.out.print("I'll choose: ");
            }
            byte answer = Byte.parseByte(scanner.next());
            if (answer == 1) {
                if (NewGSBought) {
                    Buy2D.execute();
                } else {
                    Buy1D.execute();
                }
            } else if (answer == 2) {
                if (NewGSBought) {
                    Buy10D.execute();
                } else {
                    Buy5D.execute();
                }
            } else if (answer == 3) {
                if (NewGSBought) {
                    Buy20D.execute();
                } else {
                    Buy10D.execute();
                }
            } else if (answer == 4) {
                if (NewGSBought) {
                    Buy40D.execute();
                } else {
                    Buy20D.execute();
                }
            } else if (answer == 5) {
                if (NewGSBought) {
                    Buy60D.execute();
                } else {
                    Buy30D.execute();
                }
            } else if (answer == 6) {
                if (NewGSBought) {
                    Buy100D.execute();
                } else {
                    Buy50D.execute();
                }
            } else if (answer == 7){
                if (NewGSBought) {
                    System.out.println("No valid option selected.");
                } else {
                    if (prebalance >= NGSCost) {
                        System.out.println("You made it to the new gas station!");
                        prebalance = prebalance - NGSCost;
                        balance = money.format(prebalance);
                        NewGSBought = true;
                    } else {
                        System.out.println("You do not have enough money!");
                    }
                }
            } else {
                System.out.println("No valid option selected.");
            }
            } else {
                break;
            }
        } while (prebalance < pregoal);
        if (prebalance > 0) {
            Win.execute();
        } else {
            Lose.execute();
        }
    }

}