package blackjack.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CardTest {

    @DisplayName("카드를 생성한다")
    @Test
    public void create() {
        assertThatCode(() -> new Card(CardSuit.CLOVER, CardNumber.JACK))
                .doesNotThrowAnyException();
    }

    @DisplayName("카드가 가진 값을 반환한다")
    @Test
    public void getNumber() {
        Card card = new Card(CardSuit.CLOVER, CardNumber.JACK);

        assertThat(card.getNumber()).isEqualTo(CardNumber.JACK);
    }

    @DisplayName("카드가 가진 상징을 반환한다")
    @Test
    public void getSuit() {
        Card card = new Card(CardSuit.CLOVER, CardNumber.JACK);

        assertThat(card.getSymbol()).isEqualTo(CardSuit.CLOVER);
    }

    @DisplayName("카드가 Ace 라면 true 를 반환한다")
    @Test
    public void testIsAce1() {
        assertThat(CardFixture.cloverAce().isAce()).isTrue();
    }

    @DisplayName("카드가 Ace 가 아니라면 false 를 반환한다")
    @Test
    public void testIsAce2() {
        assertThat(CardFixture.heartJack().isAce()).isFalse();
    }
}
