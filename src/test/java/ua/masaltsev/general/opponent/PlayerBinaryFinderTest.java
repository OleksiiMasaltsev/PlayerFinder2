package ua.masaltsev.general.opponent;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class PlayerBinaryFinderTest {

    private PlayerBinaryFinder binaryFinder;

    @BeforeEach
    void setUp() {
        binaryFinder = new PlayerBinaryFinder();
    }

    @Test
    void addOpponent() {
    }

    @Test
    void findOpponentTo() {

        Random random = new Random();
        long creationStart = System.currentTimeMillis();

//        for (int i = 0; i < 1_000; i++) {
//            binaryFinder.addOpponent(new Player("", random.nextDouble() * 100.0d));
//        }

        long searchStart = System.currentTimeMillis();
        System.out.println("Opponent found: " + binaryFinder.findOpponentTo(new Player("", 76.252d)));
        long searchEnd = System.currentTimeMillis();

        System.out.println("Duration of initialization: " + (searchStart - creationStart));
        System.out.println("Duration of search: " + (searchEnd - searchStart));
        System.out.println("Duration TOTAL: " + (searchEnd - creationStart));
    }
}