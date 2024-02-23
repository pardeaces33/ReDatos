package com.erick.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var ListaDatos: MutableList<dtDatos> = mutableListOf()
    private lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ListaDatos.add(
            dtDatos("1","jabon","$45","$56" )
        )
        ListaDatos.add(
            dtDatos("2","Camisa de vestir rayas (talla L)","$24","$56" )
        )
        ListaDatos.add(
            dtDatos("3"," Papas fritas clásicas ","$15","$23" )
        )
        ListaDatos.add(
            dtDatos("4"," kilo de Arroz integral ","$60","$55" )
        )
        ListaDatos.add(
            dtDatos("5"," Espaguetis","$30","$21" )
        )
        ListaDatos.add(
            dtDatos("6"," Papel higienico","$30","$25" )
        )
        ListaDatos.add(
            dtDatos("7"," Queso cheddar  ","$25","$15" )
        )
        ListaDatos.add(
            dtDatos("8"," Pollo entero","$150","$130" )
        )
        ListaDatos.add(
            dtDatos("9"," Zapatos deportivos ","$250","$190" )
        )
        ListaDatos.add(
            dtDatos("10"," Pan integral ","$60","$55" )
        )
        ListaDatos.add(
            dtDatos("11","kilo de Azucar ","$37","$25" )
        )
        ListaDatos.add(
            dtDatos("12"," kilo de Salchicha argentina ","$150","$120" )
        )
        ListaDatos.add(
            dtDatos("13"," litro Aceite ","$50","$24" )
        )
        ListaDatos.add(
            dtDatos("14"," shampoo ","$40","$23" )
        )
        ListaDatos.add(
            dtDatos("15"," Galletas ","$20","$12" )
        )
        ListaDatos.add(
            dtDatos("16"," kilo de sal ","$40","$23" )
        )
        ListaDatos.add(
            dtDatos("17"," Cafe ","$80","50" )
        )
        ListaDatos.add(
            dtDatos("18"," Coca ","$50","$43" )
        )
        ListaDatos.add(
            dtDatos("19"," kilo de frijol ","$50","$25" )
        )
        ListaDatos.add(
            dtDatos("20"," Lapices  ","$100","$60" )
        )
        var tabla = findViewById<RecyclerView>(R.id.tablaDatos)
        recycler=tabla
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=DatosAdapter(this,ListaDatos)

    }
}