package com.example.task2

import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.task2.databinding.ActivitySecondBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.button1SecondActivity.setOnClickListener {
            Toast.makeText(this, "Toast button was clicked", Toast.LENGTH_SHORT).show()
        }

        binding.button2SecondActivity.setOnClickListener {
            MaterialAlertDialogBuilder(this)
                .setTitle(getString(R.string.dialogTitle))
                .setMessage("Some text")
                .setNeutralButton(getString(R.string.cancelButtonText)) { dialog, which ->
                    closeOptionsMenu()
                }
                .setPositiveButton("Accept") { dialog, which ->
                    binding.textViewSecondActivity.text = "You have accepted the rules"
                    closeOptionsMenu()
                }
                .show()
        }

        binding.button3SecondActivity.setOnClickListener {
            Snackbar.make(it, "Snackbar button was clicked", Snackbar.LENGTH_LONG).show()
        }

        val singleItems = arrayOf("Cucumber", "Banana", "Lemon")
        val checkedItem = 0
        var chosen = "Default"
        binding.button4SecondActivity.setOnClickListener {
            MaterialAlertDialogBuilder(this)
                .setTitle(getString(R.string.dialogTitle))
                .setNeutralButton(getString(R.string.cancelButtonText)) { dialog, which ->
                    dialog.cancel()
                }
                .setPositiveButton("OK") { dialog, which ->
                    binding.textViewSecondActivity.text = "You have chosen a $chosen"
                    closeOptionsMenu()
                }
                .setSingleChoiceItems(singleItems, checkedItem) { dialog, which ->
                    chosen = singleItems[which]
                }
                .show()
        }
    }

}