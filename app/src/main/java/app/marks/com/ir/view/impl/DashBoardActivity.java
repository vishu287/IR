package app.marks.com.ir.view.impl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.List;

import app.marks.com.ir.R;
import app.marks.com.ir.dto.Subject;
import app.marks.com.ir.viewModel.DashBoardViewModel;
import app.marks.com.ir.viewModel.HomeViewModel;
import app.marks.com.ir.viewModel.impl.DashBoardViewModelImpl;
import app.marks.com.ir.viewModel.impl.HomeViewModelImpl;

@EActivity(R.layout.activity_dash_board)
public class DashBoardActivity extends Activity {

    @ViewById(R.id.dashBoardLayout)
    LinearLayout layout;

    @Bean(DashBoardViewModelImpl.class)
    DashBoardViewModel dashBoardViewModel;

    HomeViewModel homeViewModel =null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        homeViewModel = new HomeViewModelImpl(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        final LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        final List<Subject> subjects = dashBoardViewModel.getUserSubjects("loggedin user");
        for (Subject subject : subjects) {
            final Button buttonView = new Button(this);
            buttonView.setText(subject.getName());
            buttonView.setId(subject.getId().hashCode());
            buttonView.setOnClickListener(mThisButtonListener);
            layout.addView(buttonView, layoutParams);
        }
    }

    @Click(R.id.dashBoard_signOut)
    public void goHome(View view) {
        Intent nextIntent = new Intent(this, HomeActivity_.class);
        System.out.println("--------------------Go to home---------------------------------> ");
        startActivity(nextIntent);
    }

    private View.OnClickListener mThisButtonListener = new View.OnClickListener() {
        public void onClick(View v) {
            System.out.println("--------------------onClick--------------------------------->" + v.getId());
            showNextActivity();
        }
    };

    private void showNextActivity() {
        Intent nextIntent = new Intent(this, StudentDetailsActivity_.class);
        System.out.println("--------------------Go to home---------------------------------> ");
        startActivity(nextIntent);
    }

    @Override
    protected void onStop() {
        super.onStop();
        final List<Subject> subjects = dashBoardViewModel.getUserSubjects("loggedin user");
        for (Subject subject : subjects) {
            final Button buttonView = findViewById(subject.getId().hashCode());
            layout.removeView(buttonView);
            System.out.println("--------------------findViewById--------------------------------->");
        }
        System.out.println("--------------------onResume--------------------------------->");
    }
}
