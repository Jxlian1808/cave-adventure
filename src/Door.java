import java.util.Random;

public class Door {

    private int doorLocation = 0;

    public Door() {

    }

    public void doorGetLocation(Hint hint) {
        boolean[] newpositionIsBlocked = {

        };
        int a = 0;

        while (a == 0) {

            Random randomNumber = new Random();
            doorLocation = 1 + randomNumber.nextInt(25);

            if (!(doorLocation == 8 || doorLocation >= 12 && doorLocation <= 14 || doorLocation == 18)) {
                a++;
                newpositionIsBlocked[doorLocation] = true;
            }
        }

    }

    public void foundDoor(Player player, boolean playerHasKey, int[] hintLocation) {

        if (player.getPlayerLocation() == doorLocation) {
            hintLocation[4] = 0;
            hintLocation[9] = 0;
            player.setOutputCounter(0);
            if (player.isPlayerFoundDoor() == false) {
                if (playerHasKey) {
                    System.out.println("You found the door");
                } else {
                    System.out.println("You found the door. Come back when you have the key");
                }
                player.setPlayerFoundDoor(true);
            } else if (playerHasKey) {
                System.out.println("You're back in the door room and have the key to escape");
            } else {
                System.out.println("You're back in the door room but you still don't have the key");
            }
        }
    }

    public int getDoorLocation() {
        return doorLocation;
    }

    public void setDoorLocation(int doorLocation) {
        this.doorLocation = doorLocation;
    }

}
