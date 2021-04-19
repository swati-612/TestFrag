package com.tech.fragmenttest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.first_frag.*
import kotlinx.android.synthetic.main.first_frag.view.*


//step 1: create a class as a child of androidx.fragment.app.Fragment

open class FirstFrag : Fragment() {

    //step 2: same like onCreate() method in Activity,in fragment we have onCreateView()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        //step 3:use LayoutInflater to take the xml file into java

        var inflater = LayoutInflater.from(context)

        var view = inflater.inflate(R.layout.first_frag, container, false)

        view.button.setOnClickListener {
            Toast.makeText(activity, "fragment button clicked", Toast.LENGTH_SHORT).show()
            var fManager = activity!!.supportFragmentManager
            var tx = fManager.beginTransaction()
            tx.add(R.id.my_frame, NewFrag())//here the will be added to actviity
            tx.commit()
        }


        return view
    }
}