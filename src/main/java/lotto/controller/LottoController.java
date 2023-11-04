package lotto.controller;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.function.Supplier;
import lotto.view.UI;

public class LottoController {

    public static void start() {
        int LottoAmount = -1;
        while (LottoAmount == -1) {
            LottoAmount = getString(UI.inputLottoAmount);
        }


    }


    public static int getString(Supplier<Integer> supplier) {
        try {
            return supplier.get();

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return -1;

        }


    }



}
