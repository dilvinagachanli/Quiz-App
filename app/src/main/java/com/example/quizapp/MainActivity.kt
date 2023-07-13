package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_start : Button = findViewById(R.id.btn_start)
        val et_name: EditText = findViewById(R.id.et_name)


        btn_start.setOnClickListener{

            if (et_name.text.isEmpty()){
                Toast.makeText(this,"Please enter your name." , Toast.LENGTH_LONG).show()
            }
            else{
                val intent = Intent(this, QuizQuestionsActivity::class.java) //going from one activity to other
                startActivity(intent)
                finish()


            }

        }
    }
}

//In general, an Intent is a fundamental component of the Android operating system that represents an intention to perform an action. It can be seen as a message object that facilitates communication between different components within an Android application, as well as between different applications.
//
//An Intent can be used for various purposes, including:
//
//Starting activities: You can use an Intent to launch a new activity within your application or even start an activity in another application. This allows you to navigate between different screens or launch external apps.
//
//Starting services: Intent can be used to start a background service that performs a specific task, such as downloading a file, playing music, or syncing data.
//
//Broadcasting events: An Intent can be broadcasted to notify other components or applications about specific events or actions that have occurred. Other components or apps can register to receive these broadcasts and perform appropriate actions.
//
//Passing data: Intent can carry data between different components or applications. You can attach extra data (e.g., strings, integers, Parcelable objects) to an Intent using key-value pairs.
//
//Explicit and implicit actions: An Intent can have an explicit or implicit action. An explicit intent specifies the target component by its class name, while an implicit intent describes the action to be performed, allowing the system to find the appropriate component to handle it.
//
//Overall, an Intent serves as a mechanism for communication and coordination between different parts of an Android application or between different applications, enabling various actions to be performed, data to be shared, and events to be broadcasted.