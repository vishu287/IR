package app.marks.com.ir.presenter.impl;

import android.util.Log;

import javax.inject.Inject;

import app.marks.com.ir.common.exception.AppException;
import app.marks.com.ir.form.SignUpForm;
import app.marks.com.ir.presenter.SignUpPresentor;
import app.marks.com.ir.service.UserRegistrationService;

/**
 * Created by vishwanathm on 2/7/2018.
 */

public class SignUpPresentorImpl implements SignUpPresentor {

    @Inject
    private UserRegistrationService userRegistrationService;

    public void register(final SignUpForm form){
        try {
            userRegistrationService.register(form);
        } catch (Exception e) {
            Log.e("SignupActivity: ", "Exception: " + e.getMessage());
            //Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT);
            throw new AppException("Problem in registration: ",e);
        }

    }
}
