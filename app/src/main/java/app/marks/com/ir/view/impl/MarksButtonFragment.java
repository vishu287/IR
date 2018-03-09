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

public class MarksButtonFragment extends Fragment implements View.OnClickListener {

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

        final Button nextBtn = getActivity().findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(this);
        final Button previousBtn = getActivity().findViewById(R.id.previousBtn);
        previousBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(final View view) {
        switch (view.getId()) {
            case R.id.nextBtn:
                int crIndxN = stdIndex;
                int indxN = stdIndex + 1;
                displayNextOrPreviousStudent(crIndxN, indxN);
                stdIndex = indxN;
                break;
            case R.id.previousBtn:
                int crIndxP = stdIndex;
                int indxP = (stdIndex == 0) ? 0 : stdIndex - 1;
                displayNextOrPreviousStudent(crIndxP, indxP);
                stdIndex = indxP;
                break;
            case R.id.saveAllBtn:
                activity.saveAllStudents();
                break;
            default:
                Log.i("", "");
                break;
        }
    }

    public void updateStudentIndex(final int currentIndex) {
        stdIndex = currentIndex;
    }

    private void displayNextOrPreviousStudent(final int currentStdIndex, final int stdIndex) {
        updateCurrentStudentMarks(currentStdIndex);
        activity.showStudent(stdIndex);
    }

    private void updateCurrentStudentMarks(int currentStdIndex) {
        final TextView marks = getActivity().findViewById(R.id.markVal);
        activity.updateStudentMarks(currentStdIndex, marks.getText().toString());
    }
}
