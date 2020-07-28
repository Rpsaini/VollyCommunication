package com.app.vollycommunicationlib;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import android.widget.ImageView;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;

public class UtilClass {
    private Context ct;

    public UtilClass(Context ct) {
        this.ct = ct;
    }

    private AlertDialog dialog;

    public void show_alert(String title, String message) {
        if (dialog != null && dialog.isShowing()) return;
        final AlertDialog.Builder builder = new AlertDialog.Builder(ct);
        builder.setTitle(title);
        builder.setMessage(message);

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {

                dialog.dismiss();
            }
        });
        dialog = builder.create();
        dialog.setCancelable(false);
        dialog.show();
    }

    public void show_alert_finish(String title, String message, final AppCompatActivity appCompatActivity) {
        if (dialog != null && dialog.isShowing()) return;
        final AlertDialog.Builder builder = new AlertDialog.Builder(ct);
        builder.setTitle(title);
        builder.setMessage(message);

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {

                dialog.dismiss();
                appCompatActivity.finish();
            }
        });
        dialog = builder.create();
        dialog.setCancelable(false);
        dialog.show();
    }

    public void show_alert_finish_next(String title, String message, final AppCompatActivity appCompatActivity, final Intent intent) {
        if (dialog != null && dialog.isShowing()) return;
        final AlertDialog.Builder builder = new AlertDialog.Builder(ct);
        builder.setTitle(title);
        builder.setMessage(message);

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {

                dialog.dismiss();
                ct.startActivity(intent);
                appCompatActivity.finish();

            }
        });
        dialog = builder.create();
        dialog.setCancelable(false);
        dialog.show();
    }






}
