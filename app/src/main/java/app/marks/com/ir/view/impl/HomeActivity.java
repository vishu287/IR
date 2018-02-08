package app.marks.com.ir.view.impl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import app.marks.com.ir.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void login(View login) {
        Log.i("HomeActivity: ", "Login Button clicked");
        startActivity(new Intent(this, LoginActivity.class));
    }

    public void signup(View signup) {
        Log.i("HomeActivity: ", "Signup Button clicked");
        startActivity(new Intent(this, SignupActivity.class));
    }
}
