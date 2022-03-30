package ua.masaltsev.general.opponent;

public class Player implements Comparable<Player> {
    private final String name;
    private final double rating;

    public Player(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Player: " + name + " " + rating;
    }

    @Override
    public int compareTo(Player player) {
        return Double.compare(this.getRating(), player.getRating());
    }
}
