package app.marks.com.ir.viewModel.impl;

import android.util.Log;

import app.marks.com.ir.common.exception.AppException;
import app.marks.com.ir.form.SignUpForm;
import app.marks.com.ir.service.UserRegistrationService;
import app.marks.com.ir.viewModel.SignUpViewModel;

/**
 * Created by vishwanathm on 2/7/2018.
 */

public class SignUpViewModelImpl implements SignUpViewModel {

     UserRegistrationService userRegistrationService;

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
