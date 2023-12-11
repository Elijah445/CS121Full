package weekNine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import week10.Inheritance.MoviesDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoviesTest {
    //Creating Movie objects
    private MoviesDemo Scream;
    private MoviesDemo Spiderman2;

    @BeforeEach
    public void setUp(){
        //Create an instance of thr class
        //Horror is the object
        MoviesDemo Scream2 = new MoviesDemo();
        //genre title runtime ticketprice
        Scream = new MoviesDemo("Horror", "Scream", 144,15);
        Spiderman2 = new MoviesDemo("Action","Spiderman2",155,20);
    }
    @Test
    public void testInstanceCount()
    {
        assertEquals(2, MoviesDemo.getInstanceCount());
    }

}