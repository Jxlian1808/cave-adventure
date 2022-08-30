public class Main {

    public static void main(String[] args) {

        int a = 0;

        // String player;
        // String[] room = new String[26]; // 26 because "0" isn't a room

        Door door = new Door();
        Key key = new Key();
        Map map = new Map();
        Player player = new Player();
        Hint hint = new Hint();

        door.doorGetLocation();
        key.keygetLocation(door.getDoorLocation());
        map.mapGetLocation(key.getKeyLocation(), door.getDoorLocation());
        hint.soundGetLocation(door.getDoorLocation(), key.getKeyLocation(), map.getMapLocation());

        System.out.println(door.getDoorLocation());
        System.out.println(key.getKeyLocation());
        System.out.println(map.getMapLocation()[2]);
        System.out.println(map.getMapLocation()[3]);
        System.out.println(map.getMapLocation()[4]);
        System.out.println("");

        for (int i = 4; i < 9; i++) {
            System.out.println(hint.getSoundLocation()[i]);
        }

        System.out.println(
                "You are caught in a dark cave.\nYou have to find the key and the door to escape the cave.\nIf you need help write help");

        while (a != 1) {

            map.mapUpdate(player.getPlayerWasThere(), player.getPlayerLocation());
            player.playerAction(door);
            map.pickUpMap(player);
            key.pickUpKey(player);
            door.foundDoor(player, player.isPlayerHasKey());
            a = player.endGame(a, door.getDoorLocation());

        }

    }

}
