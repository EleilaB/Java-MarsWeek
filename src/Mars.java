public class Mars {

    public static void main(String[] args) throws InterruptedException {

        String colonyName = "Project Protean";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = landingCheck(18);

        meals -= shipPopulation * 0.75 * 2;
        System.out.println("Meals remaining after day 2: " + meals);

        meals += meals * 0.5;
        System.out.println("An extra food crate was found! The new meal count is: " + meals);

        shipPopulation += 5;

        String landingLocation = "The Ocean";
        if(landingLocation.equals("The Plain")){
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }

    }

    public static boolean landingCheck(int minutesLeft) throws InterruptedException {

        for(int minute = 0; minute <= minutesLeft; minute++){
            if(((minute % 2) == 0) && ((minute % 3) == 0)){
                System.out.println("Keep Center");
            } else if((minute % 2) == 0){
                System.out.println("Right");
            } else if((minute % 3) == 0){
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;

    };

}
