import java.util.Scanner;

public class Player {

    Scanner scan = new Scanner(System.in);

    private boolean playerHasMap = false;

    private boolean playerHasKey = false;

    private boolean playerFoundDoor = false;

    private boolean playerWin = false;

    private boolean playerLose = false;

    Map map = new Map();

    private int playerLocation = 13;

    private boolean playerWasThere[] = new boolean[26];

    public int playerAction(Door door) {

        String userEingabe = scan.nextLine();

        // rooms:
        // 01 02 03 04 05
        // 06 07 08 09 10
        // 11 12 13 14 15
        // 16 17 18 19 20
        // 21 22 23 24 25

        switch (userEingabe) {
        case "go north":

            if (playerLocation >= 1 && playerLocation <= 5) {
                playerLocation += 20;
            } else {
                playerLocation -= 5;
            }
            break;

        case "go east":

            if (playerLocation == 5 || playerLocation == 10 || playerLocation == 15 || playerLocation == 20 || playerLocation == 25) {
                playerLocation -= 4;
            } else {
                playerLocation += 1;
            }

            break;
        case "go south":

            if (playerLocation >= 21 && playerLocation <= 25) {
                playerLocation -= 20;
            } else {
                playerLocation += 5;
            }

            break;
        case "go west":

            if (playerLocation == 1 || playerLocation == 6 || playerLocation == 11 || playerLocation == 16 || playerLocation == 21) {
                playerLocation += 4;
            } else {
                playerLocation -= 1;
            }
            break;
        case "show map":

            if (playerHasMap == true) {
                map.showMap(playerWasThere, playerLocation, door.getDoorLocation(), playerFoundDoor);
                System.out.println("P = Player\nD = Door\nX = Discoverd rooms\nO = Undiscoverd rooms");
            } else {
                System.out.println("You can't use this command if you don't have the map");
            }

            break;
        case "show inventory":
            if (!playerHasMap && !playerHasKey) {
                System.out.println("Your inventory is empty");
            } else {
                System.out.println("You have in your inventory:");
            }

            if (playerHasMap) {
                System.out.println("Map");
            }
            if (playerHasKey) {
                System.out.println("Key");
            }

            break;

        case "help":

            System.out.println(
                    "Here are all commands you can use:\ngo north: You move to the room over you\ngo east: You move to the room right to you\ngo south: You move to the room under you\ngo west: You move to the room left to you\nshow map: If you have the map you can see the map\nshow inventory: You see your inventory");

            break;

        default:

            System.out.println("This isn't a command. Write help if you need help");
        }

        return playerLocation;

    }

    public int endGame(int a, int doorLocation) {

        if (playerHasKey == true && playerLocation == doorLocation) {
            System.out.println("You win the game!");
            return ++a;
        }
        if (playerLose) {
            System.out.println("You lose the game");
            return ++a;
        }
        return a;

    }

    public boolean[] getPlayerWasThere() {
        return playerWasThere;
    }

    public void setPlayerWasThere(boolean[] playerWasThere) {
        this.playerWasThere = playerWasThere;
    }

    public int getPlayerLocation() {
        return playerLocation;
    }

    public void setPlayerLocation(int playerLocation) {
        this.playerLocation = playerLocation;
    }

    public boolean isPlayerHasMap() {
        return playerHasMap;
    }

    public void setPlayerHasMap(boolean playerHasMap) {
        this.playerHasMap = playerHasMap;
    }

    public boolean isPlayerHasKey() {
        return playerHasKey;
    }

    public void setPlayerHasKey(boolean playerHasKey) {
        this.playerHasKey = playerHasKey;
    }

    public boolean isGameEnd() {
        return playerWin;
    }

    public void setGameEnd(boolean playerWin) {
        this.playerWin = playerWin;
    }

    public boolean isPlayerFoundDoor() {
        return playerFoundDoor;
    }

    public void setPlayerFoundDoor(boolean playerFoundDoor) {
        this.playerFoundDoor = playerFoundDoor;
    }

}
