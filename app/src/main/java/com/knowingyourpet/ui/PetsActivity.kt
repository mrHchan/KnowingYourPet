package com.knowingyourpet.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.knowingyourpet.R
import kotlinx.android.synthetic.main.activity_pets.*

class PetsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pets)

        bottomNavigationView.setupWithNavController(petsNavHostFragment.findNavController())
    }
}