package app.marks.com.ir.viewModel.impl;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import app.marks.com.ir.R;
import app.marks.com.ir.view.impl.DashBoardActivity_;
import app.marks.com.ir.view.impl.HomeActivity_;
import app.marks.com.ir.viewModel.HomeViewModel;

/**
 * Created by vishwanathm on 2/7/2018.
 */

public class HomeViewModelImpl implements HomeViewModel {
    private static final int RC_SIGN_IN = 9001;

    private GoogleSignInClient mGoogleSignInClient;

    private static final String TAG = HomeViewModelImpl.class.getSimpleName();

    private Activity activity = null;

    public HomeViewModelImpl(Activity activity) {
        System.out.println("--------------------------HomeViewModelImplHomeViewModelImplHomeViewModelImpl-------------------------------->");
        this.activity = activity;
        final GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        mGoogleSignInClient = GoogleSignIn.getClient(activity, gso);
    }

    public void start() {
        SignInButton signInButton = activity.findViewById(R.id.home_signIn);
        signInButton.setSize(SignInButton.SIZE_STANDARD);
        signInButton.setColorScheme(SignInButton.COLOR_LIGHT);
        final GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(activity);
        updateUI(account);
    }

    public void onResult(int requestCode, int resultCode, Intent data) {
        // Result returned from launching the Intent from GoogleSignInClient.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            // The Task returned from this call is always completed, no need to attach
            // a listener.
            final Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            handleSignInResult(task);
        }
    }

    public void signIn() {
        final Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        activity.startActivityForResult(signInIntent, RC_SIGN_IN);
    }

    public void signOut() {
        mGoogleSignInClient.signOut()
                .addOnCompleteListener(activity, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        updateUI(null);
                    }
                });
    }

    public void signOut1() {

        final GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        mGoogleSignInClient = GoogleSignIn.getClient(activity, gso);
        mGoogleSignInClient.signOut();
        System.out.println("-----------------mGoogleSignInClient------------------------------------> " + mGoogleSignInClient);
        activity.startActivity(new Intent(activity, HomeActivity_.class));
        System.out.println("-----------------mGoogleSignInClient------------------------------------> " + mGoogleSignInClient);
    }

    private void updateUI(@Nullable GoogleSignInAccount account) {
        if (account != null) {
            final Intent nextIntent = new Intent(activity, DashBoardActivity_.class);
            System.out.println("-----------------------------------------------------> " + account.getEmail());
            activity.startActivity(nextIntent);
        }
    }

    private void handleSignInResult(Task<GoogleSignInAccount> completedTask) {
        try {
            final GoogleSignInAccount account = completedTask.getResult(ApiException.class);
            // Signed in successfully, show authenticated UI.
            updateUI(account);
        } catch (ApiException e) {
            // The ApiException status code indicates the detailed failure reason.
            // Please refer to the GoogleSignInStatusCodes class reference for more information.
            Log.w(TAG, "signInResult:failed code=" + e.getStatusCode());
            updateUI(null);
        }
    }
}
