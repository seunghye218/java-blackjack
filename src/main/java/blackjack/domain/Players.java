package blackjack.domain;

import java.util.ArrayList;
import java.util.List;

public class Players {

    private static final int MIN_PLAYER_SIZE = 1;
    private static final int MAX_PLAYER_SIZE = 4;

    private final List<Player> players;

    public Players(List<Player> players) {
        this.players = players;
    }

    static public Players from(List<String> playerNames, List<Integer> bettings) {
        validateSize(playerNames, bettings);

        List<Player> players = new ArrayList<>();
        for (int i = 0; i < playerNames.size(); i++) {
            Betting betting = new Betting(bettings.get(i));
            Player player = new Player(playerNames.get(i), betting);
            players.add(player);
        }
        return new Players(players);
    }

    public List<Player> getPlayers() {
        return players;
    }

    private static void validateSize(List<String> players, List<Integer> bettings) {
        if (players.size() < MIN_PLAYER_SIZE || players.size() > MAX_PLAYER_SIZE) {
            throw new IllegalArgumentException(
                    String.format("플레이어의 수는 %d ~ %d명 이어야 한다.", MIN_PLAYER_SIZE, MAX_PLAYER_SIZE));
        }

        if (players.size() != bettings.size()) {
            throw new IllegalArgumentException("플레이어와 배팅 금액들의 수는 같아야 한다.");
        }
    }
}
