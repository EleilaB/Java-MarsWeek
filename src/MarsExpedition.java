import java.util.Scanner;

public class MarsExpedition {

    public MarsExpedition() throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        System.out.println("System booting...");
        Thread.sleep(1000);
        System.out.println("...");
        Thread.sleep(1000);
        System.out.println("...");
        Thread.sleep(1000);
        System.out.println("Starting...\n");

        System.out.println("Enter your name:\n");

        String name = scan.nextLine();

        System.out.println("\nWelcome, " + name + "!\nThis is the Expedition Prep Program. Are you ready to venture into the new world?\nY or N\n");

        String readyCheck;

        while(true) {

            readyCheck = scan.nextLine();

            if (readyCheck.equalsIgnoreCase("Y")) {
                System.out.println("\nFantastic! This is why you're the team leader.");
                break;
            } else if (readyCheck.equalsIgnoreCase("N")) {
                System.out.println("\nToo bad! You're the team leader, and the expedition is now!");
                break;
            } else {
                System.out.println("\n Are you ready to venture into the new world?\nY or N");
                continue;
            }
        }

        System.out.println("How many members do you want on your team?");

        int teamMembers;

        while(true){

            try{
                teamMembers = scan.nextInt();
            } catch (Exception e) {
                String badInput = scan.next();
                System.out.println("You must input a number.");
                continue;
            }

            if(teamMembers != 2){
                System.out.println("\nSilly " + name + ", your team is set! It's you and two others.");
                break;
            } else if(teamMembers == 2){
                System.out.println("That's right, " + name + "! You have two team members.");
                break;
            }
            Thread.sleep(20000);
        }

        System.out.println("\nYou are allowed to bring one snack with you. What would you like to bring?");
        String snack = "";
        while(snack == ""){
            snack = scan.nextLine();
            continue;
        }
        System.out.println("\nPerfect. The snack you have selected is: " + snack + ".");

        System.out.println("What vehicle will you be taking?");
        Thread.sleep(1000);
        System.out.println("\nA: Three Skateboards\nB: A Tandem Bike with Sidecar\nC: Trained Elephants");
        System.out.println("\n A, B, or C?");

        String vehicle;

        while(true){
            vehicle = scan.nextLine();
            if(vehicle.equalsIgnoreCase("A")){
                System.out.println("\n...");
                Thread.sleep(1000);
                System.out.println("Interesting choice. Your team will take three skateboards on your mission.");
                vehicle = "three skateboards";
                break;
            } else if(vehicle.equalsIgnoreCase("B")){
                System.out.println("\nGood choice. Your team will take a tandem bike with sidecar on your mission.");
                vehicle = "a tandem bicycle with sidecar";
                break;
            } else if(vehicle.equalsIgnoreCase("C")){
                System.out.println("\nReally?\nAlright, but be careful with them - those elephants are expensive.\nYour team will take trained elephants on your mission.");
                vehicle = "trained elephants";
                break;
            } else {
                System.out.println("\nYou must select A, B, or C.");
                continue;
            }
        }

        Thread.sleep(2500);
        System.out.println("\nFantastic! " + name + ", you are ready for the expedition.\nYou'll be taking two team members with you. The snack you'll bring is " + snack + ", and you'll travel via " + vehicle + ".\nGood luck!");
        Thread.sleep(2500);
        System.out.println("\nInitializing countdown...");
        Thread.sleep(1000);
        System.out.println("\n3");
        Thread.sleep(1000);
        System.out.println("...");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("...");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("...");
        Thread.sleep(1000);
        System.out.println("\nBegin expedition!");

    }

}
