package com.cpcit.workshopnews;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private Activity activity;
    private EditText edtUsername;
    private EditText edtPassword;
    private EditText edtPasswordConfirm;
    private EditText edtDisplayName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        activity = RegisterActivity.this;

        bindWidget();
        setListener();
    }

    private void bindWidget() {
        //TODO bind widget
        edtUsername = (EditText) findViewById(R.id.edt_username);
        edtPassword = (EditText) findViewById(R.id.edt_password);
        edtPasswordConfirm = (EditText) findViewById(R.id.edt_password_con);
        edtDisplayName = (EditText) findViewById(R.id.edt_display_name);
    }

    private void setListener() {
        Button btnLogin = (Button) findViewById(R.id.btn_register);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO button login clicked

                if (validate())
                    requestRegister();

            }
        });
    }

    private boolean validate() {
        //TODO validate form
        String username = edtUsername.getText().toString();
        String password = edtPassword.getText().toString();
        String passwordConfirm = edtPasswordConfirm.getText().toString();
        String displayName = edtDisplayName.getText().toString();

        if (username.isEmpty()) return false;

        if (password.isEmpty()) return false;

        if (passwordConfirm.isEmpty())
            return false;

        if (!password.equals(passwordConfirm))
            return false;

        if (displayName.isEmpty()) return false;

        return true;
    }

    private void requestRegister() {
        //TODO request services register
        finish();
    }


}
