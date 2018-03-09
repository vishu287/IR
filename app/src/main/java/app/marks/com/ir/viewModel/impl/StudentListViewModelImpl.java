package app.marks.com.ir.viewModel.impl;

import org.androidannotations.annotations.EBean;

import java.util.ArrayList;
import java.util.List;

import app.marks.com.ir.dto.Department;
import app.marks.com.ir.dto.Person;
import app.marks.com.ir.dto.Student;
import app.marks.com.ir.dto.Subject;
import app.marks.com.ir.dto.User;
import app.marks.com.ir.dto.UserType;
import app.marks.com.ir.viewModel.StudentListViewModel;

/**
 * Created by vishwanathm on 2/20/2018.
 */
@EBean
public class StudentListViewModelImpl implements StudentListViewModel {

    @Override
    public List<Student> getStudentsByDepartment(final String departmentId, final String userId) {
        final List<Student> students = new ArrayList<>();
        Person student = null;
        Student user = null;

        for (int i = 1; i < 20; i++) {
            user = new Student();
            student = new Person();
            student.setId("personId: " + i);
            user.setId("userId: " + i);
            student.setFirstName("FirstName: " + i);
            student.setLastName("LastName: " + i);
            student.setRollNumber("RollNumber: " + i);
            user.setSubject(new Subject("1w1w1w1", "Physics"));
            user.setDepartment(new Department("1e1e1e1", "Science"));
            user.setPerson(student);
            user.setType(UserType.STUDENT);
//            user.setMarks("" + i);
            user.setAcademicYear("2017-2018");
            students.add(user);
        }
        return students;
    }

    @Override
    public User getStudentByDepartment(final String departmentId, final String userId, final int i) {
        final List<Student> students = getStudentsByDepartment(departmentId, userId);
        return students.get((i < students.size()) ? i : students.size());
    }
}
