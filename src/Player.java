import java.util.Scanner;

public class Player {

    Scanner scan = new Scanner(System.in);

    private boolean playerHasMap = false;

    private boolean playerHasKey = false;

    private boolean playerFoundDoor = false;

    private boolean playerLose = false;

    private int playerLocation = 13;

    private boolean playerWasThere[] = new boolean[26];

    private int outputCounter = 0;

    public void playerAction(Door door, Key key, Hint hint, Map map, int doorLocation, int keyLocation, int[] mapLocation) {
        int b = 0;
        int c = 0;
        String userInput = scan.nextLine();
        String[] halfUserInput = userInput.toLowerCase().split(" ");

        boolean[] newCheckUserInput = {

        };

        // rooms:
        // 01 02 03 04 05
        // 06 07 08 09 10
        // 11 12 13 14 15
        // 16 17 18 19 20
        // 21 22 23 24 25

        switch (userInput) {
        case "go north":

            b = 0;
            c = 0;

            for (int i = 4; i <= 13; i++) {
                newCheckUserInput = hint.getCheckUserInput();
                c = i;
                if (hint.getCheckUserInput()[i] == true) {
                    if (halfUserInput[1].equals(hint.getHintDirection()[i])) {

                        if (!(playerLocation == doorLocation || playerLocation == keyLocation || playerLocation == mapLocation[2]
                                || playerLocation == mapLocation[3] || playerLocation == mapLocation[4])) {
                            System.out.println("The sound you hear didn't came from this room. Go one room more in the " + hint
                                    .getHintDirection()[i]);
                        } else {
                            newCheckUserInput[i] = false;
                            break;
                        }

                        break;
                    } else {
                        newCheckUserInput[i] = false;
                        break;
                    }
                }
            }

            if (playerLocation >= 1 && playerLocation <= 5) {
                playerLocation += 20;
            } else {
                playerLocation -= 5;
            }
            for (int a = 4; a <= 13; a++) {
                if (hint.getCheckUserInput()[a] == false) {
                    b++;

                }
            }
            if (b == 10) {
                roomIsEmpty(key.getKeyLocation(), map.getMapLocation(), door.getDoorLocation(), hint.getHintLocation());
            }

            newCheckUserInput[c] = false;
            hint.setCheckUserInput(newCheckUserInput);

            break;

        case "go east":

            b = 0;
            c = 0;

            for (int i = 4; i <= 13; i++) {
                newCheckUserInput = hint.getCheckUserInput();
                c = i;
                if (hint.getCheckUserInput()[i] == true) {
                    if (halfUserInput[1].equals(hint.getHintDirection()[i])) {
                        if (!(playerLocation == doorLocation || playerLocation == keyLocation || playerLocation == mapLocation[2]
                                || playerLocation == mapLocation[3] || playerLocation == mapLocation[4])) {
                            System.out.println("The sound you hear didn't came from this room. Go one room more in the " + hint
                                    .getHintDirection()[i]);
                        } else {
                            newCheckUserInput[i] = false;
                            break;
                        }

                        break;
                    } else {
                        newCheckUserInput[i] = false;
                        break;
                    }
                }
            }

            if (playerLocation == 5 || playerLocation == 10 || playerLocation == 15 || playerLocation == 20 || playerLocation == 25) {
                playerLocation -= 4;
            } else {
                playerLocation += 1;
            }
            for (int a = 4; a <= 13; a++) {
                if (hint.getCheckUserInput()[a] == false) {
                    b++;

                }
            }
            if (b == 10) {
                roomIsEmpty(key.getKeyLocation(), map.getMapLocation(), door.getDoorLocation(), hint.getHintLocation());
            }

            newCheckUserInput[c] = false;
            hint.setCheckUserInput(newCheckUserInput);
            break;
        case "go south":

            b = 0;
            c = 0;

            for (int i = 4; i <= 13; i++) {
                newCheckUserInput = hint.getCheckUserInput();
                c = i;
                if (hint.getCheckUserInput()[i] == true) {
                    if (halfUserInput[1].equals(hint.getHintDirection()[i])) {

                        if (!(playerLocation == doorLocation || playerLocation == keyLocation || playerLocation == mapLocation[2]
                                || playerLocation == mapLocation[3] || playerLocation == mapLocation[4])) {
                            System.out.println("The sound you hear didn't came from this room. Go one room more in the " + hint
                                    .getHintDirection()[i]);
                        } else {
                            newCheckUserInput[i] = false;
                            break;
                        }

                        break;
                    } else {
                        newCheckUserInput[i] = false;
                        break;
                    }
                }
            }

            if (playerLocation >= 21 && playerLocation <= 25) {
                playerLocation -= 20;
            } else {
                playerLocation += 5;
            }
            for (int a = 4; a <= 13; a++) {
                if (hint.getCheckUserInput()[a] == false) {
                    b++;

                }
            }
            if (b == 10) {
                roomIsEmpty(key.getKeyLocation(), map.getMapLocation(), door.getDoorLocation(), hint.getHintLocation());
            }

            newCheckUserInput[c] = false;
            hint.setCheckUserInput(newCheckUserInput);
            break;
        case "go west":

            b = 0;
            c = 0;

            for (int i = 4; i <= 13; i++) {
                newCheckUserInput = hint.getCheckUserInput();
                c = i;
                if (hint.getCheckUserInput()[i] == true) {
                    if (halfUserInput[1].equals(hint.getHintDirection()[i])) {

                        if (!(playerLocation == doorLocation || playerLocation == keyLocation || playerLocation == mapLocation[2]
                                || playerLocation == mapLocation[3] || playerLocation == mapLocation[4])) {
                            System.out.println("The sound you hear didn't came from this room. Go one room more in the " + hint
                                    .getHintDirection()[i]);
                        } else {
                            newCheckUserInput[i] = false;
                            break;
                        }
                        break;
                    } else {
                        newCheckUserInput[i] = false;
                        break;
                    }
                }
            }

            if (playerLocation == 1 || playerLocation == 6 || playerLocation == 11 || playerLocation == 16 || playerLocation == 21) {
                playerLocation += 4;
            } else {
                playerLocation -= 1;
            }
            for (int a = 4; a <= 13; a++) {
                if (hint.getCheckUserInput()[a] == false) {
                    b++;

                }
            }
            if (b == 10) {
                roomIsEmpty(key.getKeyLocation(), map.getMapLocation(), door.getDoorLocation(), hint.getHintLocation());
            }

            newCheckUserInput[c] = false;
            hint.setCheckUserInput(newCheckUserInput);
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

    }

    public void roomIsEmpty(int keyLocation, int[] mapLocation, int doorLocation, int[] hintLocation) {

        int a = 0;

        for (int i = 4; i <= 13; i++) {

            if (playerLocation == hintLocation[i]) {
                a++;

            }
        }

        if (a == 0 && playerLocation != keyLocation && playerLocation != doorLocation && playerLocation != mapLocation[2]
                && playerLocation != mapLocation[3] && playerLocation != mapLocation[4]) {
            if (playerWasThere[playerLocation] == true) {
                System.out.println("You already explored this room. Go to another room");

            } else {
                switch (outputCounter) {
                case 0:
                    System.out.println("This room is empty. Go to another room to find something");
                    outputCounter++;
                    break;

                case 1:
                    System.out.println("This room is also empty. Maybe you find something in the next room");
                    outputCounter++;
                    break;

                case 2:
                    System.out.println("This room is also empty. Go to another room to find something");
                    outputCounter = 0;
                    break;

                }

            }

        }

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

    public boolean isPlayerFoundDoor() {
        return playerFoundDoor;
    }

    public void setPlayerFoundDoor(boolean playerFoundDoor) {
        this.playerFoundDoor = playerFoundDoor;
    }

    public int getOutputCounter() {
        return outputCounter;
    }

    public void setOutputCounter(int outputCounter) {
        this.outputCounter = outputCounter;
    }

}
