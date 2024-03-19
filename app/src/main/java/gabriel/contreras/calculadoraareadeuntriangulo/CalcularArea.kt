package gabriel.contreras.calculadoraareadeuntriangulo

import android.hardware.Camera.Area

class CalcularArea {

    fun Area(Base: Double,Altura:Double): Double{

        val resultado = (Base*Altura)/2

        return resultado
    }
}