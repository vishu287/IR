package app.marks.com.ir.viewModel.impl;

import org.androidannotations.annotations.EBean;

import java.util.ArrayList;
import java.util.List;

import app.marks.com.ir.dto.Subject;
import app.marks.com.ir.viewModel.DashBoardViewModel;

/**
 * Created by vishwanathm on 2/19/2018.
 */
@EBean(scope = EBean.Scope.Singleton)
public class DashBoardViewModelImpl implements DashBoardViewModel {

    public List<Subject> getUserSubjects(final String userEmail) {
        final List<Subject> subjects = new ArrayList<>();
        subjects.add(new Subject("1w1w1w", "Physics"));
        subjects.add(new Subject("22w2w2", "Mathematics"));
        subjects.add(new Subject("3w3w3", "Chemistry"));

        return subjects;
    }
}
