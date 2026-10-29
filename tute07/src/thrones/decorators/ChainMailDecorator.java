package thrones.decorators;

import thrones.Character;

/**
 * Chain mail reduces the amount of damage 
 * by half (rounded down).
 */
public class ChainMailDecorator extends CharacterDecorator {
    public ChainMailDecorator(Character character) {
        super(character);
    }

    @Override
    public void damage(int points) {
        super.damage(Math.floorDiv(points, 2));
    }
}
