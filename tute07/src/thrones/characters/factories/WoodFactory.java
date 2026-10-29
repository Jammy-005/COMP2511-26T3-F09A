package thrones.characters.factories;

import thrones.characters.Dragon;
import thrones.characters.King;
import thrones.characters.Knight;
import thrones.characters.Queen;
import thrones.characters.wood.WoodKing;
import thrones.characters.wood.WoodQueen;
import thrones.characters.wood.WoodKnight;
import thrones.characters.wood.WoodDragon;

/**
 * Wooden pieces are large and bulky, and take up a n x n grid, meaning they can only be 
 * placed on tiles with x and y values which divide n (n is provided to the factory)
 * WoodFactory
 */

public class WoodFactory extends CharacterFactory {
    private int n;

    public WoodFactory(int n) {
        this.n = n;
    }

    @Override
    public King createKing() {
        return new WoodKing(getIntDivisiblyBy(n), getIntDivisiblyBy(n));
    }

    @Override
    public Queen createQueen() {
        return new WoodQueen(getIntDivisiblyBy(n), getIntDivisiblyBy(n));
    }

    @Override
    public Knight createKnight() {
        return new WoodKnight(getIntDivisiblyBy(n), getIntDivisiblyBy(n));
    }

    @Override
    public Dragon createDragon() {
        return new WoodDragon(getIntDivisiblyBy(n), getIntDivisiblyBy(n));
    }
}
