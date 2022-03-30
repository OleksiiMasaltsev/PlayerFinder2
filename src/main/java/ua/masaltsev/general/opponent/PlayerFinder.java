//Find Opponent - написать сервис, которому можно передавать игроков,
// которые готовы к игре. У игрока есть имя и рейтинг (double).
// По запросу сервис должен возвращать оппонента для определенного игрока,
// по принципу самый ближайший по рейтингу (как в большую, так и в меньшую сторону);
// при этом найденный оппонент должен быть удален из списка игроков, которые готовы к игре.
//
//        Написать тесты, которые будут подтверждать корректность работы сервисов.


package ua.masaltsev.general.opponent;

import java.util.*;

public class PlayerFinder {

    private final List<Player> opponents = new ArrayList<>();

    public void addOpponent(Player player) {
        opponents.add(player);
    }

    public void printOpponents() {
        for (Player player : opponents) {
            System.out.println(player.getName() + " " + player.getRating());
        }
        System.out.println("===============");
    }

    public Player findOpponentTo(Player player) {

        Player result = null;

        if (!opponents.isEmpty()) {
            result = opponents.get(0);
            double minDiff = Math.abs(result.getRating() - player.getRating());

            for (int i = 1; i < opponents.size(); i++) {
                Player bufferResult = opponents.get(i);
                double bufferDiff = Math.abs(bufferResult.getRating() - player.getRating());
               if (bufferDiff < minDiff) {
                   minDiff = bufferDiff;
                   result = bufferResult;
               }
            }
        }
        //Optional<String>?
        opponents.remove(result);
        return result;
    }
}
