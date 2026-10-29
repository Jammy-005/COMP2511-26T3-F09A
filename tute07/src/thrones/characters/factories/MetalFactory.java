package thrones.characters.factories;

import thrones.characters.Dragon;
import thrones.characters.King;
import thrones.characters.Knight;
import thrones.characters.Queen;
import thrones.characters.metal.MetalKing;
import thrones.characters.metal.MetalQueen;
import thrones.characters.metal.MetalDragon;
import thrones.characters.metal.MetalKnight;

/**
 * Metal pieces are heavy and hence can only be set with 0 <= x <= 5, and y = 0
 */
public class MetalFactory extends CharacterFactory {
    private static final int BOUND = 5;

    @Override
    public King createKing() {
        return new MetalKing(getInt(BOUND), 0);
    }

    @Override
    public Queen createQueen() {
        return new MetalQueen(getInt(BOUND), 0);
    }

    @Override
    public Knight createKnight() {
        return new MetalKnight(getInt(BOUND), 0);
    }

    @Override
    public Dragon createDragon() {
        return new MetalDragon(getInt(BOUND), 0);
    }
}
