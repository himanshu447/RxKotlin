package com.example.weatherjson

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class MyAdapater (var mList : ArrayList<ListModel>) : RecyclerView.Adapter<MyAdapater.MyViewHolder>() {


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {

        var view : View = LayoutInflater.from(p0.context).inflate(R.layout.list_row,p0,false)

        return MyViewHolder(view)

    }

    override fun getItemCount() = mList.size

    override fun onBindViewHolder(p0: MyViewHolder, p1: Int) {

        var mModel : ListModel = mList[p1]
        p0.bindData(mModel)
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var TVBrand : TextView = itemView.findViewById(R.id.textViewList)

        fun bindData(mModel: ListModel) {

            TVBrand.text = mModel.
        }

    }
}