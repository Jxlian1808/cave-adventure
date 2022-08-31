import java.util.Random;

public class Map {

    private int[] mapLocation = new int[5];

    public Map() {

    }

    public void mapGetLocation(int keyLocation, int doorLocation, Hint hint) {
        int a = 0;
        boolean[] newpositionIsBlocked = {

        };
        for (int i = 2; i < 5; i++) {
            a = 0;

            while (a == 0) {

                Random randomNumber = new Random();
                mapLocation[i] = 1 + randomNumber.nextInt(25);

                if (!(mapLocation[i] == 8 || mapLocation[i] >= 12 && mapLocation[i] <= 14 || mapLocation[i] == 18
                        || mapLocation[i] == doorLocation || mapLocation[i] == keyLocation || mapLocation[i] == mapLocation[i - 1]
                        || mapLocation[i] == mapLocation[i - 2])) {
                    a++;
                    newpositionIsBlocked[mapLocation[2]] = true;
                    newpositionIsBlocked[mapLocation[3]] = true;
                    newpositionIsBlocked[mapLocation[4]] = true;
                }
            }
        }

    }

    public void pickUpMap(Player player, int[] hintLocation) {

        for (int i = 2; i < 5; i++) {

            if (player.getPlayerLocation() == mapLocation[i]) {
                System.out.println("You found the Map and picked it up");
                hintLocation[6] = 0;
                hintLocation[7] = 0;
                hintLocation[8] = 0;
                hintLocation[11] = 0;
                hintLocation[12] = 0;
                hintLocation[13] = 0;
                for (int j = 2; j < 5; j++) {
                    mapLocation[j] = 0;
                }

                player.setPlayerHasMap(true);
                player.setOutputCounter(0);

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
