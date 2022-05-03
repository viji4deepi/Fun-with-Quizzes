package Tests;

import com.company.CheckBox;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;



public class CheckBoxTest {
    CheckBox checkBox;

    @Before
    public void setTests(){
        checkBox = new CheckBox("A test question","A test answer");
    }

    @Test
    public void constructorSetProperty(){
        assertEquals("A test question",checkBox.getQuestion());
        assertEquals("A test answer",checkBox.getAnswer());
    }

    @Test
    public void checkAnswerReturnsTrue(){
        boolean actualAnswer = checkBox.check("A test answer");
        assertTrue(actualAnswer);
    }
}
