package app.marks.com.ir.view.impl;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import app.marks.com.ir.R;
import app.marks.com.ir.dto.Student;

public class ShowStudentFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_show_student, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }


    public void displayStudentDetails(final Student user){
        final TextView rollNoVal = getActivity().findViewById(R.id.rollNoVal);
        final TextView stdNameVal = getActivity().findViewById(R.id.stdNameVal);
        final TextView depVal = getActivity().findViewById(R.id.depVal);
        final TextView academicYrVal = getActivity().findViewById(R.id.academicYrVal);
        final TextView markVal = getActivity().findViewById(R.id.markVal);

        rollNoVal.setText(user.getPerson().getRollNumber());
        stdNameVal.setText(user.getPerson().getFullName());
        depVal.setText(user.getDepartment().getName());
        academicYrVal.setText(user.getAcademicYear());
        markVal.setText(user.getMarks());
    }
}
