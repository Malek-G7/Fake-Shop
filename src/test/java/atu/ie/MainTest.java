package atu.ie;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    Main mainInstance ;

    @Test
    void testConstructor(){
        mainInstance = new Main(1);
        assertEquals(1,mainInstance.getX());
    }
}
