package app.marks.com.ir.view.impl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.googlecode.androidannotations.annotations.Bean;

import app.marks.com.ir.R;
import app.marks.com.ir.builder.form.SignUpFormBuilder;
import app.marks.com.ir.form.SignUpForm;
import app.marks.com.ir.presenter.SignUpPresentor;
import app.marks.com.ir.presenter.impl.SignUpPresentorImpl;
import app.marks.com.ir.service.UserRegistrationService;
import app.marks.com.ir.service.impl.UserRegistrationServiceImpl;
import app.marks.com.ir.view.SignUpView;

public class SignupActivity extends AppCompatActivity implements SignUpView {

    /**
     *
     */
    @Bean(SignUpPresentorImpl.class)
    private SignUpPresentor signUpPresentor;

    /**
     *
     */
    @Bean(SignUpFormBuilder.class)
    private SignUpFormBuilder signUpFormBuilder;

    /**
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    /**
     *
     * @param v
     */
    public void register(final View v) {
        final SignUpForm form = signUpFormBuilder.convertFrom(this);
        signUpPresentor.register(form);
    }

    @Override
    public boolean isValid(final SignUpForm form) {
        boolean valid = Boolean.FALSE;
        if(TextUtils.isEmpty(form.getName().getText().toString())){

        }else if (TextUtils.isEmpty(form.getEmail().getText().toString())){

        }
        return valid;
    }
}
