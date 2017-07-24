package com.asociadosmonterrubio.admin.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.asociadosmonterrubio.admin.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class ActivitySplashScreen extends AppCompatActivity {

    private final String TAG = ActivitySplashScreen.class.getSimpleName();
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        auth = FirebaseAuth.getInstance();
        startDelay();
    }

    private void startDelay(){
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                signInAnonymously();
            }
        }, 2000);
    }

    private void signInAnonymously(){
        Task<AuthResult> task = auth.signInAnonymously();
        task.addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Intent intent = new Intent(ActivitySplashScreen.this, ActivityHome.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(ActivitySplashScreen.this, "Authentication failed.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
