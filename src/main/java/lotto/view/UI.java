package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.function.Supplier;
import lotto.view.constant.InstructionMessage;

public class UI {

    public static Supplier<Integer> inputLottoAmount = new Supplier<Integer>() {
        @Override
        public Integer get() {
            displayMessage(InstructionMessage.MESSAGE_OF_ENTERING_LOTTO_AMOUNT);
            return inputValidator(Console.readLine());
        }
    };

    public static void displayMessage(final InstructionMessage instructionMessage) {
        System.out.println(instructionMessage.getPrompts());
    }

    public static int inputValidator(String lottoAmountInputValue) {
        try {
            return Integer.parseInt(lottoAmountInputValue);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("올바른 정수를 입력해 주세요");
        }
    }

}
