package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button: Button = findViewById(R.id.btResult) // to variable button to btResult
        button.setOnClickListener{ view ->
            var x: Int = edtxt1.text.toString().toInt();
            var y: Int = edtxt2.text.toString().toInt()
            resultTV.text = sum(x,y).toString();

        }

    }
}
public fun USDtoJOD(a:Float):Float{
    val b=0.709f;
    return a*b;
}
public fun JODtoUSD(a:Float):Float{
    val c=0.709f;
    return a/c;
}
public fun EURtoJOD(a:Float):Float{
    val b=0.70502f;
    return a*b;
}
public fun JODtoEUR(a:Float):Float{
    val c=0.70502f;
    return a/c;
}
public fun EURtoUSD(a:Float):Float{
    val b=0.9943f;
    return a*b;
}
public fun USDtoEUR(a:Float):Float{
    val c=0.9943f;
    return a/c;
}
