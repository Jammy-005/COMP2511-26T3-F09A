package thrones.decorators;

import thrones.Character;

/**
 * A chest plate caps the amount of damage to 7, 
 * but also slows the character down. If the character 
 * is otherwise capable of moving more than one square 
 * at a time then this armour restricts each move to
 * distances of 3 squares or less (by manhattan distance).
 */
public class ChestPlateDecorator extends CharacterDecorator {
    private static final int MAX_DAMAGE = 7;
    private static final int MAX_MOVE = 3;

    public ChestPlateDecorator(Character character) {
        super(character);
    }

    @Override
    public void damage(int points) {
        super.damage(Math.min(MAX_DAMAGE, points));
    }

    @Override
    public boolean canMove(int dx, int dy) {
        if (dx + dy > MAX_MOVE) {
            return false;
        }
        return super.canMove(dx, dy);
    }
}
