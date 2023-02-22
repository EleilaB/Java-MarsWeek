import java.util.*;

public class FindingsList {
    public FindingsList() throws InterruptedException {

        Thread.sleep(5000);
        System.out.println("Welcome back! We hope your expedition went well.\nDownloading rock data...");
        Thread.sleep(500);

        ArrayList<String> rocks = new ArrayList<String>();
        rocks.add("rock");
        rocks.add("weird rock");
        rocks.add("smooth rock");
        rocks.add("not rock");

        System.out.println("Download successful!\n\n" + rocks);
        Thread.sleep(1000);
        System.out.println("ERROR!\nLast entry detected as NOT ROCK\nRemoving from list...");

        rocks.remove(3);
        Thread.sleep(500);
        System.out.println("\nRemoval complete.\nUpdated list:\n\n" + rocks + "\n\nPerfect");

        System.out.println("Downloading fossil data...");
        Thread.sleep(1000);

        HashMap<String, String> fossils = new HashMap<String, String>();
        fossils.put("Bird Fossil", "The fossil has wings implying it was once capable of flight.");
        fossils.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water.");
        fossils.put("Tooth Fossil", "The The tooth from an unknown fossil.");

        System.out.println("\nDownload successful!\nWhich of the fossils would you like to learn more about?\n(Bird, Fish, Tooth)\n");
        Scanner scan = new Scanner(System.in);
        String fossilChoice;

        while(true) {

            fossilChoice = scan.nextLine();

            if (fossilChoice.equalsIgnoreCase("Bird")) {
                System.out.println("\nFossil: " + fossilChoice + "\nDescription: " + fossils.get("Bird Fossil"));
                break;
            } else if (fossilChoice.equalsIgnoreCase("Fish")) {
                System.out.println("\nFossil: " + fossilChoice + "\nDescription: " + fossils.get("Fish Fossil"));
                break;
            } else if (fossilChoice.equalsIgnoreCase("Tooth")) {
                System.out.println("\nFossil: " + fossilChoice + "\nDescription: " + fossils.get("Tooth Fossil"));
                break;
            } else {
                System.out.println("\nSelect Bird, Fish or Tooth");
                continue;
            }
        }

        System.out.println("\nChecking supplies...");
        Thread.sleep(700);

        HashSet supplies = new HashSet<>();
        supplies.add("Scanner");
        supplies.add("Scanner Batteries");
        supplies.add("Comfort Plushies");

        Iterator itr = supplies.iterator();

        System.out.println("Supplies before expedition:");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        supplies.remove("Scanner Batteries");
        itr = supplies.iterator();

        System.out.println("\nSupplies after expedition:");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
