package example.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;



class StudentConverterTest {

    @Test
    void testConvertStudentsMethodForStudentWithHonorRoll() {
        List<Student> students = new ArrayList<>();
        Student student = new Student();
        student.setAge(25);
        student.setGrade(95);
        students.add(student);

        StudentConverter converter = new StudentConverter();
        List<Student> result = converter.convertStudents(students);

        Assertions.assertEquals(1, result.size());
        Assertions.assertTrue(result.get(0).isHonorRoll());
    }

    @Test
    void testConvertStudentsMethodWithExceptionalStudent() {
        List<Student> students = new ArrayList<>();
        Student student = new Student();
        student.setAge(18);
        student.setGrade(95);
        students.add(student);

        StudentConverter converter = new StudentConverter();
        List<Student> result = converter.convertStudents(students);

        Assertions.assertEquals(1, result.size());
        Assertions.assertTrue(result.get(0).isExceptional());
    }

    @Test
    void testConvertStudentsMethodWithPassedStudent() {
        List<Student> students = new ArrayList<>();
        Student student = new Student();
        student.setAge(20);
        student.setGrade(80);
        students.add(student);

        StudentConverter converter = new StudentConverter();
        List<Student> result = converter.convertStudents(students);

        Assertions.assertEquals(1, result.size());
        Assertions.assertTrue(result.get(0).isPassed());
    }

    @Test
    void testConvertStudentsMethodWithNotPassedStudent() {
        List<Student> students = new ArrayList<>();
        Student student = new Student();
        student.setAge(20);
        student.setGrade(60);
        students.add(student);

        StudentConverter converter = new StudentConverter();
        List<Student> result = converter.convertStudents(students);

        Assertions.assertEquals(1, result.size());
        Assertions.assertFalse(result.get(0).isPassed());
    }

    @Test
    void testConvertStudentsMethodWithEmptyArray() {
        List<Student> students = new ArrayList<>();

        StudentConverter converter = new StudentConverter();
        List<Student> result = converter.convertStudents(students);

        Assertions.assertEquals(0, result.size());
    }

    @Test
    void testConvertStudentMethodWithNullAsArgument() {
        StudentConverter converter = new StudentConverter();

        Assertions.assertThrows(NullPointerException.class, () -> {
            converter.convertStudents(null);
        });
    }
}