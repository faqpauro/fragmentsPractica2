package com.example.fragmentspractica2.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.fragmentspractica2.R

// TODO: Rename parameter arguments, choose names that match

class Fragment2 : Fragment() {

    lateinit var v: View
    lateinit var b: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        v = inflater.inflate(R.layout.fragment_2, container, false)

        b = v.findViewById<Button>(R.id.button2)

        b.setOnClickListener{
            //val action = Fragment2Directions.actionFragment22ToFragment132()
            v.findNavController().navigateUp()
        }

        return v;
    }

    override fun onStart(){
        super.onStart()

        val unCliente = Fragment2Args.fromBundle(requireArguments()).uncliente //recibe el argumento del primer fragmento

        b.setText((unCliente.nombre.toString()))
    }


}