import java.util.Random;

public class Key {

    private int keyLocation = 0;

    public Key() {

    }

    public void keygetLocation(int doorLocation, Hint hint) {
        int a = 0;
        boolean[] newpositionIsBlocked = {

        };
        while (a == 0) {

            Random randomNumber = new Random();
            keyLocation = 1 + randomNumber.nextInt(25);

            if (!(keyLocation == 8 || keyLocation >= 12 && keyLocation <= 14 || keyLocation == 18 || keyLocation == doorLocation)) {
                a++;
                newpositionIsBlocked[keyLocation] = true;
            }
        }

    }

    public void pickUpKey(Player player, int[] hintLocation) {

        if (player.getPlayerLocation() == keyLocation) {
            System.out.println("You found the key and picked it up");
            keyLocation = 0;
            hintLocation[5] = 0;
            hintLocation[10] = 0;
            player.setPlayerHasKey(true);
            player.setOutputCounter(0);

        }

    }

    public int getKeyLocation() {
        return keyLocation;
    }

    public void setKeyLocation(int keyLocation) {
        this.keyLocation = keyLocation;
    }
}
