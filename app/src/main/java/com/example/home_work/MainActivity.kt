package com.example.home_work

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
//import android.widget.EditText
//import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.data_binding.Person
import com.example.home_work.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var btnSub: Button

    private lateinit var bindings: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        bindings = DataBindingUtil.setContentView(this,R.layout.activity_main)

        bindings.btnSubmit.setOnClickListener {
            var name : String =edt_name.text.toString()
            var job : String = edt_job.text.toString()
            Log.d("name",name)
            Log.d("job",job)
            var Person: Person = Person(name, job)
            bindings.persons=Person
        }

    }

}

