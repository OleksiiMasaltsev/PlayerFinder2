package ua.masaltsev.general.opponent;

import java.util.*;

public class PlayerBinaryFinder {

    private final List<Player> opponents = new LinkedList<>();

    public void addOpponent(Player player) {
        opponents.add(player);
    }

    public void printAll() {
        opponents.forEach(System.out::println);
        System.out.println("=============");
    }

    public Optional<Player> findOpponentTo(Player player) {

        Collections.sort(opponents);
        Player result = null;

        if (!opponents.isEmpty()) {

            result = opponents.get(0);

            int firstIndex = 0;
            int lastIndex = opponents.size() - 1;

            while (firstIndex <= lastIndex) {

                int middleIndex = (firstIndex + lastIndex) / 2;

                double resultDiff = Math.abs(result.getRating() - player.getRating());
                double middleDiff = Math.abs(opponents.get(middleIndex).getRating() - player.getRating());

                if (middleDiff < resultDiff) {
                    result = opponents.get(middleIndex);
                    firstIndex = middleIndex + 1;
                } else if (middleDiff > resultDiff) {
                    lastIndex = middleIndex - 1;
                } else if (middleDiff == resultDiff) {
                    break;
                }
            }
        }

        opponents.remove(result);
        return Optional.ofNullable(result);
    }

}
