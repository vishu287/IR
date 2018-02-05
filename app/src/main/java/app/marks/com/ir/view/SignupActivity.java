package app.marks.com.ir.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

import app.marks.com.ir.R;
import app.marks.com.ir.builder.form.SignupFormBuilder;
import app.marks.com.ir.form.SignupForm;
import app.marks.com.ir.service.UserRegistrationService;
import app.marks.com.ir.service.impl.UserRegistrationServiceImpl;

public class SignupActivity extends AppCompatActivity {
    UserRegistrationService userRegistrationService;
    SignupFormBuilder signupFormBuilder;

    private void initObjs() {
        userRegistrationService = new UserRegistrationServiceImpl();
        signupFormBuilder = new SignupFormBuilder();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        initObjs();
    }

    public void register(View v) {
        final SignupForm form = signupFormBuilder.convertFrom(this);
        try {
            userRegistrationService.register(form);
        } catch (Exception e) {
            Log.e("SignupActivity: ", "Exception: " + e.getMessage());
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT);
        }
    }
}
