package app.marks.com.ir.view;

/**
 * Created by vishwanathm on 3/7/2018.
 */

public interface AddMarkView {

    void showStudent(int studentId);

    void updateStudentMarks(int studentId, String marks);

    void saveAllStudents();
}
