package com.example.loginadauser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.loginadauser.View.MainActivity;
import com.example.loginadauser.View.activity_items;
import com.google.firebase.auth.FirebaseAuth;

public class UsersActivity extends AppCompatActivity {
    Button openTeachersActivityBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);


        openTeachersActivityBtn = findViewById ( R.id.openTeachersActivityBtn );
        openTeachersActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UsersActivity.this, activity_items.class);
                startActivity(i);
            }
        });


        Button logoutUser = findViewById(R.id.logout_user);
        logoutUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(), Login.class));
            }
        });
    }
}