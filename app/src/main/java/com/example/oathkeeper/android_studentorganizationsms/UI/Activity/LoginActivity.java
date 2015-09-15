package com.example.oathkeeper.android_studentorganizationsms.UI.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.oathkeeper.android_studentorganizationsms.R;
import com.example.oathkeeper.android_studentorganizationsms.UI.Activity.Base.BaseActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 登陆、注册的Activity
 * Created by Oathkeeper on 2015/9/7
 */

public class LoginActivity extends BaseActivity {
    @Bind(R.id.editText_school_number)
    EditText editTextSchoolNumber;
    @Bind(R.id.editText_password)
    EditText editTextPassword;
    @Bind(R.id.button_login)
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // requestWindowFeature(Window.FEATURE_NO_TITLE);//注意这个方法必须在setContentView之前用
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }


}
