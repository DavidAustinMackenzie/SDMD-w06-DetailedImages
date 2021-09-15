package au.edu.swin.sdmd.l05_detailedimages

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val station = Location("Glenferrie Station", "Ada May Plante",
            -37.821539f, 145.036473f)

        val vStation = findViewById<TextView>(R.id.station)
        vStation.setOnClickListener {
            val intent = Intent(this,DetailActivity::class.java).apply{
                putExtra("Station",station)
            }
            startActivity(intent)
        }
    }
}