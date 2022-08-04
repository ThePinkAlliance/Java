public class Kidnap {
    public static boolean hasKnife = false;
    public static boolean handsFree = false;
    public static boolean isAngry = false;
    public static void driving() {
        hasKnife = false;
        System.out.println("You wake up in the back of a van with your hands tied up.");
        System.out.println("You look around desperately, trying to find a way to escape. You spot the back door, a knife in the back pocket of one of your kidnappers, and a small sunroof.");
        System.out.println("After assesing your options, you come to a decision.");
        System.out.println("1. Grab the kinfe");
        System.out.println("2. Try to open the backdoor");
        System.out.println("3. Try to escape through the sunroof");
        System.out.println("4. Scream for help");
        System.out.println("5. Wait");
        System.out.print("I'll do: ");
        byte choice1 = Byte.parseByte(Main.scanner.next());
        if (choice1 == 1) {
            Main.winRandomizer = (int) Math.round(Math.random() * 100);
            if (Main.winRandomizer >= 0 && Main.winRandomizer <= 60) {
                System.out.println("Success! You now have a knife!");
                hasKnife = true;
                System.out.println("With your new knife in hand, you decide your next move.");
                System.out.println("1. Cut binds");
                System.out.println("2. Scream for help");
                System.out.println("3. Wait");
                System.out.print("I'll do: ");
                byte choice2 = Byte.parseByte(Main.scanner.next());
                if (choice2 == 1) {
                    handsFree = true;
                    System.out.println("Your hands are now free!");
                    System.out.println("What will you do now?");
                    System.out.println("1. Attempt to take over the van");
                    System.out.println("2. Try to open the backdoor");
                    System.out.println("3. Try to escape through the sunroof");
                    System.out.println("4. Scream for help");
                    System.out.println("5. Wait");
                    System.out.print("I'll do: ");
                    byte choice3 = Byte.parseByte(Main.scanner.next());
                    if (choice3 == 1) {
                        Main.winRandomizer = (int) Math.round(Math.random() * 100);
                        if (Main.winRandomizer >= 0 && Main.winRandomizer <= 90) {
                            Kidnap.noticed();
                        } else {
                            System.out.println("You successfully defeated your kidnappers, and you escaped!");
                        }
                    } else if (choice3 == 2) {
                        System.out.println("The backdoor was unlocked, allowing you to escape!");
                    } else if (choice3 == 3) {
                        System.out.println("The sunroof is locked!");
                        Kidnap.noticed();
                    } else if (choice3 == 4) {
                        Kidnap.noticed();
                    } else {
                        System.out.println("The kidnapper saw that you're hands are untied, and he shot you!");
                        Dead.execute();
                        System.exit(1);
                    }
                } else if (choice2 == 2) {
                    Kidnap.noticed();
                } else {
                    Kidnap.prison();
                }
            } else {
                Kidnap.noticed();
            }
        } else if (choice1 == 2) {
            System.out.println("You're hands are tied!");
            Kidnap.driving();
        } else if (choice1 == 3) {
            System.out.println("You're hands are tied!");
        } else if (choice1 == 4) {
            Kidnap.noticed();
        } else {
            Kidnap.prison();
        }
    }
    public static void noticed() {
        System.out.println("The kidnapper noticed you, and he shot you!");
        Dead.execute();
        System.exit(1);
    }
    public static void prison() {
        System.out.println("You awake in a cold cell. Your hands are now free.");
        System.out.println("You study the cell, trying to find a means of escape. You find a window leading outside with cold, metal bars, and the cell door, leading to a dark hallway.");
        System.out.println("What do you do?");
        System.out.println("1. Try to escape through the window");
        System.out.println("2. Try to open the door");
        System.out.println("3. Wait");
        byte choice1 = Byte.parseByte(Main.scanner.next());
        if (choice1 == 1) {
            if (hasKnife) {
                System.out.println("You try to open the window with no success, then you realize that you still have the knife!");
                System.out.println("Using the knife, you chip at the bars, eventually breaking them.");
                System.out.println("With a new opening, you escape!");
            } else {
                System.out.println("You try to break the bars, but they're too strong.");
                Kidnap.noticed();
            }
        } else if (choice1 == 2) {
            if (isAngry) {
                System.out.println("The kidnapper gets angry from the noise you're making, and shoots you!");
                Dead.execute();
                System.exit(1);
            } else {
                System.out.println("You try to open the door, but it's locked!");
                isAngry = true;
                Kidnap.prison();
            }
        } else {
            System.out.println("You await you're eventual demise.");
            Main.winRandomizer = (int) Math.round(Math.random() * 100);
            if (Main.winRandomizer >= 0 && Main.winRandomizer <= 60) {
                System.out.println("Your kidnappers finally decide that you're no use to them, and they shoot you!");
                Dead.execute();
                System.exit(1);
            } else {
                System.out.println("The building you were trapped in was raided by the police, allowing you to escape!");
                System.out.println("In addtition, you were compensated $10,000 for your troubles!");
                Main.prebalance = Main.prebalance + 10000;
            }
        }
    }
}
