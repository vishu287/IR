package app.marks.com.ir.view.impl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import app.marks.com.ir.R;
import app.marks.com.ir.viewModel.HomeViewModel;
import app.marks.com.ir.viewModel.impl.HomeViewModelImpl;

@EActivity(R.layout.activity_home)
public class HomeActivity extends Activity {

    private static final String TAG = HomeActivity.class.getSimpleName();

    HomeViewModel homeViewModel =null;

    @ViewById(R.id.login_progress)
    View mProgressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        homeViewModel = new HomeViewModelImpl(this);
    }

    @Override
    public void onStart() {
        super.onStart();
        homeViewModel.start();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        homeViewModel.onResult(requestCode, resultCode, data);
    }

    @Click(R.id.home_signIn)
    public void login(View login) {
        Log.i(TAG, "Login Button clicked");
        homeViewModel.signIn();
    }

    @Click(R.id.home_signOut)
    public void signOut(View login) {
        Log.i(TAG, "signOut Button clicked");
        homeViewModel.signOut();
    }

    @Click(R.id.home_signup)
    public void signup(View signup) {
        Log.i(TAG, "Signup Button clicked");
        startActivity(new Intent(this, SignupActivity_.class));
    }
}
