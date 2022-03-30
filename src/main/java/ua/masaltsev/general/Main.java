package ua.masaltsev.general;

import ua.masaltsev.general.opponent.Player;
import ua.masaltsev.general.opponent.PlayerBinaryFinder;
import ua.masaltsev.general.opponent.PlayerFinder;

public class Main {
    public static void main(String[] args) {

        PlayerBinaryFinder binaryFinder = new PlayerBinaryFinder();
        PlayerFinder finder = new PlayerFinder();

        binaryFinder.addOpponent(new Player("Oleksi", 5.25d));
        binaryFinder.addOpponent(new Player("Oksi", 9.00d));
        binaryFinder.addOpponent(new Player("Natalya", 8.9d));
        binaryFinder.addOpponent(new Player("Stepan", 2.7d));
        binaryFinder.addOpponent(new Player("Valera", 7.3d));

        binaryFinder.printAll();

        System.out.println("Result " + binaryFinder.findOpponentTo(new Player("Grys", 8.96)));
        System.out.println("=============");

        binaryFinder.printAll();
    }
}
