package com.example.kalkulatorsederhana

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    // initiate variable for text bcs is flexible,
    // and then put in outer
    private lateinit var input1:EditText
    private lateinit var input2:EditText
    private lateinit var viewHasil:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get element text and input to variable
        input1 = findViewById(R.id.txt_input1)
        input2 = findViewById(R.id.txt_input2)
        viewHasil = findViewById(R.id.txt_hasil)

        // get element button
        val btnTambah:Button = findViewById(R.id.btn_tambah)
        val btnKurang:Button = findViewById(R.id.btn_kurang)
        val btnKali:Button = findViewById(R.id.btn_kali)
        val btnBagi:Button = findViewById(R.id.btn_bagi)
        val btnModulus:Button = findViewById(R.id.btn_modulus)

        // set action Listener saat di Click
        btnTambah.setOnClickListener(this)
        btnKurang.setOnClickListener(this)
        btnKali.setOnClickListener(this)
        btnBagi.setOnClickListener(this)
        btnModulus.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        // check input
        if(input1.text.isEmpty()){
            input1.setError("Masukkan Angka Pertama!");
        }else if(input2.text.isEmpty()){
            input2.setError("Masukkan Angka Kedua!");
        }else {

            // run method
            if (v != null) {
                when (v.id) {
                    R.id.btn_tambah -> {
                        val ht =
                            input1.text.toString().trim().toDouble() +
                                    input2.text.toString().trim().toDouble();
                        viewHasil.text = ht.toString();
                    }

                    R.id.btn_kurang -> {
                        val hku =
                            input1.text.toString().trim().toDouble() -
                                    input2.text.toString().trim().toDouble();
                        viewHasil.text = hku.toString();
                    }

                    R.id.btn_kali -> {
                        val hkl =
                            input1.text.toString().trim().toDouble() *
                                    input2.text.toString().trim().toDouble();
                        viewHasil.text = hkl.toString();
                    }

                    R.id.btn_bagi -> {
                        val hb =
                            input1.text.toString().trim().toDouble() /
                                    input2.text.toString().trim().toDouble();
                        viewHasil.text = hb.toString();
                    }

                    R.id.btn_modulus -> {
                        val hm =
                            input1.text.toString().trim().toDouble() %
                                    input2.text.toString().trim().toDouble();
                        viewHasil.text = hm.toString();
                    }
                }
            }
        }


    }
}