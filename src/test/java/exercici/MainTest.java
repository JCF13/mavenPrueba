package exercici;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    static int a = 10;
    static int b = 2;

    @Test
    void Test1() {
        assertEquals(12,Main.sumar(a,b));
    }

    @Test
    void Test2() {
        assertEquals(8,Main.restar(a,b));
    }

    @Test
    void Test3() {
        assertEquals(20,Main.multiplicar(a,b));
    }

    @Test
    void Test4() {
        assertEquals(5,Main.dividir(a,b));
    }
}