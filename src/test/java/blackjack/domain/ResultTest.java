package blackjack.domain;

import static org.assertj.core.api.Assertions.assertThatCode;

import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ResultTest {

    @DisplayName("결과를 생성한다")
    @Test
    public void create() {
        assertThatCode(() -> new Result(Map.of(new Player("mark"), ResultStatus.WIN)))
                .doesNotThrowAnyException();
    }

}
