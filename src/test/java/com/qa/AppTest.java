package com.qa;

import org.junit.jupiter.api.Test;
import static com.qa.App.sayHello;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test_shouldAnswerWithTrue()
    {
        assertTrue( false );
    }

    @Test
    public void test_shouldAnswerWithTen()
    {
        int answer = 10;
        assertEquals(11, answer );
    }

    @Test
    public void test_shouldAnswerWithFalse()
    {
        assertFalse( false );
    }

    @Test
    public void test_sayHello_should_return_Hello_World()
    {
        // Arrange
        String actualResponse = "";
        String expectedResponse = "Hello World!";

        // Act
        actualResponse = sayHello();
        // Assert
        assertEquals( expectedResponse, actualResponse);
    }
}
