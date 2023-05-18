import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tubescobacoba.MainActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Simulate a delay for the splash screen
        Thread.sleep(3000) // 3 seconds

        // Start the MainActivity
        val intent = Intent(this@SplashActivity, MainActivity::class.java)
        startActivity(intent)

        // Finish the SplashActivity so that it cannot be accessed by pressing the back button
        finish()
    }
}
