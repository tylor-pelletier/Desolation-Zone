import java.util.Scanner;

public class Story {

    static Scanner sc = new Scanner(System.in);

    static int wood = 0;
    static int rocks = 0;
    static int food = 0;
    static int arrows = 0;

    static int a;
    static String mountainOrCave;
    static int b;
    static String upOrDown;
    static int goUpTheMountain;
    static int c;
    static String upOrHome;
    static String checkoutOrHome;


    public static void main(String[] args) {

        // Desolation Zone Adventure Game

        System.out.println("                                                                             -- Desolation Zone --                                                  ");
        System.out.println("                                                                                                                                                    ");
        System.out.println("                              ======      ==========     ====       ======    ====            ==      ==========  ==========    ======    ===    ===");
        System.out.println("                              =========   ==========   =========   ========   ====           ====     ==========  ==========   ========   ====   ===");
        System.out.println("                              ===    ===  ===         ===    ===  ====  ====  ====           ====        ====        ====     ====  ====  =====  ===");
        System.out.println("                              ===    ===  ==========   =====      ===    ===  ====          ======       ====        ====     ===    ===  ====== ===");
        System.out.println("                              ===    ===  ==========     =====    ===    ===  ====          ==  ==       ====        ====     ===    ===  === ======");
        System.out.println("                              ===    ===  ===         ===   ====  ====  ====  ====         ========      ====        ====     ====  ====  ===  =====");
        System.out.println("                              =========   ==========  ==========   ========   ==========   ===  ===      ====     ==========   ========   ===   ====");
        System.out.println("                              ======      ==========     ====       ======    ==========  ====  ====     ====     ==========    ======    ===    ===");
        System.out.println("                                                                                                                                                    ");
        System.out.println("                                                                  ==========    ======    ===    ===  ==========                                    ");
        System.out.println("                                                                  ==========   ========   ====   ===  ==========                                    ");
        System.out.println("                                                                   ====       ====  ====  =====  ===  ===                                           ");
        System.out.println("                                                                    ====      ===    ===  ====== ===  ==========                                    ");
        System.out.println("                                                                      ====    ===    ===  === ======  ==========                                    ");
        System.out.println("                                                                       ====   ====  ====  ===  =====  ===                                           ");
        System.out.println("                                                                  ==========   ========   ===   ====  ==========                                    ");
        System.out.println("                                                                  ==========    ======    ===    ===  ==========                                    ");
        System.out.println("                                                                                                                                                    ");
        System.out.println("                                                                                       ===                                                          ");
        System.out.println("                                                                                      == ==                                                         ");
        System.out.println("                                                                                     ==   ==                                                        ");
        System.out.println("                                                                                    ==     ==                                                       ");
        System.out.println("                                                                                   ==       ==                                                      ");
        System.out.println("                                                                                  ==         ==                                                     ");
        System.out.println("                                                                                 ==           ==                                                    ");
        System.out.println("                                                                                ==             ==                                                   ");
        System.out.println("                                                                               ==      ===      ==                                                  ");
        System.out.println("                                                                              ==       ===       ==                                                 ");
        System.out.println("                                                                             ==        ===        ==                                                ");
        System.out.println("                                                                            ==         ===         ==                                               ");
        System.out.println("                                                                           ==          ===          ==                                              ");
        System.out.println("                                                                          ==           ===           ==                                             ");
        System.out.println("                                                                         ==            ===            ==                                            ");
        System.out.println("                                                                        ==                             ==                                           ");
        System.out.println("                                                                       ==              ===              ==                                          ");
        System.out.println("                                                                      ==               ===               ==                                         ");
        System.out.println("                                                                     ==                                   ==                                        ");
        System.out.println("                                                                    == == == == == == == == == == == == == ==                                       ");
        System.out.println("                                                                                                                                                    ");
        System.out.println("The year is 2176. The world has been devastated by a world wide nuclear war. Countries had " +
                "raced to have the most destructive nuclear arsenal imaginable. Peace between countries grew thin. \n" +
                "Intolerable event after event lead to a full scale firing of all nuclear bombs. One after another, the bombs " +
                "were launched, leaving nothing but desolation in their trail. Few survived this \napocalypse by sheltering " +
                "in secure bunkers with rations and  resources. You are in what use to be the mountains of Colorado, where your " +
                "family had a bunker. Your mother had died when you \nwere little, your father raised you in this bunker, teaching " +
                "you everything you needed to know in order to survive. It is a whole new world out there, filled with unknowns. " +
                "A few winters \nago your father went out on a hunting trip, but never returned. You've been living in this bunker " +
                "for years alone. It is now summer time and you are inside the bunker, but you are running \nout of resources...");
        System.out.println(" ");
        System.out.println("There is an area for cutting down wood behind the house and you can collect rocks in the cave to make arrows.");
        System.out.println("You grab your backpack, lighter, torch, hatchet and head outside, ready to explore.\n");
        System.out.println("// Hatchet Equipped \\\\ \n");

        askMountainOrCaveOption();
































//            if (mountainOrCave.equals("mountain")) {
//                System.out.println("You are now outside exploring the mountain");
//                int d = 0;
//                for (int c = 0; c <= d; c += 1) {
//                    System.out.print("Do you want to go up the mountain or down the mountain? [up/down]: ");
//
//                    int f = 0;
//                    for (int e = 0; e <= f; e += 1) {
//
//                        String upOrDown;
//                        if (f == 1) {
//                            upOrDown = "up";
//
//                        } else {
//                            upOrDown = sc.next();
//
//                        }
//
//                        if (upOrDown.equals("up")) {
//                            System.out.println("You start walking up the mountain");
//                            System.out.print("You chop down some wood for the fire");
//                            System.out.println("\\\\Wood added to inventory\\\\");
//                            System.out.println("You get to the top and see some smoke off in the distance...");
//
//                            int h = 0;
//                            for (int g = 0; g <= h; g += 1) {
//
//                                System.out.print("Do you want to go checkout the smoke or bring wood home? [checkout/home]: ");
//
//                                String checkoutOrHome = sc.next();
//
//
//                                if (checkoutOrHome.equals("checkout")) {
//                                    System.out.println("You start heading towards the smoke");
//                                    System.out.println("You hear cracking of branches and leaves to your right");
//                                    System.out.println("Out of the woods comes a rabid mountain lion, worn from radiation");
//                                    System.out.println("It starts heading straight for you");
//                                    System.out.println("Game in progress. End game");
//
//                                } else if (checkoutOrHome.equals("home")) {
//                                    System.out.print("You start walking down the mountain");
//                                    if (f == 1) {
//                                        System.out.println("You make it home and add the wood to the pile and water to the reservoir");
//                                        System.out.println("\\\\Wood removed from inventory\\\\");
//                                        System.out.println("\\\\Water removed from inventory\\\\");
//                                    } else {
//                                        System.out.println("You make it home and add the wood to the pile");
//                                        System.out.println("\\\\Wood removed from inventory\\\\");
//                                    }
//                                    b += 1;
//
//                                } else {
//                                    System.out.println("That isn't and option");
//                                    h += 1;
//
//                                }
//
//                            }
//
//                        } else if (upOrDown.equals("down")) {
//                            System.out.println("You start walking down the mountain");
//                            System.out.println("You find a stream at the bottom of the mountain");
//                            System.out.println("\\\\Water added to inventory\\\\");
//
//                            int j = 0;
//                            for (int i = 0; i <= j; i += 1) {
//
//                                System.out.print("Do you want to go up the mountain or home? [up/home]: ");
//
//                                String upOrHome = sc.next();
//                                boolean goUpMountain = upOrHome.equals("up");
//                                boolean goHome = upOrHome.equals("home");
//
//                                if (goUpMountain) {
//                                    f += 1;
//
//                                } else if (goHome) {
//                                    System.out.println("You start walking home");
//                                    System.out.println("You make it home and fill up your reservoir with water");
//                                    System.out.println("\\\\Water removed from inventory\\\\");
//                                    b += 1;
//
//                                } else {
//                                    System.out.println("That isn't and option");
//                                    j += 1;
//
//                                }
//
//                            }
//
//                        } else {
//                            System.out.println("That isn't and option");
//                            d += 1;
//                        }
//
//                    }
//
//                }
//
//            } else if (mountainOrCave.equals("cave")) {
//                System.out.println("You walk to the cave");
//                System.out.println("You are walking inside the cave");
//
//                int y = 0;
//                for (int z = 0; z <= y; z += 1) {
//
//                    System.out.print("The cave comes to a fork, do you want to go right or left? [right/left]: ");
//
//                    int w = 0;
//                    for (int x = 0; x <= w; x += 1) {
//
//                        int u = 0;
//                        for (int v = 0; v <= u; v += 1) {
//
//                            String rightOrLeft;
//                            if (w == 1) {
//                                rightOrLeft = "left";
//
//                            } else if (u == 1) {
//                                rightOrLeft = "right";
//
//                            } else {
//                                rightOrLeft = sc.next();
//
//                            }
//
//                            if (rightOrLeft.equals("right")) {
//                                System.out.println("You are walking down the tunnel to the right");
//                                System.out.println("You see a light coming from far down the tunnel");
//
//                                int s = 0;
//                                for (int t = 0; t <= s; t += 1) {
//
//                                    System.out.println("Do you want to go towards the light or away from it down the left " +
//                                            "tunnel? [towards/left]: ");
//
//                                    String towardsOrLeft = sc.next();
//
//                                    if (towardsOrLeft.equals("towards")) {
//                                        System.out.println("It looks like a recently lit torch, there may be someone down here...");
//                                        System.out.println("Game in progress. End game");
//
//                                    } else if (towardsOrLeft.equals("left")) {
//                                        w += 1;
//
//                                    } else {
//                                        System.out.println("That isn't an option");
//                                        s += 1;
//                                    }
//
//                                }
//
//                            } else if (rightOrLeft.equals("left")) {
//                                System.out.println("You are walking down the tunnel to the left");
//                                System.out.print("The tunnel leads to a dead end with some writing on the wall");
//                                System.out.println("The words are smudged and hard to read");
//                                System.out.println("There are some sharp rocks on the ground that would work well for hunting arrows");
//                                System.out.println("\\\\Sharp rocks added to inventory\\\\");
//
//                                int q = 0;
//                                for (int r = 0; r <= q; r += 1) {
//
//                                    System.out.print("Do you want to leave the cave and bring the sharp rocks home or go down the " +
//                                            "tunnel to the right? [leave/right]: ");
//
//                                    String leaveOrRight = sc.next();
//                                    boolean leave = leaveOrRight.equals("leave");
//                                    boolean right = leaveOrRight.equals("right");
//
//                                    if (leave) {
//                                        System.out.println("You walk out of the cave and head home");
//                                        System.out.println("You reach your home and use some branches from your pile to make arrows");
//                                        System.out.println("\\\\Sharp rocks removed from inventory\\\\");
//                                        System.out.println("\\\\Arrows added to your inventory\\\\");
//                                        b += 1;
//
//                                    } else if (right) {
//                                        u += 1;
//
//                                    } else {
//                                        q += 1;
//
//                                    }
//
//                                }
//
//                            } else {
//                                System.out.println("That isn't an option");
//                                y += 1;
//                            }
//
//                        }
//
//                    }
//
//                }
//
//            } else {
//                System.out.println("That isn't an option");
//                b += 1;
//            }


    }


