package com.codecool.tinkerTailor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class TinkerTailorTest {
    @Test
    void test() {
        TinkerTailor game = new TinkerTailor(5, 3);
        List<Integer> result = new ArrayList<>();
        result.add(3);
        result.add(1);
        result.add(5);
        result.add(2);
        result.add(4);

        assertEquals(result, game.start());
    }
}
