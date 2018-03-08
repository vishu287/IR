package app.marks.com.ir.view.impl;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import app.marks.com.ir.R;
import app.marks.com.ir.view.AddMarkView;
import app.marks.com.ir.viewModel.StudentListViewModel;
import app.marks.com.ir.viewModel.impl.StudentListViewModelImpl;

public class MarksButtonFragment extends Fragment implements View.OnClickListener {

    private StudentListViewModel studentListViewModel = new StudentListViewModelImpl();
    private AddMarkView activity;
    private int stdIndex;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        activity = (AddMarkView) getActivity();
        return inflater.inflate(R.layout.fragment_marks_buttons, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        final Button next = getActivity().findViewById(R.id.nextBtn);
        next.setOnClickListener(this);

        final Button previous = getActivity().findViewById(R.id.previousBtn);
        previous.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.nextBtn:
                getStudent(stdIndex++);
                break;
            case R.id.previousBtn:
                getStudent((stdIndex == 0) ? 0 : stdIndex--);
                break;
            case R.id.saveAllBtn:
                activity.saveAllStudents();
                break;
            default:
                Log.i("", "");
                break;
        }
    }

    public void updateStudentIndex(final int currentIndex){
        stdIndex = currentIndex;
    }

    private void getStudent(int stdIndex) {
        updateCurrentStudent();
        activity.showStudent(stdIndex);
    }

    private void updateCurrentStudent() {
        final TextView marks = getActivity().findViewById(R.id.markVal);
        activity.updateStudent(stdIndex, marks.toString());
    }
}
