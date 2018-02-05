package app.marks.com.ir.service.impl;

import java.util.ArrayList;
import java.util.List;

import app.marks.com.ir.builder.form.SignupFormBuilder;
import app.marks.com.ir.common.exception.AppException;
import app.marks.com.ir.form.SignupForm;
import app.marks.com.ir.service.UserRegistrationService;

/**
 * Created by vishwanathm on 2/5/2018.
 */

public class UserRegistrationServiceImpl implements UserRegistrationService {



    @Override
    public void register(final SignupForm signupForm) {

        if (isUserValid(signupForm.getPhone(), signupForm.getEmail())) {
            //store in DB by calling the rest api
        } else {
            throw new AppException("You are not allowed for registration.");
        }

    }

    private boolean isUserValid(final String phone, final String email) {
        return getPhones().contains(phone);
    }

    private List<String> getPhones() {
        final List<String> phones = new ArrayList<>();
        phones.add("1234567890");
        phones.add("1234567891");
        phones.add("1234567892");
        return phones;
    }
}
