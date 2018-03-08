package app.marks.com.ir.viewModel.impl;

import org.androidannotations.annotations.EBean;

import java.util.ArrayList;
import java.util.List;

import app.marks.com.ir.dto.Student;
import app.marks.com.ir.viewModel.AddMarksViewModel;

/**
 * Created by vishwanathm on 3/8/2018.
 */

@EBean
public class AddMarksViewModelImpl implements AddMarksViewModel {

    private List<Student> updatedStudents = new ArrayList<>();

    @Override
    public void updateStudent(Student student){
        updatedStudents.add(student);
    }

    @Override
    public void updateAllStudents(){
        //update all students

        //once update clear the old content
        updatedStudents = new ArrayList<>();
    }
}
