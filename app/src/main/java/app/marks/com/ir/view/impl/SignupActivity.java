package app.marks.com.ir.view.impl;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import app.marks.com.ir.R;
import app.marks.com.ir.builder.form.SignUpFormBuilder;
import app.marks.com.ir.form.SignUpForm;
import app.marks.com.ir.viewModel.SignUpViewModel;
import app.marks.com.ir.view.SignUpView;


@EActivity(R.layout.activity_signup)
public class SignupActivity extends Activity implements SignUpView {

    SignUpViewModel signUpPresentor;

    SignUpFormBuilder signUpFormBuilder;

    /**
     * @param v
     */
    @Click(R.id.RegisterBtn)
    public void register(final View v) {
        //final SignUpForm form = signUpFormBuilder.convertFrom(this);
        //signUpPresentor.register(form);
        //EditText text = (EditText) findViewById(R.id.nameTxt);
        //System.out.println("===========================>"+text.getText());
    }

    @Override
    public boolean isValid(final SignUpForm form) {
        boolean valid = Boolean.FALSE;
        if (TextUtils.isEmpty(form.getName().getText().toString())) {

        } else if (TextUtils.isEmpty(form.getEmail().getText().toString())) {

        }
        return valid;
    }
}
