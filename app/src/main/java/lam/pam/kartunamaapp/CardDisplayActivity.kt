package lam.pam.kartunamaapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class CardDisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_display)

        val displayName = findViewById<TextView>(R.id.display_name)
        val displayJob = findViewById<TextView>(R.id.display_job)
        val displayPhone = findViewById<TextView>(R.id.display_phone)
        val displayEmail = findViewById<TextView>(R.id.display_email)

        val name = intent.getStringExtra("EXTRA_NAME")
        val job = intent.getStringExtra("EXTRA_JOB")
        val phone = intent.getStringExtra("EXTRA_PHONE")
        val email = intent.getStringExtra("EXTRA_EMAIL")

        displayName.text = name
        displayJob.text = job
        displayPhone.text = phone
        displayEmail.text = email
    }
}
