package app.marks.com.ir.view.impl;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import app.marks.com.ir.R;
import app.marks.com.ir.dto.Student;
import app.marks.com.ir.view.AddMarkView;
import app.marks.com.ir.viewModel.StudentListViewModel;
import app.marks.com.ir.viewModel.impl.AddMarksViewModelImpl;
import app.marks.com.ir.viewModel.impl.StudentListViewModelImpl;

public class StudentDetailsActivity extends FragmentActivity implements AddMarkView {

    private AddMarksViewModelImpl addMarksViewModel = new AddMarksViewModelImpl();

    private StudentListViewModel studentListViewModel = new StudentListViewModelImpl();

    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_student_details);
        final Student student = (Student) getIntent().getSerializableExtra("student");
        final int position = getIntent().getIntExtra("position", 0);
        if (student != null) {
            final MarksButtonFragment buttonsFragment = (MarksButtonFragment) getFragmentManager().findFragmentById(R.id.marksButtonFragment);
            buttonsFragment.updateStudentIndex(position);
            updateFields(position, student);
        }
    }

    @Override
    public void showStudent(final int studentId) {
        final Student student = (Student) studentListViewModel.getStudentByDepartment("", "", studentId);
        updateFields(studentId, student);
    }

    @Override
    public void updateStudent(final int studentId, final String marks) {
        final Student student = (Student) studentListViewModel.getStudentByDepartment("", "", studentId);
        student.setMarks(marks);
        addMarksViewModel.updateStudent(student);
    }

    @Override
    public void saveAllStudents() {
        addMarksViewModel.updateAllStudents();
    }

    private void updateFields(final int position, final Student student) {
        final ShowStudentFragment stdFragment = (ShowStudentFragment) getFragmentManager().findFragmentById(R.id.showStudentFragment);
        stdFragment.displayStudentDetails(student);
    }
}
