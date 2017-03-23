package info.javaway.skillbranch.data.managers;

import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.List;

import info.javaway.skillbranch.utils.ConstantManager;
import info.javaway.skillbranch.utils.SkillbranchApplication;

public class PreferencesManager {
    private SharedPreferences mSharedPreferences;
    private static final String[] USER_FIELDS =
            {ConstantManager.USER_PHONE_KEY, ConstantManager.USER_MAIL_KEY, ConstantManager.USER_VK_KEY,
                    ConstantManager.USER_GIT_KEY, ConstantManager.USER_BIO_KEY};

    public PreferencesManager() {
        this.mSharedPreferences = SkillbranchApplication.getSharedPreferences();
    }

    public void saveUserProfileData(List<String> userFields){
        SharedPreferences.Editor mEditor = mSharedPreferences.edit();
        for (int i = 0; i < USER_FIELDS.length; i++) {
            mEditor.putString(USER_FIELDS[i], userFields.get(i));
        }
        mEditor.apply();
    }

    public List<String> loadUserProfileData(){
        List<String> userFields = new ArrayList<>();
        userFields.add(mSharedPreferences.getString(ConstantManager.USER_PHONE_KEY, "null"));
        userFields.add(mSharedPreferences.getString(ConstantManager.USER_MAIL_KEY, "null"));
        userFields.add(mSharedPreferences.getString(ConstantManager.USER_VK_KEY, "null"));
        userFields.add(mSharedPreferences.getString(ConstantManager.USER_GIT_KEY, "null"));
        userFields.add(mSharedPreferences.getString(ConstantManager.USER_BIO_KEY, "null"));
        return userFields;
    }

}
