package com.example.knoxpo.rxkotlin.adapater

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.knoxpo.rxkotlin.R
import com.example.knoxpo.rxkotlin.model.Brand

class ListAdapater(var mList : ArrayList<Brand>) : RecyclerView.Adapter<ListAdapater.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        var view : View = LayoutInflater.from(parent.context).inflate(R.layout.list_row,parent,false)

        return MyViewHolder(view)

    }

    override fun getItemCount() = mList.size


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        var mModel : Brand = mList[position]

        holder.bindData(mModel)
    }


    class MyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        var TVBrand : TextView = itemView!!.findViewById(R.id.textViewList)

        fun bindData(mModel: Brand) {

            TVBrand.text = mModel.mBrandName
        }


    }
}