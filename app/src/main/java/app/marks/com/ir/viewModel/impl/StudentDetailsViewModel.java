package app.marks.com.ir.viewModel.impl;

import java.util.List;

import app.marks.com.ir.dto.Student;
import app.marks.com.ir.viewModel.AddMarksViewModel;

/**
 * Created by vishwanathm on 3/8/2018.
 */

public class StudentDetailsViewModel implements AddMarksViewModel {

    @Override
    public void updateAllStudents(final List<Student> updatedStudents){
        //update all students

        //once update clear the old content
        //updatedStudents = new ArrayList<>();
    }
}
