package com.actiknow.bloodconnect.utils;


import android.content.Context;
import android.content.SharedPreferences;

public class LoginDetailsPref {
    public static String USER_NAME = "user_name";
    public static String USER_EMAIL = "user_email";
    public static String USER_ID = "user_id";
    public static String USER_MOBILE = "user_mobile";
    public static String USER_BLOOG_GROUP = "user_blood_group";
    private static LoginDetailsPref loginDetailsPref;
    private String LOGIN_DETAILS = "LOGIN_DETAILS";

    public static LoginDetailsPref getInstance () {
        if (loginDetailsPref == null)
            loginDetailsPref = new LoginDetailsPref ();
        return loginDetailsPref;
    }

    private SharedPreferences getPref (Context context) {
        return context.getSharedPreferences (LOGIN_DETAILS, Context.MODE_PRIVATE);
    }

    public String getStringPref (Context context, String key) {
        return getPref (context).getString (key, "");
    }

    public int getIntPref (Context context, String key) {
        return getPref (context).getInt (key, 0);
    }

    public void putStringPref (Context context, String key, String value) {
        SharedPreferences.Editor editor = getPref (context).edit ();
        editor.putString (key, value);
        editor.apply ();
    }

    public void putIntPref (Context context, String key, int value) {
        SharedPreferences.Editor editor = getPref (context).edit ();
        editor.putInt (key, value);
        editor.apply ();
    }
}
