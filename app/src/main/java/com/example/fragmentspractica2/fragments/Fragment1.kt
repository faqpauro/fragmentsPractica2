package com.example.fragmentspractica2.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.fragmentspractica2.R
import com.example.fragmentspractica2.entidades.ClienteParcel

class Fragment1 : Fragment() {

    lateinit var v: View

    companion object {
        fun newInstance() = Fragment1()
    }

    private lateinit var viewModel: Fragment1ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment_fragment1, container, false)
        return v;
    }

    override fun onStart(){
        super.onStart()
        val btnNav = v.findViewById<Button>(R.id.button1)
        btnNav.setOnClickListener{
            val objetoKtn = ClienteParcel("Martin")
            val action = Fragment1Directions.actionFragment13ToFragment22(objetoKtn)
            v.findNavController().navigate(action)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Fragment1ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}