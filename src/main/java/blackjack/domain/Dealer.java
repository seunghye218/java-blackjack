package blackjack.domain;

public class Dealer extends Player {

    private final Deck deck;

    public Dealer(Deck deck) {
        super("딜러");
        this.deck = deck;
    }

    public void shuffleDeck() {
        deck.shuffle();
    }

    public Card draw() {
        return deck.draw();
    }

    @Override
    public boolean canHit() {
        return calculate() <= 16;
    }
}
