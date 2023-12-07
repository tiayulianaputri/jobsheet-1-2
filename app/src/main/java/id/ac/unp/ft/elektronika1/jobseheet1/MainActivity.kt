package id.ac.unp.ft.elektronika1.jobseheet1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var namaEditText: EditText
    private lateinit var buttonButton: Button
    private lateinit var buttonTextView: TextView

    private fun initComponents(){
        namaEditText = findViewById(R.id.nameEditText)
        buttonButton = findViewById(R.id.buttonButton)
        buttonTextView = findViewById(R.id.buttonTextView)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_word)

        initComponents()

        buttonTextView.text = resources.getString(R.string.app_name)

        buttonButton.setOnClickListener {
            val name = namaEditText.text.toString()
            buttonTextView.text = resources.getString(R.string.buttonTextView,name)

            resources.getStringArray(R.array.names).forEach {
                Log.i("PZN",it)
            }
        }
   }
}