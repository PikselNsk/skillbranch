package info.javaway.skillbranch.ui.activities;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import info.javaway.skillbranch.utils.ConstantManager;

/**
 * Created by максим on 18.03.2017.
 */

public class BaseActivity extends AppCompatActivity {

    static final String TAG = ConstantManager.TAG_PREFIX + "BaseActivity";
    protected ProgressDialog mProgressDialog;

    public void showProgress(){
        if (mProgressDialog == null){
            mProgressDialog = new ProgressDialog(this, )
        }
    }

    public void hideProgress(){}

    public void showError(String message, Exception error){
        showTost(message);
        Log.d(TAG, error.toString());
    }

    public void showTost(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
