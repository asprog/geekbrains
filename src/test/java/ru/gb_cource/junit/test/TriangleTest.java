package ru.gb_cource.junit.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.gb_cource.junit.TriangleClass;

import static ru.gb_cource.junit.TriangleClass.poluperimetr;
import static ru.gb_cource.junit.TriangleClass.theArea;

public class TriangleTest {
    @Test
    void poluperimetrTrueTest() {
        Assertions.assertEquals(poluperimetr(3,4,5),6.0);
    }
    @Test
    void poluperimetrFalseTest() {
        Assertions.assertEquals(poluperimetr(2,4,5),7.0);
    }
    @Test
    void theAreaTrueTest(){
        Assertions.assertEquals(theArea(6.0,3,4,5),6.0);
    }
    @Test
    void theAreaFalseTest(){
        Assertions.assertEquals(theArea(7.0,3,4,5),6.0);
    }
}
