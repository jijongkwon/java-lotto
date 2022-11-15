package lotto.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class ComparingMachineTest {

    @DisplayName("일치한 로또 개수를 확인한다.")
    @Test
    void countContainNumber() {
        ComparingMachine comparingMachine = new ComparingMachine();
        comparingMachine.countContainNumber(List.of(1,2,3,4,5,6),
                List.of(List.of(1,2,3,6,7,8), List.of(12,13,14,15,16,17)));
        assertThat(comparingMachine.getContainNumberList()).isEqualTo(List.of(4,0));
    }
}