package app.marks.com.ir.viewModel;

import java.util.List;

import app.marks.com.ir.dto.Student;
import app.marks.com.ir.dto.User;

/**
 * Created by vishwanathm on 2/20/2018.
 */

public interface StudentListViewModel {

    List<Student> getStudentsByDepartment(String departmentId, String userId);

    User getStudentByDepartment(String departmentId, String userId, int i);
}
