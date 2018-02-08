package app.marks.com.ir.builder;

/**
 * Created by vishwanathm on 2/2/2018.
 */

public interface Builder<A, B> {

//    public void test(AppCompatActivity activity){
//        activity.findViewById(R.id.emailTxt);
//    }

    public B convertFrom(A a);

    public A convertTo(B b);
}
