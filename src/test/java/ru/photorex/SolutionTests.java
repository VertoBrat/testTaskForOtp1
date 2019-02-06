package ru.photorex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTests {
    @Test
    public void ipToLong() {
        long expected = 3232235525L;
        long actual = Util.ipToLong("192.168.0.5");
        assertEquals(expected, actual);
    }

    @Test
    public void longToIp() {
        String expected = "192.168.0.5";
        String actual = Util.longToIp(3232235525L);
        assertEquals(expected, actual);
    }

    @Test
    public void checkIp() {
        assertTrue(Util.checkIp("192.0.0.0"));
        assertFalse(Util.checkIp("192.0.0.a"));
        assertFalse(Util.checkIp("192.45."));
    }
}
