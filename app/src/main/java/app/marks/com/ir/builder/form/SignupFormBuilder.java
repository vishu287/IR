package app.marks.com.ir.builder.form;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;
import android.widget.Spinner;

import app.marks.com.ir.R;
import app.marks.com.ir.form.SignupForm;

/**
 * Created by vishwanathm on 2/2/2018.
 */

public class SignupFormBuilder extends FormBuilder<AppCompatActivity, SignupForm>{

    @Override
    public SignupForm convertFrom(AppCompatActivity activity, SignupForm signupForm) {

        final EditText name = activity.findViewById(R.id.nameTxt);
        final EditText email = activity.findViewById(R.id.emailTxt);
        final EditText phone = activity.findViewById(R.id.phoneTxt);
        final Spinner subject = activity.findViewById(R.id.subjectSpnr);
        final Spinner classDiv = activity.findViewById(R.id.classDivSpnr);

        signupForm.setName(name.getText().toString());
        signupForm.setEmail(email.getText().toString());
        signupForm.setPhone(phone.getText().toString());
        signupForm.setClassDiv(String.valueOf(classDiv.getSelectedItem()));
        signupForm.setSubject(String.valueOf(classDiv.getSelectedItem()));

        Log.i("SignupActivity: ", "email: " + email.getText());
        Log.i("SignupActivity: ", "phone: " + phone.getText());
        Log.i("SignupActivity: ", "subject: " + subject.getSelectedItem());
        Log.i("SignupActivity: ", "subject: " + classDiv.getSelectedItem());
        return signupForm;
    }

}
