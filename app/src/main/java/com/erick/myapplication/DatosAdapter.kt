package com.erick.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DatosAdapter(var context: Context,
    var ListaDatos: MutableList<dtDatos>) : RecyclerView.Adapter<DatosAdapter.vHolder>()
{
    inner class vHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var txtid: TextView
        init {
            txtid=itemView.findViewById(R.id.txtId)
        }
        lateinit var txtdescripcion: TextView
        init {
            txtdescripcion=itemView.findViewById(R.id.txtDescripcion)
        }
        lateinit var txtpreciomenudeo: TextView
        init {
            txtpreciomenudeo=itemView.findViewById(R.id.txtPrecioMenudeo)
        }
        lateinit var txtpreciomayoreo: TextView
        init {
            txtpreciomayoreo=itemView.findViewById(R.id.txtPrecioMayoreo)
        }

    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DatosAdapter.vHolder {
       var itemView = LayoutInflater.from(context).inflate(
           R.layout.vista_datos,parent,false
       )
        return vHolder(itemView)
    }



    override fun getItemCount(): Int {
        return ListaDatos.size
    }



    override fun onBindViewHolder(holder: DatosAdapter.vHolder, position: Int) {
        var datos = ListaDatos[position]
        holder.txtid.text=datos.Id
        holder.txtdescripcion.text=datos.Descripcion
        holder.txtpreciomenudeo.text=datos.PrecioMenudeo
        holder.txtpreciomayoreo.text=datos.PrecioMayoreo
    }


}