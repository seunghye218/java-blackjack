package blackjack.domain;

public enum ResultStatus {
    WIN("승"),
    DRAW("무"),
    LOSE("패");

    private final String name;

    ResultStatus(String name) {
        this.name = name;
    }

    public static ResultStatus swap(ResultStatus result) {
        if (result == WIN) {
            return LOSE;
        }
        if (result == LOSE) {
            return WIN;
        }
        return DRAW;
    }

    public String getName() {
        return name;
    }
}
