package com.pb.learning.mykotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.constraint.ConstraintSet
import android.transition.TransitionManager

class MainActivity : AppCompatActivity() {

    var constraintLayoutMain:ConstraintLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.original)
        constraintLayoutMain = findViewById(R.id.constraintLayout_main )

    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume(){
        super.onResume()
        val constraintSet = ConstraintSet()
        constraintSet.clone(this,R.layout.activity_main)
        TransitionManager.beginDelayedTransition(constraintLayoutMain)
        constraintLayoutMain?:constraintSet.applyTo(constraintLayoutMain)
    }
}
