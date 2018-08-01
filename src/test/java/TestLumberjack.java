import org.junit.*;
import static org.junit.Assert.*;
import exception.*;

public class TestLumberjack {
    
    private  Lumberjack tester;
    
    @Before
    public void initialize() {
        
        tester = new Lumberjack();
        
    }
    
    @Test
    public void inputZeroIntegersShouldReturnZero() {

        assertTrue(0== tester.cut(0, 0));

    }
    
    @Test
    public void inputOneZeroIntegerShouldReturnOne() {

        assertTrue(1== tester.cut(1, 0));
        assertTrue(1== tester.cut(1000, 0));

    }
    @Test
    public void inputEqualsIntegersShouldReturnOne() {

        assertTrue(1== tester.cut(1, 1));
        assertTrue(1== tester.cut(50, 50));
        assertTrue(1== tester.cut(1000, 1000));   

    }
    @Test
    public void inputNonZeroIntegers() {
           
         assertTrue(5== tester.cut(5, 1));
         assertTrue(4== tester.cut(5, 3));
         assertTrue(15== tester.cut(11, 4));
         assertTrue(25== tester.cut(11, 3));

    }
    
    @Test(expected = CutTreeException.class)
    public void inputNegativeIntegers() {
        
         tester.cut(5, 6);

    }
}
