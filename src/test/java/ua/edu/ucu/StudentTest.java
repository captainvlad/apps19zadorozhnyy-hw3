package ua.edu.ucu;


import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    private Student student = setUp();

    private Student setUp() {
        Student student = new Student("Vladyslav", "Zadorozhnyy", 4.7, 2);
        return student;
    }

    @Test
    public void getGPA() {
        assertEquals(student.getGPA(), 4.7,0.01);
        assertNotEquals(student.getGPA(), 5,0.01);
    }

    @Test
    public void getYear() {
        assertEquals(student.getYear(), 2,0.01);
        assertNotEquals(student.getYear(), 1,0.01);
    }

    @Test
    public void getName() {
        assertEquals(student.getName(), "Vladyslav");
        assertNotEquals(student.getName(), "Danylo");
    }

    @Test
    public void getSurname() {
        assertEquals(student.getSurname(), "Zadorozhnyy");
        assertNotEquals(student.getSurname(), "Klymenko");
    }

    @Test
    public void testHashCode() {
        assertEquals(student.hashCode(), 1139788993);
        assertNotEquals(student.hashCode(), 1139787993);
    }

    @Test
    public void testEquals() {
        assertEquals(student, new Student("Vladyslav", "Zadorozhnyy", 4.7, 2));
        assertNotEquals(student, new Student("Andriy", "Romanyuk", 5.0, 4));
        assertNotEquals(student, 1);
        assertNotEquals(student, "aa");
    }

    @Test
    public void testToString() {
        assertEquals(student.toString(), "Student: name: Vladyslav, surname: Zadorozhnyy, GPA: 4.7, studying year: 2}");
        assertNotEquals(student.toString(), "Student: name: Danylo, surname: Klymenko, GPA: 5.0, studying year: 2}");
    }
}
