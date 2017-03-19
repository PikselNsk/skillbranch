package info.javaway.skillbranch.ui.activities;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import info.javaway.skillbranch.R;
import info.javaway.skillbranch.utils.ConstantManager;

/**
 * Created by максим on 18.03.2017.
 */

public class BaseActivity extends AppCompatActivity {

    static final String TAG = ConstantManager.TAG_PREFIX + "BaseActivity";
    protected ProgressDialog mProgressDialog;

    public void showProgress() {
        if (mProgressDialog == null) {
            mProgressDialog = new ProgressDialog(this, R.style.custom_dialog);
            mProgressDialog.setCancelable(false);
            mProgressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            mProgressDialog.show();
            mProgressDialog.setContentView(R.layout.progress_splash);
        } else {
            mProgressDialog.show();
            mProgressDialog.setContentView(R.layout.progress_splash);
        }
    }

    public void hideProgress() {
        if ((mProgressDialog != null) && mProgressDialog.isShowing()) {
            mProgressDialog.hide();
        }
    }

    public void showWithDelay() {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                hideProgress();
            }
        }, 5000);
    }

    public void showError(String message, Exception error) {
        showTost(message);
        Log.d(TAG, error.toString());
    }

    public void showTost(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
