package thrones;

import java.util.Random;

public class CharacterFactory {
    private static final int SPAWN_DISTANCE = 5;

    private static Random random = new Random(System.currentTimeMillis());

    public static int getRandomCoordinate() {
        return random.nextInt(SPAWN_DISTANCE);
    }

    public static King createKing() {
        return new King(getRandomCoordinate(), getRandomCoordinate());
    }

    public static Queen createQueen() {
        return new Queen(getRandomCoordinate(), getRandomCoordinate());
    }

    public static Knight createKnight() {
        return new Knight(getRandomCoordinate(), getRandomCoordinate());
    }

    public static Dragon createDragon() {
        return new Dragon(getRandomCoordinate(), getRandomCoordinate());
    }
}
