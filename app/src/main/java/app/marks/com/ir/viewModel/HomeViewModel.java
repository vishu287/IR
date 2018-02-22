package app.marks.com.ir.viewModel;

import android.content.Intent;

/**
 * Created by vishwanathm on 2/7/2018.
 */

public interface HomeViewModel {
//    void init(Activity activity);

    void start();

    void onResult(int requestCode, int resultCode, Intent data);

    void signIn();

    void signOut();

    void signOut1();
}
