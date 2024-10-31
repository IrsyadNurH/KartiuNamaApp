package lam.pam.kartunamaapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameInput = findViewById<EditText>(R.id.name_input)
        val jobInput = findViewById<EditText>(R.id.job_input)
        val phoneInput = findViewById<EditText>(R.id.phone_input)
        val emailInput = findViewById<EditText>(R.id.email_input)
        val saveButton = findViewById<Button>(R.id.save_button)

        saveButton.setOnClickListener {
            val name = nameInput.text.toString()
            val job = jobInput.text.toString()
            val phone = phoneInput.text.toString()
            val email = emailInput.text.toString()

            val intent = Intent(this, CardDisplayActivity::class.java).apply {
                putExtra("EXTRA_NAME", name)
                putExtra("EXTRA_JOB", job)
                putExtra("EXTRA_PHONE", phone)
                putExtra("EXTRA_EMAIL", email)
            }
            startActivity(intent)
        }
    }
}