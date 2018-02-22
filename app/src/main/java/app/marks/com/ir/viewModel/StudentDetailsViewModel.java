package app.marks.com.ir.viewModel;

import java.util.List;

import app.marks.com.ir.dto.Student;

/**
 * Created by vishwanathm on 2/20/2018.
 */

public interface StudentDetailsViewModel {
    List<Student> getStudentsByDepartment(final String departmentId, final String userId);
}
