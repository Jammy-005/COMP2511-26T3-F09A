package thrones.decorators;

import thrones.Character;

/**
 * A helmet reduces the amount of damage 
 * inflicted upon a character by 1 point.
 */
public class HelmetDecorator extends CharacterDecorator {
    public HelmetDecorator(Character character) {
        super(character);
    }

    @Override
    public void damage(int points) {
        super.damage(Math.max(0, points - 1));
    }
}
