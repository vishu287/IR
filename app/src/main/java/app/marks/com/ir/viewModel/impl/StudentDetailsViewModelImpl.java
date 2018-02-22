package app.marks.com.ir.viewModel.impl;

import org.androidannotations.annotations.EBean;

import java.util.ArrayList;
import java.util.List;

import app.marks.com.ir.dto.Department;
import app.marks.com.ir.dto.Student;
import app.marks.com.ir.dto.Subject;
import app.marks.com.ir.viewModel.StudentDetailsViewModel;

/**
 * Created by vishwanathm on 2/20/2018.
 */
@EBean
public class StudentDetailsViewModelImpl implements StudentDetailsViewModel {

    public List<Student> getStudentsByDepartment(final String departmentId, final String userId) {
        final List<Student> students = new ArrayList<>();
        Student student = new Student();
        for (int i = 1; i < 20; i++) {
            student = new Student();
            student.setId("Id: " + i);
            student.setFirstName("FirstName: " + i);
            student.setLastName("LastName: " + i);
            student.setRollNumber("RollNumber: " + i);
            student.setSubject(new Subject("1w1w1w1", "Physics"));
            student.setDepartment(new Department("1e1e1e1", "Science"));
            students.add(student);
        }
        return students;
    }
}
