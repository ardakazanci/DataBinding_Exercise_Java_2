package com.ardakazanci.databinding_exercise_java_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.ardakazanci.databinding_exercise_java_2.databinding.ActivityMainBinding;
import com.ardakazanci.databinding_exercise_java_2.model.User;

/**
 * Include Layout DataBinding Tutorial
 */

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // Layout Binding initialize
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        // Toolbar initialize
        setSupportActionBar(mainBinding.toolbar);

        // New User Object
        User user = new User();

        // User Property initialize
        user.setName("Arda");
        user.setEmail("test@gmail.com");

        // Binding User Object
        mainBinding.setUser(user);



    }


}
