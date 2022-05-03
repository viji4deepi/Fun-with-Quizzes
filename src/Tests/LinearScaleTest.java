package Tests;

import com.company.LinearScale;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LinearScaleTest {
    LinearScale linearScale;

    @Before
    public void setLinearScaleTest(){
        linearScale = new LinearScale("Ask a question",4,10);
    }
    @Test
    public void setLinearScaleProperty(){
        assertEquals("Ask a question",linearScale.getQuestion());
        assertEquals(4,linearScale.getLowestValue());
        assertEquals(10,linearScale.getHighestValue());
    }
    @Test
    public void checkAnswerReturnsTrue(){
        boolean actualAnswer = linearScale.check("5");
        assertTrue(actualAnswer);
    }

}
