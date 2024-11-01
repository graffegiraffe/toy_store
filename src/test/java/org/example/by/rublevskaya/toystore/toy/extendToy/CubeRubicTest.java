package org.example.by.rublevskaya.toystore.toy.extendToy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CubeRubicTest {

    @Test
    public void testToString() {
        CubeRubic cubeRubic = new CubeRubic("Test Cube");
        String result = cubeRubic.toString();
        String expected = "Кубик рубик { имя ='Test Cube', уровень заряда =0}";
        assertEquals(expected, result);
    }
}