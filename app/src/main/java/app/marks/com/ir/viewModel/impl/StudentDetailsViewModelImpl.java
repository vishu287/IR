package app.marks.com.ir.viewModel.impl;

import org.androidannotations.annotations.EBean;

import java.util.ArrayList;
import java.util.List;

import app.marks.com.ir.dto.Department;
import app.marks.com.ir.dto.Person;
import app.marks.com.ir.dto.Subject;
import app.marks.com.ir.dto.User;
import app.marks.com.ir.dto.UserType;
import app.marks.com.ir.viewModel.StudentDetailsViewModel;

/**
 * Created by vishwanathm on 2/20/2018.
 */
@EBean
public class StudentDetailsViewModelImpl implements StudentDetailsViewModel {

    public List<User> getStudentsByDepartment(final String departmentId, final String userId) {
        final List<User> students = new ArrayList<>();
        Person student = null;
        User user = null;

        for (int i = 1; i < 20; i++) {
            user = new User();
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
            students.add(user);
        }
        return students;
    }
}
