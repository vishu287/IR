package app.marks.com.ir.builder.form;

import android.support.v7.app.AppCompatActivity;

import app.marks.com.ir.builder.Builder;
import app.marks.com.ir.form.SignupForm;

/**
 * Created by vishwanathm on 2/2/2018.
 */

public abstract class FormBuilder<AppCompatActivity, B> implements Builder<AppCompatActivity, B> {

    public abstract B convertFrom(AppCompatActivity appCompatActivity, B b);

    public B convertFrom(AppCompatActivity appCompatActivity){
        B b= null;
        if(appCompatActivity!=null){
            b = convertFrom(appCompatActivity);
        }
        return b;
    }

    public AppCompatActivity convertTo(B b){
        throw  new UnsupportedOperationException("UnsupportedOperation");
    }
}
