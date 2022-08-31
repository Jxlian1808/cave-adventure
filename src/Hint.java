import java.util.Random;

public class Hint {

    private int[] hintLocation = new int[14];

    private String[] hintDirection = new String[14];

    private boolean[] checkUserInput = new boolean[14];

    private boolean[] positionIsBlocked = new boolean[26];

    public void hintGetLocation(int doorLocation, int keyLocation, int[] mapLocation) {
        positionIsBlocked[0] = true;

        int a = 0;
        int j = 0;
        int calculation;
        int calculation1;
        int calculation2;

        Random randomNumber = new Random();

        for (int i = 4; i <= 13; i++) {
            a = 0;
            while (a == 0) {
                j++;
                if (j == 1000) { // anti crash condition
                    j = 0;
                    i = 3;
                    a = 1;

                    break;
                }

                hintLocation[i] = 1 + randomNumber.nextInt(4); // 1 = North, 2 = East, 3 = South, 4 = West

                switch (hintLocation[i]) {
                case 1:
                    hintDirection[i] = "north";

                    switch (i) {
                    case 4:

                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = doorLocation - hintLocation[i];
                        if (calculation == -5 || calculation == -10 && positionIsBlocked[hintLocation[i] - 5] || calculation == 15
                                && positionIsBlocked[hintLocation[i] + 20] || calculation == 15 && positionIsBlocked[hintLocation[i] - 5]
                                || calculation == 20) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }

                        break;
                    case 5:

                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = keyLocation - hintLocation[i];
                        if (calculation == -5 || calculation == -10 && positionIsBlocked[hintLocation[i] - 5] || calculation == 15
                                && positionIsBlocked[hintLocation[i] + 20] || calculation == 15 && positionIsBlocked[hintLocation[i] - 5]
                                || calculation == 20) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    case 6:

                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[2] - hintLocation[i];
                        if (calculation == -5 || calculation == -10 && positionIsBlocked[hintLocation[i] - 5] || calculation == 15
                                && positionIsBlocked[hintLocation[i] + 20] || calculation == 15 && positionIsBlocked[hintLocation[i] - 5]
                                || calculation == 20) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    case 7:
                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[3] - hintLocation[i];

                        if (calculation == -5 || calculation == -10 && positionIsBlocked[hintLocation[i] - 5] || calculation == 15
                                && positionIsBlocked[hintLocation[i] + 20] || calculation == 15 && positionIsBlocked[hintLocation[i] - 5]
                                || calculation == 20) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    case 8:
                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[4] - hintLocation[i];

                        if (calculation == -5 || calculation == -10 && positionIsBlocked[hintLocation[i] - 5] || calculation == 15
                                && positionIsBlocked[hintLocation[i] + 20] || calculation == 15 && positionIsBlocked[hintLocation[i] - 5]
                                || calculation == 20) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    case 9:

                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = doorLocation - hintLocation[i];
                        if (calculation == -5 || calculation == -10 && positionIsBlocked[hintLocation[i] - 5] || calculation == 15
                                && positionIsBlocked[hintLocation[i] + 20] || calculation == 15 && positionIsBlocked[hintLocation[i] - 5]
                                || calculation == 20) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4] || hintLocation[i] == hintLocation[i - 5]
                                    || hintLocation[i] == hintLocation[i - 6] || hintLocation[i] == hintLocation[i - 7]
                                    || hintLocation[i] == hintLocation[i - 8] || hintLocation[i] == hintLocation[i - 9])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }

                        break;
                    case 10:

                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = keyLocation - hintLocation[i];
                        if (calculation == -5 || calculation == -10 && positionIsBlocked[hintLocation[i] - 5] || calculation == 15
                                && positionIsBlocked[hintLocation[i] + 20] || calculation == 15 && positionIsBlocked[hintLocation[i] - 5]
                                || calculation == 20) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4] || hintLocation[i] == hintLocation[i - 5]
                                    || hintLocation[i] == hintLocation[i - 6] || hintLocation[i] == hintLocation[i - 7]
                                    || hintLocation[i] == hintLocation[i - 8] || hintLocation[i] == hintLocation[i - 9])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    case 11:

                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[2] - hintLocation[i];
                        if (calculation == -5 || calculation == -10 && positionIsBlocked[hintLocation[i] - 5] || calculation == 15
                                && positionIsBlocked[hintLocation[i] + 20] || calculation == 15 && positionIsBlocked[hintLocation[i] - 5]
                                || calculation == 20) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4] || hintLocation[i] == hintLocation[i - 5]
                                    || hintLocation[i] == hintLocation[i - 6] || hintLocation[i] == hintLocation[i - 7]
                                    || hintLocation[i] == hintLocation[i - 8] || hintLocation[i] == hintLocation[i - 9])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    case 12:
                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[3] - hintLocation[i];

                        if (calculation == -5 || calculation == -10 && positionIsBlocked[hintLocation[i] - 5] || calculation == 15
                                && positionIsBlocked[hintLocation[i] + 20] || calculation == 15 && positionIsBlocked[hintLocation[i] - 5]
                                || calculation == 20) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4] || hintLocation[i] == hintLocation[i - 5]
                                    || hintLocation[i] == hintLocation[i - 6] || hintLocation[i] == hintLocation[i - 7]
                                    || hintLocation[i] == hintLocation[i - 8] || hintLocation[i] == hintLocation[i - 9])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    case 13:
                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[4] - hintLocation[i];

                        if (calculation == -5 || calculation == -10 && positionIsBlocked[hintLocation[i] - 5] || calculation == 15
                                && positionIsBlocked[hintLocation[i] + 20] || calculation == 15 && positionIsBlocked[hintLocation[i] - 5]
                                || calculation == 20) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4] || hintLocation[i] == hintLocation[i - 5]
                                    || hintLocation[i] == hintLocation[i - 6] || hintLocation[i] == hintLocation[i - 7]
                                    || hintLocation[i] == hintLocation[i - 8] || hintLocation[i] == hintLocation[i - 9])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    }
                    break;
                case 2:
                    hintDirection[i] = "east";

                    switch (i) {
                    case 4:

                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = doorLocation - hintLocation[i];
                        calculation1 = hintLocation[i] % 5;

                        if (calculation == 1 && calculation1 != 0 || calculation == 2 && calculation1 != 0 && calculation1 != 4
                                && positionIsBlocked[hintLocation[i] + 1] || calculation == -3 && calculation1 == 0 && calculation1 == 4
                                        && positionIsBlocked[hintLocation[i] + 1] && hintLocation[i] != 1 && hintLocation[i] != 6
                                        && hintLocation[i] != 11 && hintLocation[i] != 16 && hintLocation[i] != 21 || calculation == -3
                                                && calculation1 == 0 && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4]
                                                && hintLocation[i] != 0 && hintLocation[i] != 5 && hintLocation[i] != 10
                                                && hintLocation[i] != 15 && hintLocation[i] != 20 || calculation == -3 && calculation1 == 0
                                                        && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4] || calculation == -4
                                                                && calculation1 == 0) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }

                        break;
                    case 5:

                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = keyLocation - hintLocation[i];
                        calculation1 = hintLocation[i] % 5;
                        if (calculation == 1 && calculation1 != 0 || calculation == 2 && calculation1 != 0 && calculation1 != 4
                                && positionIsBlocked[hintLocation[i] + 1] || calculation == -3 && calculation1 == 0 && calculation1 == 4
                                        && positionIsBlocked[hintLocation[i] + 1] && hintLocation[i] != 1 && hintLocation[i] != 6
                                        && hintLocation[i] != 11 && hintLocation[i] != 16 && hintLocation[i] != 21 || calculation == -3
                                                && calculation1 == 0 && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4]
                                                && hintLocation[i] != 0 && hintLocation[i] != 5 && hintLocation[i] != 10
                                                && hintLocation[i] != 15 && hintLocation[i] != 20 || calculation == -3 && calculation1 == 0
                                                        && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4] || calculation == -4
                                                                && calculation1 == 0) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    case 6:

                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[2] - hintLocation[i];
                        calculation1 = hintLocation[i] % 5;
                        if (calculation == 1 && calculation1 != 0 || calculation == 2 && calculation1 != 0 && calculation1 != 4
                                && positionIsBlocked[hintLocation[i] + 1] || calculation == -3 && calculation1 == 0 && calculation1 == 4
                                        && positionIsBlocked[hintLocation[i] + 1] && hintLocation[i] != 1 && hintLocation[i] != 6
                                        && hintLocation[i] != 11 && hintLocation[i] != 16 && hintLocation[i] != 21 || calculation == -3
                                                && calculation1 == 0 && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4]
                                                && hintLocation[i] != 0 && hintLocation[i] != 5 && hintLocation[i] != 10
                                                && hintLocation[i] != 15 && hintLocation[i] != 20 || calculation == -3 && calculation1 == 0
                                                        && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4] || calculation == -4
                                                                && calculation1 == 0) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    case 7:
                        hintLocation[i] = 1 + randomNumber.nextInt(25);

                        calculation = mapLocation[3] - hintLocation[i];
                        calculation1 = hintLocation[i] % 5;
                        if (calculation == 1 && calculation1 != 0 || calculation == 2 && calculation1 != 0 && calculation1 != 4
                                && positionIsBlocked[hintLocation[i] + 1] || calculation == -3 && calculation1 == 0 && calculation1 == 4
                                        && positionIsBlocked[hintLocation[i] + 1] && hintLocation[i] != 1 && hintLocation[i] != 6
                                        && hintLocation[i] != 11 && hintLocation[i] != 16 && hintLocation[i] != 21 || calculation == -3
                                                && calculation1 == 0 && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4]
                                                && hintLocation[i] != 0 && hintLocation[i] != 5 && hintLocation[i] != 10
                                                && hintLocation[i] != 15 && hintLocation[i] != 20 || calculation == -3 && calculation1 == 0
                                                        && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4] || calculation == -4
                                                                && calculation1 == 0) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    case 8:
                        hintLocation[i] = 1 + randomNumber.nextInt(25);

                        calculation = mapLocation[4] - hintLocation[i];
                        calculation1 = hintLocation[i] % 5;
                        if (calculation == 1 && calculation1 != 0 || calculation == 2 && calculation1 != 0 && calculation1 != 4
                                && positionIsBlocked[hintLocation[i] + 1] || calculation == -3 && calculation1 == 0 && calculation1 == 4
                                        && positionIsBlocked[hintLocation[i] + 1] && hintLocation[i] != 1 && hintLocation[i] != 6
                                        && hintLocation[i] != 11 && hintLocation[i] != 16 && hintLocation[i] != 21 || calculation == -3
                                                && calculation1 == 0 && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4]
                                                && hintLocation[i] != 0 && hintLocation[i] != 5 && hintLocation[i] != 10
                                                && hintLocation[i] != 15 && hintLocation[i] != 20 || calculation == -3 && calculation1 == 0
                                                        && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4] || calculation == -4
                                                                && calculation1 == 0) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    case 9:

                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = doorLocation - hintLocation[i];
                        calculation1 = hintLocation[i] % 5;
                        if (calculation == 1 && calculation1 != 0 || calculation == 2 && calculation1 != 0 && calculation1 != 4
                                && positionIsBlocked[hintLocation[i] + 1] || calculation == -3 && calculation1 == 0 && calculation1 == 4
                                        && positionIsBlocked[hintLocation[i] + 1] && hintLocation[i] != 1 && hintLocation[i] != 6
                                        && hintLocation[i] != 11 && hintLocation[i] != 16 && hintLocation[i] != 21 || calculation == -3
                                                && calculation1 == 0 && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4]
                                                && hintLocation[i] != 0 && hintLocation[i] != 5 && hintLocation[i] != 10
                                                && hintLocation[i] != 15 && hintLocation[i] != 20 || calculation == -3 && calculation1 == 0
                                                        && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4] || calculation == -4
                                                                && calculation1 == 0) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4] || hintLocation[i] == hintLocation[i - 5]
                                    || hintLocation[i] == hintLocation[i - 6] || hintLocation[i] == hintLocation[i - 7]
                                    || hintLocation[i] == hintLocation[i - 8] || hintLocation[i] == hintLocation[i - 9])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }

                        break;
                    case 10:

                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = keyLocation - hintLocation[i];
                        calculation1 = hintLocation[i] % 5;
                        if (calculation == 1 && calculation1 != 0 || calculation == 2 && calculation1 != 0 && calculation1 != 4
                                && positionIsBlocked[hintLocation[i] + 1] || calculation == -3 && calculation1 == 0 && calculation1 == 4
                                        && positionIsBlocked[hintLocation[i] + 1] && hintLocation[i] != 1 && hintLocation[i] != 6
                                        && hintLocation[i] != 11 && hintLocation[i] != 16 && hintLocation[i] != 21 || calculation == -3
                                                && calculation1 == 0 && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4]
                                                && hintLocation[i] != 0 && hintLocation[i] != 5 && hintLocation[i] != 10
                                                && hintLocation[i] != 15 && hintLocation[i] != 20 || calculation == -3 && calculation1 == 0
                                                        && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4] || calculation == -4
                                                                && calculation1 == 0) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4] || hintLocation[i] == hintLocation[i - 5]
                                    || hintLocation[i] == hintLocation[i - 6] || hintLocation[i] == hintLocation[i - 7]
                                    || hintLocation[i] == hintLocation[i - 8] || hintLocation[i] == hintLocation[i - 9])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    case 11:

                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[2] - hintLocation[i];
                        calculation1 = hintLocation[i] % 5;
                        if (calculation == 1 && calculation1 != 0 || calculation == 2 && calculation1 != 0 && calculation1 != 4
                                && positionIsBlocked[hintLocation[i] + 1] || calculation == -3 && calculation1 == 0 && calculation1 == 4
                                        && positionIsBlocked[hintLocation[i] + 1] && hintLocation[i] != 1 && hintLocation[i] != 6
                                        && hintLocation[i] != 11 && hintLocation[i] != 16 && hintLocation[i] != 21 || calculation == -3
                                                && calculation1 == 0 && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4]
                                                && hintLocation[i] != 0 && hintLocation[i] != 5 && hintLocation[i] != 10
                                                && hintLocation[i] != 15 && hintLocation[i] != 20 || calculation == -3 && calculation1 == 0
                                                        && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4] || calculation == -4
                                                                && calculation1 == 0) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4] || hintLocation[i] == hintLocation[i - 5]
                                    || hintLocation[i] == hintLocation[i - 6] || hintLocation[i] == hintLocation[i - 7]
                                    || hintLocation[i] == hintLocation[i - 8] || hintLocation[i] == hintLocation[i - 9])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    case 12:
                        hintLocation[i] = 1 + randomNumber.nextInt(25);

                        calculation = mapLocation[3] - hintLocation[i];
                        calculation1 = hintLocation[i] % 5;
                        if (calculation == 1 && calculation1 != 0 || calculation == 2 && calculation1 != 0 && calculation1 != 4
                                && positionIsBlocked[hintLocation[i] + 1] || calculation == -3 && calculation1 == 0 && calculation1 == 4
                                        && positionIsBlocked[hintLocation[i] + 1] && hintLocation[i] != 1 && hintLocation[i] != 6
                                        && hintLocation[i] != 11 && hintLocation[i] != 16 && hintLocation[i] != 21 || calculation == -3
                                                && calculation1 == 0 && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4]
                                                && hintLocation[i] != 0 && hintLocation[i] != 5 && hintLocation[i] != 10
                                                && hintLocation[i] != 15 && hintLocation[i] != 20 || calculation == -3 && calculation1 == 0
                                                        && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4] || calculation == -4
                                                                && calculation1 == 0) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4] || hintLocation[i] == hintLocation[i - 5]
                                    || hintLocation[i] == hintLocation[i - 6] || hintLocation[i] == hintLocation[i - 7]
                                    || hintLocation[i] == hintLocation[i - 8] || hintLocation[i] == hintLocation[i - 9])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    case 13:
                        hintLocation[i] = 1 + randomNumber.nextInt(25);

                        calculation = mapLocation[4] - hintLocation[i];
                        calculation1 = hintLocation[i] % 5;
                        if (calculation == 1 && calculation1 != 0 || calculation == 2 && calculation1 != 0 && calculation1 != 4
                                && positionIsBlocked[hintLocation[i] + 1] || calculation == -3 && calculation1 == 0 && calculation1 == 4
                                        && positionIsBlocked[hintLocation[i] + 1] && hintLocation[i] != 1 && hintLocation[i] != 6
                                        && hintLocation[i] != 11 && hintLocation[i] != 16 && hintLocation[i] != 21 || calculation == -3
                                                && calculation1 == 0 && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4]
                                                && hintLocation[i] != 0 && hintLocation[i] != 5 && hintLocation[i] != 10
                                                && hintLocation[i] != 15 && hintLocation[i] != 20 || calculation == -3 && calculation1 == 0
                                                        && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4] || calculation == -4
                                                                && calculation1 == 0) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4] || hintLocation[i] == hintLocation[i - 5]
                                    || hintLocation[i] == hintLocation[i - 6] || hintLocation[i] == hintLocation[i - 7]
                                    || hintLocation[i] == hintLocation[i - 8] || hintLocation[i] == hintLocation[i - 9])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    }

                    break;

                case 3:
                    hintDirection[i] = "south";

                    switch (i) {
                    case 4:

                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = doorLocation - hintLocation[i];
                        if (calculation == 5 || calculation == 10 && positionIsBlocked[hintLocation[i] + 5] || calculation == -15
                                && positionIsBlocked[hintLocation[i] - 20] || calculation == -15 && positionIsBlocked[hintLocation[i] + 5]
                                || calculation == -20) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }

                        break;
                    case 5:

                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = keyLocation - hintLocation[i];
                        if (calculation == 5 || calculation == 10 && positionIsBlocked[hintLocation[i] + 5] || calculation == -15
                                && positionIsBlocked[hintLocation[i] - 20] || calculation == -15 && positionIsBlocked[hintLocation[i] + 5]
                                || calculation == -20) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    case 6:

                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[2] - hintLocation[i];
                        if (calculation == 5 || calculation == 10 && positionIsBlocked[hintLocation[i] + 5] || calculation == -15
                                && positionIsBlocked[hintLocation[i] - 20] || calculation == -15 && positionIsBlocked[hintLocation[i] + 5]
                                || calculation == -20) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    case 7:
                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[3] - hintLocation[i];
                        if (calculation == 5 || calculation == 10 && positionIsBlocked[hintLocation[i] + 5] || calculation == -15
                                && positionIsBlocked[hintLocation[i] - 20] || calculation == -15 && positionIsBlocked[hintLocation[i] + 5]
                                || calculation == -20) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    case 8:
                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[4] - hintLocation[i];
                        if (calculation == 5 || calculation == 10 && positionIsBlocked[hintLocation[i] + 5] || calculation == -15
                                && positionIsBlocked[hintLocation[i] - 20] || calculation == -15 && positionIsBlocked[hintLocation[i] + 5]
                                || calculation == -20) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    case 9:

                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = doorLocation - hintLocation[i];
                        if (calculation == 5 || calculation == 10 && positionIsBlocked[hintLocation[i] + 5] || calculation == -15
                                && positionIsBlocked[hintLocation[i] - 20] || calculation == -15 && positionIsBlocked[hintLocation[i] + 5]
                                || calculation == -20) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4] || hintLocation[i] == hintLocation[i - 5]
                                    || hintLocation[i] == hintLocation[i - 6] || hintLocation[i] == hintLocation[i - 7]
                                    || hintLocation[i] == hintLocation[i - 8] || hintLocation[i] == hintLocation[i - 9])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }

                        break;
                    case 10:

                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = keyLocation - hintLocation[i];
                        if (calculation == 5 || calculation == 10 && positionIsBlocked[hintLocation[i] + 5] || calculation == -15
                                && positionIsBlocked[hintLocation[i] - 20] || calculation == -15 && positionIsBlocked[hintLocation[i] + 5]
                                || calculation == -20) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4] || hintLocation[i] == hintLocation[i - 5]
                                    || hintLocation[i] == hintLocation[i - 6] || hintLocation[i] == hintLocation[i - 7]
                                    || hintLocation[i] == hintLocation[i - 8] || hintLocation[i] == hintLocation[i - 9])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    case 11:

                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[2] - hintLocation[i];
                        if (calculation == 5 || calculation == 10 && positionIsBlocked[hintLocation[i] + 5] || calculation == -15
                                && positionIsBlocked[hintLocation[i] - 20] || calculation == -15 && positionIsBlocked[hintLocation[i] + 5]
                                || calculation == -20) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4] || hintLocation[i] == hintLocation[i - 5]
                                    || hintLocation[i] == hintLocation[i - 6] || hintLocation[i] == hintLocation[i - 7]
                                    || hintLocation[i] == hintLocation[i - 8] || hintLocation[i] == hintLocation[i - 9])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    case 12:
                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[3] - hintLocation[i];
                        if (calculation == 5 || calculation == 10 && positionIsBlocked[hintLocation[i] + 5] || calculation == -15
                                && positionIsBlocked[hintLocation[i] - 20] || calculation == -15 && positionIsBlocked[hintLocation[i] + 5]
                                || calculation == -20) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4] || hintLocation[i] == hintLocation[i - 5]
                                    || hintLocation[i] == hintLocation[i - 6] || hintLocation[i] == hintLocation[i - 7]
                                    || hintLocation[i] == hintLocation[i - 8] || hintLocation[i] == hintLocation[i - 9])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    case 13:
                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[4] - hintLocation[i];
                        if (calculation == 5 || calculation == 10 && positionIsBlocked[hintLocation[i] + 5] || calculation == -15
                                && positionIsBlocked[hintLocation[i] - 20] || calculation == -15 && positionIsBlocked[hintLocation[i] + 5]
                                || calculation == -20) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4] || hintLocation[i] == hintLocation[i - 5]
                                    || hintLocation[i] == hintLocation[i - 6] || hintLocation[i] == hintLocation[i - 7]
                                    || hintLocation[i] == hintLocation[i - 8] || hintLocation[i] == hintLocation[i - 9])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    }
                    break;

                case 4:
                    hintDirection[i] = "west";

                    switch (i) {
                    case 4:

                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = doorLocation - hintLocation[i];
                        calculation1 = hintLocation[i] % 5;
                        if (calculation == -1 && calculation1 != 1 || calculation == -2 && calculation1 != 1 && calculation1 != 2
                                && positionIsBlocked[hintLocation[i] - 1] || calculation == 3 && calculation1 == 1 && calculation1 == 2
                                        && positionIsBlocked[hintLocation[i] - 1] && hintLocation[i] != 1 && hintLocation[i] != 6
                                        && hintLocation[i] != 11 && hintLocation[i] != 16 && hintLocation[i] != 21 || calculation == 3
                                                && calculation1 == 1 && calculation1 == 2 && positionIsBlocked[hintLocation[i] + 4]
                                                && hintLocation[i] != 0 && hintLocation[i] != 5 && hintLocation[i] != 10
                                                && hintLocation[i] != 15 && hintLocation[i] != 20 || calculation == 3 && calculation1 == 1
                                                        && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4] || calculation == 4
                                                                && calculation1 == 1) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }

                        break;
                    case 5:

                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = keyLocation - hintLocation[i];
                        calculation1 = hintLocation[i] % 5;
                        if (calculation == 1 && calculation1 != 0 || calculation == 2 && calculation1 != 0 && calculation1 != 4
                                && positionIsBlocked[hintLocation[i] + 1] || calculation == -3 && calculation1 == 0 && calculation1 == 4
                                        && positionIsBlocked[hintLocation[i] + 1] && hintLocation[i] != 1 && hintLocation[i] != 6
                                        && hintLocation[i] != 11 && hintLocation[i] != 16 && hintLocation[i] != 21 || calculation == -3
                                                && calculation1 == 0 && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4]
                                                && hintLocation[i] != 0 && hintLocation[i] != 5 && hintLocation[i] != 10
                                                && hintLocation[i] != 15 && hintLocation[i] != 20 || calculation == -3 && calculation1 == 0
                                                        && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4] || calculation == -4
                                                                && calculation1 == 0) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    case 6:

                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[2] - hintLocation[i];
                        calculation1 = hintLocation[i] % 5;
                        if (calculation == 1 && calculation1 != 0 || calculation == 2 && calculation1 != 0 && calculation1 != 4
                                && positionIsBlocked[hintLocation[i] + 1] || calculation == -3 && calculation1 == 0 && calculation1 == 4
                                        && positionIsBlocked[hintLocation[i] + 1] && hintLocation[i] != 1 && hintLocation[i] != 6
                                        && hintLocation[i] != 11 && hintLocation[i] != 16 && hintLocation[i] != 21 || calculation == -3
                                                && calculation1 == 0 && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4]
                                                && hintLocation[i] != 0 && hintLocation[i] != 5 && hintLocation[i] != 10
                                                && hintLocation[i] != 15 && hintLocation[i] != 20 || calculation == -3 && calculation1 == 0
                                                        && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4] || calculation == -4
                                                                && calculation1 == 0) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    case 7:
                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[3] - hintLocation[i];
                        calculation1 = hintLocation[i] % 5;
                        if (calculation == 1 && calculation1 != 0 || calculation == 2 && calculation1 != 0 && calculation1 != 4
                                && positionIsBlocked[hintLocation[i] + 1] || calculation == -3 && calculation1 == 0 && calculation1 == 4
                                        && positionIsBlocked[hintLocation[i] + 1] && hintLocation[i] != 1 && hintLocation[i] != 6
                                        && hintLocation[i] != 11 && hintLocation[i] != 16 && hintLocation[i] != 21 || calculation == -3
                                                && calculation1 == 0 && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4]
                                                && hintLocation[i] != 0 && hintLocation[i] != 5 && hintLocation[i] != 10
                                                && hintLocation[i] != 15 && hintLocation[i] != 20 || calculation == -3 && calculation1 == 0
                                                        && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4] || calculation == -4
                                                                && calculation1 == 0) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    case 8:
                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[4] - hintLocation[i];
                        calculation1 = hintLocation[i] % 5;
                        if (calculation == 1 && calculation1 != 0 || calculation == 2 && calculation1 != 0 && calculation1 != 4
                                && positionIsBlocked[hintLocation[i] + 1] || calculation == -3 && calculation1 == 0 && calculation1 == 4
                                        && positionIsBlocked[hintLocation[i] + 1] && hintLocation[i] != 1 && hintLocation[i] != 6
                                        && hintLocation[i] != 11 && hintLocation[i] != 16 && hintLocation[i] != 21 || calculation == -3
                                                && calculation1 == 0 && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4]
                                                && hintLocation[i] != 0 && hintLocation[i] != 5 && hintLocation[i] != 10
                                                && hintLocation[i] != 15 && hintLocation[i] != 20 || calculation == -3 && calculation1 == 0
                                                        && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4] || calculation == -4
                                                                && calculation1 == 0) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    case 9:

                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = doorLocation - hintLocation[i];
                        calculation1 = hintLocation[i] % 5;
                        if (calculation == 1 && calculation1 != 0 || calculation == 2 && calculation1 != 0 && calculation1 != 4
                                && positionIsBlocked[hintLocation[i] + 1] || calculation == -3 && calculation1 == 0 && calculation1 == 4
                                        && positionIsBlocked[hintLocation[i] + 1] && hintLocation[i] != 1 && hintLocation[i] != 6
                                        && hintLocation[i] != 11 && hintLocation[i] != 16 && hintLocation[i] != 21 || calculation == -3
                                                && calculation1 == 0 && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4]
                                                && hintLocation[i] != 0 && hintLocation[i] != 5 && hintLocation[i] != 10
                                                && hintLocation[i] != 15 && hintLocation[i] != 20 || calculation == -3 && calculation1 == 0
                                                        && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4] || calculation == -4
                                                                && calculation1 == 0) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4] || hintLocation[i] == hintLocation[i - 5]
                                    || hintLocation[i] == hintLocation[i - 6] || hintLocation[i] == hintLocation[i - 7]
                                    || hintLocation[i] == hintLocation[i - 8] || hintLocation[i] == hintLocation[i - 9])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }

                        break;
                    case 10:

                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = keyLocation - hintLocation[i];
                        calculation1 = hintLocation[i] % 5;
                        if (calculation == 1 && calculation1 != 0 || calculation == 2 && calculation1 != 0 && calculation1 != 4
                                && positionIsBlocked[hintLocation[i] + 1] || calculation == -3 && calculation1 == 0 && calculation1 == 4
                                        && positionIsBlocked[hintLocation[i] + 1] && hintLocation[i] != 1 && hintLocation[i] != 6
                                        && hintLocation[i] != 11 && hintLocation[i] != 16 && hintLocation[i] != 21 || calculation == -3
                                                && calculation1 == 0 && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4]
                                                && hintLocation[i] != 0 && hintLocation[i] != 5 && hintLocation[i] != 10
                                                && hintLocation[i] != 15 && hintLocation[i] != 20 || calculation == -3 && calculation1 == 0
                                                        && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4] || calculation == -4
                                                                && calculation1 == 0) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4] || hintLocation[i] == hintLocation[i - 5]
                                    || hintLocation[i] == hintLocation[i - 6] || hintLocation[i] == hintLocation[i - 7]
                                    || hintLocation[i] == hintLocation[i - 8] || hintLocation[i] == hintLocation[i - 9])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    case 11:

                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[2] - hintLocation[i];
                        calculation1 = hintLocation[i] % 5;
                        if (calculation == 1 && calculation1 != 0 || calculation == 2 && calculation1 != 0 && calculation1 != 4
                                && positionIsBlocked[hintLocation[i] + 1] || calculation == -3 && calculation1 == 0 && calculation1 == 4
                                        && positionIsBlocked[hintLocation[i] + 1] && hintLocation[i] != 1 && hintLocation[i] != 6
                                        && hintLocation[i] != 11 && hintLocation[i] != 16 && hintLocation[i] != 21 || calculation == -3
                                                && calculation1 == 0 && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4]
                                                && hintLocation[i] != 0 && hintLocation[i] != 5 && hintLocation[i] != 10
                                                && hintLocation[i] != 15 && hintLocation[i] != 20 || calculation == -3 && calculation1 == 0
                                                        && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4] || calculation == -4
                                                                && calculation1 == 0) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4] || hintLocation[i] == hintLocation[i - 5]
                                    || hintLocation[i] == hintLocation[i - 6] || hintLocation[i] == hintLocation[i - 7]
                                    || hintLocation[i] == hintLocation[i - 8] || hintLocation[i] == hintLocation[i - 9])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    case 12:
                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[3] - hintLocation[i];
                        calculation1 = hintLocation[i] % 5;
                        if (calculation == 1 && calculation1 != 0 || calculation == 2 && calculation1 != 0 && calculation1 != 4
                                && positionIsBlocked[hintLocation[i] + 1] || calculation == -3 && calculation1 == 0 && calculation1 == 4
                                        && positionIsBlocked[hintLocation[i] + 1] && hintLocation[i] != 1 && hintLocation[i] != 6
                                        && hintLocation[i] != 11 && hintLocation[i] != 16 && hintLocation[i] != 21 || calculation == -3
                                                && calculation1 == 0 && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4]
                                                && hintLocation[i] != 0 && hintLocation[i] != 5 && hintLocation[i] != 10
                                                && hintLocation[i] != 15 && hintLocation[i] != 20 || calculation == -3 && calculation1 == 0
                                                        && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4] || calculation == -4
                                                                && calculation1 == 0) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4] || hintLocation[i] == hintLocation[i - 5]
                                    || hintLocation[i] == hintLocation[i - 6] || hintLocation[i] == hintLocation[i - 7]
                                    || hintLocation[i] == hintLocation[i - 8] || hintLocation[i] == hintLocation[i - 9])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    case 13:
                        hintLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[4] - hintLocation[i];
                        calculation1 = hintLocation[i] % 5;
                        if (calculation == 1 && calculation1 != 0 || calculation == 2 && calculation1 != 0 && calculation1 != 4
                                && positionIsBlocked[hintLocation[i] + 1] || calculation == -3 && calculation1 == 0 && calculation1 == 4
                                        && positionIsBlocked[hintLocation[i] + 1] && hintLocation[i] != 1 && hintLocation[i] != 6
                                        && hintLocation[i] != 11 && hintLocation[i] != 16 && hintLocation[i] != 21 || calculation == -3
                                                && calculation1 == 0 && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4]
                                                && hintLocation[i] != 0 && hintLocation[i] != 5 && hintLocation[i] != 10
                                                && hintLocation[i] != 15 && hintLocation[i] != 20 || calculation == -3 && calculation1 == 0
                                                        && calculation1 == 4 && positionIsBlocked[hintLocation[i] - 4] || calculation == -4
                                                                && calculation1 == 0) {
                            if (!(hintLocation[i] == 13 || hintLocation[i] == doorLocation || hintLocation[i] == keyLocation
                                    || hintLocation[i] == mapLocation[3] || hintLocation[i] == mapLocation[4]
                                    || hintLocation[i] == mapLocation[2] || hintLocation[i] == hintLocation[i - 1]
                                    || hintLocation[i] == hintLocation[i - 2] || hintLocation[i] == hintLocation[i - 3]
                                    || hintLocation[i] == hintLocation[i - 4] || hintLocation[i] == hintLocation[i - 5]
                                    || hintLocation[i] == hintLocation[i - 6] || hintLocation[i] == hintLocation[i - 7]
                                    || hintLocation[i] == hintLocation[i - 8] || hintLocation[i] == hintLocation[i - 9])) {
                                a++;
                                positionIsBlocked[hintLocation[i]] = true;
                            }
                        }
                        break;
                    }
                    break;
                }

            }

        }

    }

    public void showHint(Player player, int playerLocation) {

        for (int x = 4; x <= 13; x++) {

            if (hintLocation[x] == playerLocation) {
                System.out.println("You heard something in the " + hintDirection[x]);
                checkUserInput[x] = true;
                player.setOutputCounter(0);

                if (x >= 6 && x <= 8 || x >= 11 && x <= 13) {
                    hintLocation[6] = 0;
                    hintLocation[7] = 0;
                    hintLocation[8] = 0;
                    hintLocation[11] = 0;
                    hintLocation[12] = 0;
                    hintLocation[13] = 0;
                } else if (x == 4 || x == 9) {
                    hintLocation[4] = 0;
                    hintLocation[9] = 0;
                } else if (x == 5 || x == 10) {
                    hintLocation[5] = 0;
                    hintLocation[10] = 0;
                }

            }
        }
    }

    public String[] getHintDirection() {
        return hintDirection;
    }

    public void setHintDirection(String[] hintDirection) {
        this.hintDirection = hintDirection;
    }

    public boolean[] getCheckUserInput() {
        return checkUserInput;
    }

    public void setCheckUserInput(boolean[] checkUserInput) {
        this.checkUserInput = checkUserInput;
    }

    public int[] getHintLocation() {
        return hintLocation;
    }

    public void setHintLocation(int[] hintLocation) {
        this.hintLocation = hintLocation;
    }

    public boolean[] getPositionIsBlocked() {
        return positionIsBlocked;
    }

    public void setPositionIsBlocked(boolean[] positionIsBlocked) {
        this.positionIsBlocked = positionIsBlocked;
    }
}
