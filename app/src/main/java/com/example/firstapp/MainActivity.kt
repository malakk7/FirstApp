package com.example.firstapp

import android.widget.EditText
import android.widget.TextView
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.*
import androidx.core.widget.doOnTextChanged
import com.google.android.material.navigation.NavigationBarView


class MainActivity<string> : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val edtxt1: EditText = findViewById(R.id.Numtochange)
        val button: Button = findViewById(R.id.btResult) // to variable button to btResult
        val textResult: TextView = findViewById(R.id.textResult)

        var flag:String ="USD"
        val spinnerVal :Spinner =findViewById(R.id.from)
        var options =arrayOf("USD","EUR","CAD","SAR")
        spinnerVal.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options )

        //spinnerVal.adapter= ArrayAdapter<string>(this,android.R.layout.simple_list_item_1,options)

        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
               flag=options.get(position)//position is the index in the array
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }
        button.setOnClickListener{ view ->
            var x: Float = edtxt1.text.toString().toFloat();
            if(flag=="USD")
                textResult.text=USDtoJOD(x).toString();
            else if(flag=="EUR")
                textResult.text=EURtoJOD(x).toString();
            else if (flag=="CAD")
                textResult.text=CADtoJOD(x).toString();
            else if(flag=="SAR")
                textResult.text=SARtoJOD(x).toString();
        }

    }

  //??? create function for arrayadapter???  private fun <T> ArrayAdapter(mainActivity: MainActivity<T>, simpleListItem1: Int, options: Array<String>): SpinnerAdapter? {

    }

    public fun USDtoJOD(a:Float):Float{
    val b=0.709f;
    return a*b;
}
public fun EURtoJOD(a:Float):Float{
    val b=0.70502f;
    return a*b;
}
public fun CADtoJOD(a:Float):Float{
    val b=0.520f;
    return a*b;
}
public fun SARtoJOD(a:Float):Float{
    val b=0.189f;
    return a*b;
}


public fun JODtoUSD(a:Float):Float{
    val c=0.709f;
    return a/c;
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
