package com.pb.learning.mykotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.appcompat.widget.Toolbar
import android.transition.TransitionManager
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var constraintLayoutMain: ConstraintLayout? = null

    private var defalutKeyFrameButton: Button? = null

    private var keyFrameOneButton: Button? = null

    private var toolbar : Toolbar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keyframe)
        toolbar = findViewById(R.id.toolbar)
        setActionBar(toolbar as? android.widget.Toolbar)
        constraintLayoutMain = findViewById(R.id.constrainLayout )
        defalutKeyFrameButton = findViewById(R.id.defaultKeyFrameButton)
        keyFrameOneButton = findViewById(R.id.KeyFrameOneButton)
        defalutKeyFrameButton?.setOnClickListener { v: View ->
            if(v is Button){
            Log.e("keyframe","default")
                val constraintSet = ConstraintSet()
                constraintSet.clone(this, R.layout.key_frame_default)
                TransitionManager.beginDelayedTransition(constraintLayoutMain)
                constraintSet.applyTo(constraintLayoutMain)
            }
        }

        keyFrameOneButton?.setOnClickListener { v: View ->
            if(v is Button){
            Log.e("keyframe","keyframe1")
                val constraintSet = ConstraintSet()
                constraintSet.clone(this, R.layout.key_frame_one)
                TransitionManager.beginDelayedTransition(constraintLayoutMain)
                constraintLayoutMain ?: constraintSet.applyTo(constraintLayoutMain)
            }
        }
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume(){
        super.onResume()
    }
}