    public static void askMountainOrCaveOption() {

        System.out.println("Do you want to explore up the mountain, down the mountain, behind the house or the cave?");
        System.out.println("            up        ");
        System.out.println("     behind    cave   ");
        System.out.println("           down       ");

        mountainOrCave = sc.next();

        upDownBehindOrCaveOption();

    }


    public static void upDownBehindOrCaveOption() {

        if (mountainOrCave.equals("mountain")) {

            System.out.println("You head outside, ready to explore the mountain");

            askGoUpOrDownMountainOrBehindHouse();

        } else if (mountainOrCave.equals("cave")) {
            System.out.println("You take the winding trail to the cave");
            System.out.println("You reach the cave entrance, light your torch and start heading down the dark tunnel");

        } else if (mountainOrCave.equals("hunt")) {
            System.out.println(" ");

        } else {
            System.out.println("That isn't an option");
            askMountainOrCaveOption();

        }

    }

    public static void askGoUpOrDownMountainOrBehindHouse() {

        System.out.println(" ");

        System.out.print("Do you want to travel up the mountain, down the mountain or behind the house? [up/down/behind]: ");

        goUpTheMountain = 0;

            upOrDown = sc.next();

            upDownOrTreesOption();

    }


    public static void upDownOrTreesOption() {

        if (upOrDown.equals("up")) {
            System.out.println("You start walking up the mountain");
            System.out.println("You get to the top and see a plane fly over. The plane is smoking " +
                    "and is plummeting rapidly towards the ground. It impacts near a lake in the distance...");

            askCheckoutSmokeOrGoHome();

        }  else if (upOrDown.equals("down")) {
            System.out.println("You start walking down the mountain");

            askGoHomeOrUpMountain();

        } else if (upOrDown.equals("behind")) {
            System.out.println("You walk to an area you set up for cutting dow");
            System.out.print("You chop down some wood for your supply");
            System.out.println("// Wood added to inventory \\\\");
            wood += 5;

        } else {
            System.out.println("That isn't and option");
            askGoUpOrDownMountainOrBehindHouse();

        }

    }

