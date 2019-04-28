package tests;

import model.Transcript;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TranscriptTest {
    Transcript t;
    @Before
    public void setup(){
        t=new Transcript("mohamed",1);
    }
    @Test
    public void ConstructorTest(){
        assertEquals(t.getStudentId(),1);
        assertEquals(t.getStudentName(),"mohamed");

    }
    @Test
    public void addGradeTest(){
        coursesAndGradeAreNull();
        t.addGrade("English",0.3);
        assertTrue(t.getGrades().contains(0.3));
        assertTrue(t.getCourses().contains("English"));

    }


    @Test
    public void getCourseAndGradeTest(){
        coursesAndGradeAreNull();
        t.addGrade("English",0.3);
       assertEquals(t.getCourseAndGrade("English"),"English-0.3");
    }
    @Test
    public void getGpaTest(){
        coursesAndGradeAreNull();
        t.addGrade("English",0.4);
        t.addGrade("Math",0.4);
        t.addGrade("Science",0.4);
        assertEquals(t.getGPA(),0.4,.3);
    }
    private void coursesAndGradeAreNull() {
        assertTrue(t.getGrades().isEmpty());
        assertTrue(t.getCourses().isEmpty());
    }


}
