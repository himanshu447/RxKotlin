package com.example.knoxpo.rxkotlin.retrofit

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.knoxpo.rxkotlin.R
import com.example.knoxpo.rxkotlin.adapater.ListAdapater
import com.example.knoxpo.rxkotlin.model.Brand
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class Fragment_Brand : Fragment() {

    private val TAG = this::class.java!!.getSimpleName()

    var mList: ArrayList<Brand>? = null

    var mAdapater: ListAdapater? = null

    var recy: RecyclerView? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_list, container, false)

        recy = view.findViewById(R.id.recycler_view)

        mList = ArrayList<Brand>()

        val layout: RecyclerView.LayoutManager = LinearLayoutManager(activity)

        recy?.addItemDecoration(DividerItemDecoration(this.context, LinearLayoutManager.VERTICAL))

        recy?.layoutManager = layout

        mAdapater = ListAdapater(mList!!)

        recy?.adapter = mAdapater

        startFatching()


        return view
    }


    private fun startFatching() {


        val brandService = RetroFitHelper.getRetrofit().create(RetroFitInterface::class.java)

        val call = brandService.getBrandJSON("ag9ifmdsb2JhbGNpdHktMjByFQsSCENhdGVnb3J5GICAgID62YMKDA")


       // through  retrofit

        /*call.(object : Callback<BrandResponse> {

            override fun onResponse(call: Call<BrandResponse>, response: Response<BrandResponse>) {

                mList?.addAll(response.body()!!.mBrands as ArrayList<Brand>)

                mAdapater?.notifyDataSetChanged()

                //     setAdapater()

                Log.d(TAG, "SUCCESS")

            }

            override fun onFailure(call: Call<BrandResponse>, t: Throwable) {
            }
        })*/

        //through rxkotlin

        call
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { response, error ->
                    mList?.addAll(response.mBrands!!)
                    mAdapater?.notifyDataSetChanged()
                }
    }
}