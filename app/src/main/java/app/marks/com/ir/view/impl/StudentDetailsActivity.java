package app.marks.com.ir.view.impl;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import java.util.ArrayList;
import java.util.List;

import app.marks.com.ir.R;
import app.marks.com.ir.dto.Student;
import app.marks.com.ir.view.AddMarkView;
import app.marks.com.ir.viewModel.StudentListViewModel;
import app.marks.com.ir.viewModel.impl.StudentDetailsViewModel;
import app.marks.com.ir.viewModel.impl.StudentListViewModelImpl;

public class StudentDetailsActivity extends FragmentActivity implements AddMarkView {

    private StudentDetailsViewModel studentDetailsViewModel = new StudentDetailsViewModel();

    private StudentListViewModel studentListViewModel = new StudentListViewModelImpl();

    private List<Student> students = new ArrayList<>();

    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_student_details);

        final Student student = (Student) getIntent().getSerializableExtra("student");
        final int position = getIntent().getIntExtra("position", 0);
        students = studentListViewModel.getStudentsByDepartment("", "");
        if (student != null) {
            final MarksButtonFragment buttonsFragment = (MarksButtonFragment) getFragmentManager().findFragmentById(R.id.marksButtonFragment);
            buttonsFragment.updateStudentIndex(position);
            displayStudentDetails(position, student);
        }
    }

    @Override
    public void showStudent(final int studentId) {
//        final Student student = (Student) studentListViewModel.getStudentByDepartment("", "", studentId);
        final Student student = students.get(studentId);
        displayStudentDetails(studentId, student);
    }

    @Override
    public void updateStudentMarks(final int studentId, final String marks) {
        final Student student = students.get(studentId);
        student.setMarks(marks);
        students.add(student);
    }

    @Override
    public void saveAllStudents() {
        studentDetailsViewModel.updateAllStudents(students);
    }

    private void displayStudentDetails(final int position, final Student student) {
        final ShowStudentFragment stdFragment = (ShowStudentFragment) getFragmentManager().findFragmentById(R.id.showStudentFragment);
        stdFragment.displayStudentDetails(student);
    }
}
