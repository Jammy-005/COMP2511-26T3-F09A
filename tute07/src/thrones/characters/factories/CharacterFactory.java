package thrones.characters.factories;

import java.util.Random;

import thrones.characters.Dragon;
import thrones.characters.King;
import thrones.characters.Knight;
import thrones.characters.Queen;

public abstract class CharacterFactory {
    private Random random = new Random();

    public abstract King createKing();

    public abstract Queen createQueen();

    public abstract Knight createKnight();

    public abstract Dragon createDragon();

    public int getInt(int bound) {
        return random.nextInt(bound);
    }

    public int getIntDivisiblyBy(int n) {
        return Math.floorDiv(random.nextInt(), n);
    }
}
