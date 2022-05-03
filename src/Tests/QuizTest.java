package Tests;

import com.company.CheckBox;
import com.company.Quiz;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class QuizTest {
    Quiz quiz;

    @Before
    public void setQuizTests(){
        quiz = new Quiz();
    }

    @Test
    public void addQuestionTest(){
        CheckBox checkBoxQuestion = new CheckBox("A test question","A test answer");
        quiz.addQuestions(checkBoxQuestion);
        assertEquals(1,quiz.getQuestions().size());
    }
}
