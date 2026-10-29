package thrones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import thrones.characters.Dragon;
import thrones.characters.King;
import thrones.characters.Queen;
import thrones.characters.factories.MetalFactory;
import thrones.characters.factories.PlasticFactory;
import thrones.characters.factories.WoodFactory;
import thrones.characters.metal.MetalDragon;
import thrones.characters.plastic.PlasticQueen;
import thrones.characters.wood.WoodDragon;
import thrones.characters.wood.WoodKing;
import thrones.decorators.ChainMailDecorator;
import thrones.decorators.HelmetDecorator;

/**
 * Plays the game with a command line interface.
 * 
 * @author Nick Patrikeos
 */
public class Game {
    private List<Character> characters = new ArrayList<Character>();

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;

        for (Character character : characters) {
            System.out.print("Move " + character + " to: ");
            String[] line = scanner.nextLine().split(" ");
            x = Integer.parseInt(line[0]);
            y = Integer.parseInt(line[1]);

            MoveResult result = character.makeMove(x, y, characters);

            if (result.equals(MoveResult.SUCCESS)) {
                System.out.println("Success! Character is now " + character);
            } else if (result.equals(MoveResult.INVALID)) {
                System.out.println("Invalid move.");
            } else if (result.equals(MoveResult.ATTACK)) {
                System.out.println("Attacked another character.");
            }
        }

        scanner.close();
    }

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public static void main(String[] args) {
        Game game = new Game();

        MetalFactory metalFactory = new MetalFactory();
        PlasticFactory plasticFactory = new PlasticFactory(12);
        WoodFactory woodFactory = new WoodFactory(7);

        King k = woodFactory.createKing();
        game.addCharacter(k);


        Dragon d = metalFactory.createDragon();
        ChainMailDecorator cm = new ChainMailDecorator(d);
        Character helmetChainMail = new HelmetDecorator(cm);
        Character helmetHelmetChainMail = new HelmetDecorator(helmetChainMail);
        game.addCharacter(helmetHelmetChainMail);
        Queen q = plasticFactory.createQueen();
        game.addCharacter(q);
        game.play();
    }
}
