package app.marks.com.ir.viewModel;

import java.util.List;

import app.marks.com.ir.dto.Subject;

/**
 * Created by vishwanathm on 2/19/2018.
 */

public interface DashBoardViewModel {
    List<Subject> getUserSubjects(final String userEmail);


}
