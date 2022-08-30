import java.util.Random;

public class Hint {

    private int[] soundLocation = new int[9];

    private int calculation;

    private int calculation1;

    public void soundGetLocation(int doorLocation, int keyLocation, int[] mapLocation) {

        int a = 0;
        int j = 0;

        Random randomNumber = new Random();

        boolean checkFieldAvailable;

        for (int i = 4; i < 9; i++) {
            a = 0;
            while (a == 0) {
                checkFieldAvailable = !(soundLocation[i] == 13 || soundLocation[i] == doorLocation || soundLocation[i] == keyLocation
                        || soundLocation[i] == mapLocation[3] || soundLocation[i] == mapLocation[4] || soundLocation[i] == mapLocation[2]
                        || soundLocation[i] == soundLocation[i - 1] || soundLocation[i] == soundLocation[i - 2]
                        || soundLocation[i] == soundLocation[i - 3] || soundLocation[i] == soundLocation[i - 4]);

                soundLocation[i] = 1 + randomNumber.nextInt(4); // 1 = North, 2 = East, 3 = South, 4 = West

                switch (soundLocation[i]) {
                case 1:
                    switch (i) {
                    case 4:

                        soundLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = doorLocation - soundLocation[i];
                        if (calculation == -5 || calculation == -10 || calculation == 15 || calculation == 20) {
                            if (!(soundLocation[i] == 13 || soundLocation[i] == doorLocation || soundLocation[i] == keyLocation
                                    || soundLocation[i] == mapLocation[3] || soundLocation[i] == mapLocation[4]
                                    || soundLocation[i] == mapLocation[2] || soundLocation[i] == soundLocation[i - 1]
                                    || soundLocation[i] == soundLocation[i - 2] || soundLocation[i] == soundLocation[i - 3]
                                    || soundLocation[i] == soundLocation[i - 4])) {
                                a++;
                            }
                        }

                        break;
                    case 5:

                        soundLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = keyLocation - soundLocation[i];
                        if (calculation == -5 || calculation == -10 || calculation == 15 || calculation == 20) {

                            if (!(soundLocation[i] == 13 || soundLocation[i] == doorLocation || soundLocation[i] == keyLocation
                                    || soundLocation[i] == mapLocation[3] || soundLocation[i] == mapLocation[4]
                                    || soundLocation[i] == mapLocation[2] || soundLocation[i] == soundLocation[i - 1]
                                    || soundLocation[i] == soundLocation[i - 2] || soundLocation[i] == soundLocation[i - 3]
                                    || soundLocation[i] == soundLocation[i - 4])) {
                                a++;
                            }
                        }
                        break;
                    case 6:

                        soundLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[2] - soundLocation[i];
                        if (calculation == -5 || calculation == -10 || calculation == 15 || calculation == 20) {
                            if (!(soundLocation[i] == 13 || soundLocation[i] == doorLocation || soundLocation[i] == keyLocation
                                    || soundLocation[i] == mapLocation[3] || soundLocation[i] == mapLocation[4]
                                    || soundLocation[i] == mapLocation[2] || soundLocation[i] == soundLocation[i - 1]
                                    || soundLocation[i] == soundLocation[i - 2] || soundLocation[i] == soundLocation[i - 3]
                                    || soundLocation[i] == soundLocation[i - 4])) {
                                a++;
                            }
                        }
                        break;
                    case 7:
                        soundLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[3] - soundLocation[i];

                        if (calculation == -5 || calculation == -10 || calculation == 15 || calculation == 20) {
                            if (!(soundLocation[i] == 13 || soundLocation[i] == doorLocation || soundLocation[i] == keyLocation
                                    || soundLocation[i] == mapLocation[3] || soundLocation[i] == mapLocation[4]
                                    || soundLocation[i] == mapLocation[2] || soundLocation[i] == soundLocation[i - 1]
                                    || soundLocation[i] == soundLocation[i - 2] || soundLocation[i] == soundLocation[i - 3]
                                    || soundLocation[i] == soundLocation[i - 4])) {
                                a++;
                            }
                        }
                        break;
                    case 8:
                        soundLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[4] - soundLocation[i];

                        if (calculation == -5 || calculation == -10 || calculation == 15 || calculation == 20) {
                            if (!(soundLocation[i] == 13 || soundLocation[i] == doorLocation || soundLocation[i] == keyLocation
                                    || soundLocation[i] == mapLocation[3] || soundLocation[i] == mapLocation[4]
                                    || soundLocation[i] == mapLocation[2] || soundLocation[i] == soundLocation[i - 1]
                                    || soundLocation[i] == soundLocation[i - 2] || soundLocation[i] == soundLocation[i - 3]
                                    || soundLocation[i] == soundLocation[i - 4])) {
                                a++;
                            }
                        }
                        break;
                    }
                    break;
                case 2:
                    switch (i) {
                    case 4:

                        soundLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = doorLocation - soundLocation[i];
                        calculation1 = soundLocation[i] % 5;
                        if (calculation == 1 && calculation1 != 0 || calculation == 2 && calculation1 != 0 && calculation1 != 4
                                || calculation == -3 && calculation1 == 0 && calculation1 == 4 || calculation == -4 && calculation1 == 0) {
                            if (!(soundLocation[i] == 13 || soundLocation[i] == doorLocation || soundLocation[i] == keyLocation
                                    || soundLocation[i] == mapLocation[3] || soundLocation[i] == mapLocation[4]
                                    || soundLocation[i] == mapLocation[2] || soundLocation[i] == soundLocation[i - 1]
                                    || soundLocation[i] == soundLocation[i - 2] || soundLocation[i] == soundLocation[i - 3]
                                    || soundLocation[i] == soundLocation[i - 4])) {
                                a++;
                            }
                        }

                        break;
                    case 5:

                        soundLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = keyLocation - soundLocation[i];
                        calculation1 = soundLocation[i] % 5;
                        if (calculation == 1 && calculation1 != 0 || calculation == 2 && calculation1 != 0 && calculation1 != 4
                                || calculation == -3 && calculation1 == 0 && calculation1 == 4 || calculation == -4 && calculation1 == 0) {
                            if (!(soundLocation[i] == 13 || soundLocation[i] == doorLocation || soundLocation[i] == keyLocation
                                    || soundLocation[i] == mapLocation[3] || soundLocation[i] == mapLocation[4]
                                    || soundLocation[i] == mapLocation[2] || soundLocation[i] == soundLocation[i - 1]
                                    || soundLocation[i] == soundLocation[i - 2] || soundLocation[i] == soundLocation[i - 3]
                                    || soundLocation[i] == soundLocation[i - 4])) {
                                a++;
                            }
                        }
                        break;
                    case 6:

                        soundLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[2] - soundLocation[i];
                        calculation1 = soundLocation[i] % 5;
                        if (calculation == 1 && calculation1 != 0 || calculation == 2 && calculation1 != 0 && calculation1 != 4
                                || calculation == -3 && calculation1 == 0 && calculation1 == 4 || calculation == -4 && calculation1 == 0) {
                            if (!(soundLocation[i] == 13 || soundLocation[i] == doorLocation || soundLocation[i] == keyLocation
                                    || soundLocation[i] == mapLocation[3] || soundLocation[i] == mapLocation[4]
                                    || soundLocation[i] == mapLocation[2] || soundLocation[i] == soundLocation[i - 1]
                                    || soundLocation[i] == soundLocation[i - 2] || soundLocation[i] == soundLocation[i - 3]
                                    || soundLocation[i] == soundLocation[i - 4])) {
                                a++;
                            }
                        }
                        break;
                    case 7:
                        soundLocation[i] = 1 + randomNumber.nextInt(25);

                        calculation = mapLocation[3] - soundLocation[i];
                        calculation1 = soundLocation[i] % 5;
                        if (calculation == 1 && calculation1 != 0 || calculation == 2 && calculation1 != 0 && calculation1 != 4
                                || calculation == -3 && calculation1 == 0 && calculation1 == 4 || calculation == -4 && calculation1 == 0) {
                            if (!(soundLocation[i] == 13 || soundLocation[i] == doorLocation || soundLocation[i] == keyLocation
                                    || soundLocation[i] == mapLocation[3] || soundLocation[i] == mapLocation[4]
                                    || soundLocation[i] == mapLocation[2] || soundLocation[i] == soundLocation[i - 1]
                                    || soundLocation[i] == soundLocation[i - 2] || soundLocation[i] == soundLocation[i - 3]
                                    || soundLocation[i] == soundLocation[i - 4])) {
                                a++;
                            }
                        }
                        break;
                    case 8:
                        soundLocation[i] = 1 + randomNumber.nextInt(25);

                        calculation = mapLocation[4] - soundLocation[i];
                        calculation1 = soundLocation[i] % 5;
                        if (calculation == 1 && calculation1 != 0 || calculation == 2 && calculation1 != 0 && calculation1 != 4
                                || calculation == -3 && calculation1 == 0 && calculation1 == 4 || calculation == -4 && calculation1 == 0) {
                            if (!(soundLocation[i] == 13 || soundLocation[i] == doorLocation || soundLocation[i] == keyLocation
                                    || soundLocation[i] == mapLocation[3] || soundLocation[i] == mapLocation[4]
                                    || soundLocation[i] == mapLocation[2] || soundLocation[i] == soundLocation[i - 1]
                                    || soundLocation[i] == soundLocation[i - 2] || soundLocation[i] == soundLocation[i - 3]
                                    || soundLocation[i] == soundLocation[i - 4])) {
                                a++;
                            }
                        }
                        break;
                    }
                    break;

                case 3:
                    switch (i) {
                    case 4:

                        soundLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = doorLocation - soundLocation[i];
                        if (calculation == 5 || calculation == 10 || calculation == -15 || calculation == 20) {
                            if (!(soundLocation[i] == 13 || soundLocation[i] == doorLocation || soundLocation[i] == keyLocation
                                    || soundLocation[i] == mapLocation[3] || soundLocation[i] == mapLocation[4]
                                    || soundLocation[i] == mapLocation[2] || soundLocation[i] == soundLocation[i - 1]
                                    || soundLocation[i] == soundLocation[i - 2] || soundLocation[i] == soundLocation[i - 3]
                                    || soundLocation[i] == soundLocation[i - 4])) {
                                a++;
                            }
                        }

                        break;
                    case 5:

                        soundLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = keyLocation - soundLocation[i];
                        if (calculation == 5 || calculation == 10 || calculation == -15 || calculation == 20) {
                            if (!(soundLocation[i] == 13 || soundLocation[i] == doorLocation || soundLocation[i] == keyLocation
                                    || soundLocation[i] == mapLocation[3] || soundLocation[i] == mapLocation[4]
                                    || soundLocation[i] == mapLocation[2] || soundLocation[i] == soundLocation[i - 1]
                                    || soundLocation[i] == soundLocation[i - 2] || soundLocation[i] == soundLocation[i - 3]
                                    || soundLocation[i] == soundLocation[i - 4])) {
                                a++;
                            }
                        }
                        break;
                    case 6:

                        soundLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[2] - soundLocation[i];
                        if (calculation == 5 || calculation == 10 || calculation == -15 || calculation == 20) {
                            if (!(soundLocation[i] == 13 || soundLocation[i] == doorLocation || soundLocation[i] == keyLocation
                                    || soundLocation[i] == mapLocation[3] || soundLocation[i] == mapLocation[4]
                                    || soundLocation[i] == mapLocation[2] || soundLocation[i] == soundLocation[i - 1]
                                    || soundLocation[i] == soundLocation[i - 2] || soundLocation[i] == soundLocation[i - 3]
                                    || soundLocation[i] == soundLocation[i - 4])) {
                                a++;
                            }
                        }
                        break;
                    case 7:
                        soundLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[3] - soundLocation[i];
                        if (calculation == 5 || calculation == 10 || calculation == -15 || calculation == 20) {
                            if (!(soundLocation[i] == 13 || soundLocation[i] == doorLocation || soundLocation[i] == keyLocation
                                    || soundLocation[i] == mapLocation[3] || soundLocation[i] == mapLocation[4]
                                    || soundLocation[i] == mapLocation[2] || soundLocation[i] == soundLocation[i - 1]
                                    || soundLocation[i] == soundLocation[i - 2] || soundLocation[i] == soundLocation[i - 3]
                                    || soundLocation[i] == soundLocation[i - 4])) {
                                a++;
                            }
                        }
                        break;
                    case 8:
                        soundLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[4] - soundLocation[i];
                        if (calculation == 5 || calculation == 10 || calculation == -15 || calculation == 20) {
                            if (!(soundLocation[i] == 13 || soundLocation[i] == doorLocation || soundLocation[i] == keyLocation
                                    || soundLocation[i] == mapLocation[3] || soundLocation[i] == mapLocation[4]
                                    || soundLocation[i] == mapLocation[2] || soundLocation[i] == soundLocation[i - 1]
                                    || soundLocation[i] == soundLocation[i - 2] || soundLocation[i] == soundLocation[i - 3]
                                    || soundLocation[i] == soundLocation[i - 4])) {
                                a++;
                            }
                        }
                        break;
                    }
                    break;

                case 4:
                    switch (i) {
                    case 4:

                        soundLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = doorLocation - soundLocation[i];
                        calculation1 = soundLocation[i] % 5;
                        if (calculation == -1 && calculation != 1 || calculation == -2 && calculation != 1 && calculation != 2
                                || calculation == 3 && calculation == 1 && calculation == 2 || calculation == 4 && calculation == 1) {
                            if (!(soundLocation[i] == 13 || soundLocation[i] == doorLocation || soundLocation[i] == keyLocation
                                    || soundLocation[i] == mapLocation[3] || soundLocation[i] == mapLocation[4]
                                    || soundLocation[i] == mapLocation[2] || soundLocation[i] == soundLocation[i - 1]
                                    || soundLocation[i] == soundLocation[i - 2] || soundLocation[i] == soundLocation[i - 3]
                                    || soundLocation[i] == soundLocation[i - 4])) {
                                a++;
                            }
                        }

                        break;
                    case 5:

                        soundLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = keyLocation - soundLocation[i];
                        calculation1 = soundLocation[i] % 5;
                        if (calculation == -1 && calculation != 1 || calculation == -2 && calculation != 1 && calculation != 2
                                || calculation == 3 && calculation == 1 && calculation == 2 || calculation == 4 && calculation == 1) {
                            if (!(soundLocation[i] == 13 || soundLocation[i] == doorLocation || soundLocation[i] == keyLocation
                                    || soundLocation[i] == mapLocation[3] || soundLocation[i] == mapLocation[4]
                                    || soundLocation[i] == mapLocation[2] || soundLocation[i] == soundLocation[i - 1]
                                    || soundLocation[i] == soundLocation[i - 2] || soundLocation[i] == soundLocation[i - 3]
                                    || soundLocation[i] == soundLocation[i - 4])) {
                                a++;
                            }
                        }
                        break;
                    case 6:

                        soundLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[2] - soundLocation[i];
                        calculation1 = soundLocation[i] % 5;
                        if (calculation == -1 && calculation != 1 || calculation == -2 && calculation != 1 && calculation != 2
                                || calculation == 3 && calculation == 1 && calculation == 2 || calculation == 4 && calculation == 1) {
                            if (!(soundLocation[i] == 13 || soundLocation[i] == doorLocation || soundLocation[i] == keyLocation
                                    || soundLocation[i] == mapLocation[3] || soundLocation[i] == mapLocation[4]
                                    || soundLocation[i] == mapLocation[2] || soundLocation[i] == soundLocation[i - 1]
                                    || soundLocation[i] == soundLocation[i - 2] || soundLocation[i] == soundLocation[i - 3]
                                    || soundLocation[i] == soundLocation[i - 4])) {
                                a++;
                            }
                        }
                        break;
                    case 7:
                        soundLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[3] - soundLocation[i];
                        calculation1 = soundLocation[i] % 5;
                        if (calculation == -1 && calculation != 1 || calculation == -2 && calculation != 1 && calculation != 2
                                || calculation == 3 && calculation == 1 && calculation == 2 || calculation == 4 && calculation == 1) {
                            if (!(soundLocation[i] == 13 || soundLocation[i] == doorLocation || soundLocation[i] == keyLocation
                                    || soundLocation[i] == mapLocation[3] || soundLocation[i] == mapLocation[4]
                                    || soundLocation[i] == mapLocation[2] || soundLocation[i] == soundLocation[i - 1]
                                    || soundLocation[i] == soundLocation[i - 2] || soundLocation[i] == soundLocation[i - 3]
                                    || soundLocation[i] == soundLocation[i - 4])) {
                                a++;
                            }
                        }
                        break;
                    case 8:
                        soundLocation[i] = 1 + randomNumber.nextInt(25);
                        calculation = mapLocation[4] - soundLocation[i];
                        calculation1 = soundLocation[i] % 5;
                        if (calculation == -1 && calculation != 1 || calculation == -2 && calculation != 1 && calculation != 2
                                || calculation == 3 && calculation == 1 && calculation == 2 || calculation == 4 && calculation == 1) {
                            if (!(soundLocation[i] == 13 || soundLocation[i] == doorLocation || soundLocation[i] == keyLocation
                                    || soundLocation[i] == mapLocation[3] || soundLocation[i] == mapLocation[4]
                                    || soundLocation[i] == mapLocation[2] || soundLocation[i] == soundLocation[i - 1]
                                    || soundLocation[i] == soundLocation[i - 2] || soundLocation[i] == soundLocation[i - 3]
                                    || soundLocation[i] == soundLocation[i - 4])) {
                                a++;
                            }
                        }
                        break;
                    }
                    break;
                }

            }

        }

    }

    public int[] getSoundLocation() {
        return soundLocation;
    }

    public void setSoundLocation(int[] soundLocation) {
        this.soundLocation = soundLocation;
    }
}
