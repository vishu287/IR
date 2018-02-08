package app.marks.com.ir.builder.form;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;
import android.widget.Spinner;

import app.marks.com.ir.R;
import app.marks.com.ir.form.SignUpForm;

/**
 * Created by vishwanathm on 2/2/2018.
 */

public class SignUpFormBuilder extends FormBuilder<AppCompatActivity, SignUpForm> {

    @Override
    public SignUpForm convertFrom(AppCompatActivity activity, SignUpForm signUpForm) {
        if (signUpForm == null) {
            signUpForm = new SignUpForm();
        }
        signUpForm.setName((EditText) activity.findViewById(R.id.nameTxt));
        signUpForm.setEmail((EditText) activity.findViewById(R.id.emailTxt));
        signUpForm.setPhone((EditText) activity.findViewById(R.id.phoneTxt));
        signUpForm.setClassDiv((Spinner) activity.findViewById(R.id.subjectSpnr));
        signUpForm.setSubject((Spinner) activity.findViewById(R.id.classDivSpnr));

        Log.i("SignupActivity: ", "email: " + signUpForm.getEmail().getText());
        Log.i("SignupActivity: ", "phone: " + signUpForm.getPhone().getText());
        Log.i("SignupActivity: ", "subject: " + signUpForm.getSubject().getSelectedItem());
        Log.i("SignupActivity: ", "subject: " + signUpForm.getClassDiv().getSelectedItem());
        return signUpForm;
    }

}
