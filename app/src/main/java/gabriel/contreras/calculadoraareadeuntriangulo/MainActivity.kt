package gabriel.contreras.calculadoraareadeuntriangulo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val MostrarBase = findViewById<TextView>(R.id.txtMostrarBase)
        val MostrarAltura = findViewById<TextView>(R.id.txtMostrarAltura)

        val Base = findViewById<EditText>(R.id.txtBase)
        val Altura = findViewById<EditText>(R.id.txtAltura)

        val Area = findViewById<TextView>(R.id.txtArea)

        val botonArea = findViewById<Button>(R.id.btnCalcular)



        val objCalcularArea= CalcularArea()

        botonArea.setOnClickListener {
            val result = objCalcularArea.Area(Base.text.toString().toDouble(),Altura.text.toString().toDouble())

            MostrarBase.text= "${Base.text} cm"
            MostrarAltura.text= "${Altura.text} cm"
            Area.text= "El área es de: $result cm^2"
    }
}
}