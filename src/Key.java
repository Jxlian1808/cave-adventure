import java.util.Random;

public class Key {

    private int keyLocation = 0;

    public Key() {

    }

    public void keygetLocation(int doorLocation) {
        int a = 0;

        while (a == 0) {

            Random randomNumber = new Random();
            keyLocation = 1 + randomNumber.nextInt(25);

            if (!(keyLocation == 8 || keyLocation >= 12 && keyLocation <= 14 || keyLocation == 18 || keyLocation == doorLocation)) {
                a++;
            }
        }

    }

    public void pickUpKey(Player player) {
        if (player.getPlayerLocation() == keyLocation) {
            System.out.println("You found the key and picked it up");
            keyLocation = 0;
            player.setPlayerHasKey(true);

        }

    }

    public int getKeyLocation() {
        return keyLocation;
    }

    public void setKeyLocation(int keyLocation) {
        this.keyLocation = keyLocation;
    }
}
