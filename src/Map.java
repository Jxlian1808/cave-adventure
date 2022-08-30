import java.util.Random;

public class Map {

    private int[] mapLocation = new int[5];

    public Map() {

    }

    public void mapGetLocation(int keyLocation, int doorLocation) {
        int a = 0;

        for (int i = 2; i < 5; i++) {
            a = 0;

            while (a == 0) {

                Random randomNumber = new Random();
                mapLocation[i] = 1 + randomNumber.nextInt(25);

                if (!(mapLocation[i] == doorLocation || mapLocation[i] == keyLocation || mapLocation[i] == 13
                        || mapLocation[i] == mapLocation[i - 1] || mapLocation[i] == mapLocation[i - 2])) {
                    a++;
                }
            }
        }

    }

    public void pickUpMap(Player player) {
        for (int i = 2; i < 5; i++) {

            if (player.getPlayerLocation() == mapLocation[i]) {
                System.out.println("You found the Map and picked it up");
                for (int j = 2; j < 5; j++) {
                    mapLocation[j] = 0;
                }

                player.setPlayerHasMap(true);

            }
        }
    }

    public void mapUpdate(boolean[] playerWasThere, int playerLocation) {

        playerWasThere[playerLocation] = true;

    }

    public void showMap(boolean[] playerWasThere, int playerLocation, int doorLocation, boolean playerFoundDoor) {

        // print map
        // P = playerposition
        // X = explored room
        // O = unexplored room

        for (int a = 1; a <= 25; a++) {

            int calculation = 0;
            if (playerLocation == a) {
                calculation = a % 5;
                if (calculation == 0) {
                    System.out.println("P");

                } else {
                    System.out.print("P ");

                }
            } else if (playerFoundDoor == true) {
                if (doorLocation == a) {
                    calculation = a % 5;
                    if (calculation == 0) {
                        System.out.println("D");

                    } else {
                        System.out.print("D ");

                    }
                }
            }

            if (playerWasThere[a] == true && playerLocation != a && !(playerFoundDoor == true && doorLocation == a)) {
                calculation = a % 5;
                if (calculation == 0) {
                    System.out.println("X");

                } else {
                    System.out.print("X ");

                }

            } else if (playerLocation != a && !(playerFoundDoor == true && doorLocation == a)) {
                calculation = a % 5;
                if (calculation == 0) {
                    System.out.println("O");

                } else {
                    System.out.print("O ");

                }

            }

        }

    }

    public int[] getMapLocation() {
        return mapLocation;
    }

    public void setMapLocation(int[] mapLocation) {
        this.mapLocation = mapLocation;
    }

}
