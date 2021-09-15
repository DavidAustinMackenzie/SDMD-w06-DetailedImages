package au.edu.swin.sdmd.l05_detailedimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var name = findViewById<TextView>(R.id.name)
        var author = findViewById<TextView>(R.id.author)
        var latitude = findViewById<TextView>(R.id.latitude)
        var longitude = findViewById<TextView>(R.id.longitude)

        //Using Parceable Method
        val location = intent.getParcelableExtra<Location>("Station")
        name.text = location?.name.toString()
        author.text = location?.author.toString()
        latitude.text = location?.latitude.toString()
        longitude.text = location?.longitude.toString()
    }
}