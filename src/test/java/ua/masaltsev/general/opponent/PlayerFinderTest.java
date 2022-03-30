package ua.masaltsev.general.opponent;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.Random;

class PlayerFinderTest {

    private PlayerFinder finder;

    @BeforeEach
    void setUp() {
        finder = new PlayerFinder();
    }

    @Test
    void addOpponent() {

    }

    @Test
    void findOpponentTo() {
        Random random = new Random();
        long creationStart = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            finder.addOpponent(new Player("", random.nextDouble() * 100.0d));
        }

        long searchStart = System.currentTimeMillis();
        System.out.println("Opponent found: " + finder.findOpponentTo(new Player("", 76.252d)));
        long searchEnd = System.currentTimeMillis();

        System.out.println("Duration of initialization: " + (searchStart - creationStart));
        System.out.println("Duration of search: " + (searchEnd - searchStart));
        System.out.println("Duration TOTAL: " + (searchEnd - creationStart));
    }
}