package app.marks.com.ir.form;

import android.widget.EditText;
import android.widget.Spinner;

import app.marks.com.ir.R;

/**
 * Created by vishwanathm on 2/2/2018.
 */

public class SignUpForm {

    private EditText name ;
    private EditText email;
    private EditText phone ;
    private Spinner subject;
    private Spinner classDiv;

    public EditText getName() {
        return name;
    }

    public void setName(EditText name) {
        this.name = name;
    }

    public EditText getEmail() {
        return email;
    }

    public void setEmail(EditText email) {
        this.email = email;
    }

    public EditText getPhone() {
        return phone;
    }

    public void setPhone(EditText phone) {
        this.phone = phone;
    }

    public Spinner getSubject() {
        return subject;
    }

    public void setSubject(Spinner subject) {
        this.subject = subject;
    }

    public Spinner getClassDiv() {
        return classDiv;
    }

    public void setClassDiv(Spinner classDiv) {
        this.classDiv = classDiv;
    }
}
