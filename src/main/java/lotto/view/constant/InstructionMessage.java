package lotto.view.constant;

public enum InstructionMessage {
    MESSAGE_OF_ENTERING_LOTTO_AMOUNT("구입금액을 입력해 주세요.");

    private final String prompts;

    InstructionMessage(String prompts) {
        this.prompts = prompts;
    }

    public String getPrompts() {
        return prompts;
    }

}