    public static void askCheckoutSmokeOrGoHome() {

        System.out.print("Do you want to go checkout the smoke or go back home? [checkout/home]: ");

        checkoutOrHome = sc.next();

        checkoutSmokeOrGoHomeOption();

    }

    public static void checkoutSmokeOrGoHomeOption() {

        if (checkoutOrHome.equals("checkout")) {
            System.out.println("You start heading towards the smoke");
            System.out.println("You hear cracking of branches and leaves to your right");
            System.out.println("Out of the woods comes a rabid wolf, running straight for you");
            System.out.println("Game in progress. End game");

        } else if (checkoutOrHome.equals("home")) {
            System.out.print("You start walking down the mountain");
            if (wood >= 1) {
                System.out.println("You make it home");
            } else {
                System.out.println("You make it home");
            }


        } else {
            System.out.println("That isn't and option");
            askCheckoutSmokeOrGoHome();

        }

    }

    public static void askGoHomeOrUpMountain() {

        System.out.print("There's nothing down here. Do you want to go up the mountain or home? [up/home]: ");

        upOrHome = sc.next();



    }



}

//    static int option = 0;

//        while(option == 0){
//            System.out.println("which path");
//            option = sc.nextInt();
//            if (option == 1) {
//                pathA();
//            } else if (option == 2) {
//                pathB();
//            } else {
//                option = 0;
//            }
//        }

//    public static void pathB() {
//        System.out.println("You picked the wrong path");
//        System.out.println("You lose");
//    }
//    public static void pathA() {
//        System.out.println("You picked the right path");
//        System.out.println("You win");
//    }