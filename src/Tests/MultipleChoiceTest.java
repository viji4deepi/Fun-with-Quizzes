package Tests;

import com.company.MultipleChoice;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleChoiceTest {
    MultipleChoice multipleChoice;
    @Before
    public void setUp() throws Exception {
       multipleChoice = new MultipleChoice("A test question","A test answer");
    }

    @Test
    public void constructorSetProperty(){
        assertEquals("A test question",multipleChoice.getQuestion());
        assertEquals("A test answer",multipleChoice.getAnswer());
    }

    @Test
    public void checkAnswerReturnsTrue(){
        boolean actualAnswer = multipleChoice.check("A test answer");
        assertTrue(actualAnswer);
    }
}