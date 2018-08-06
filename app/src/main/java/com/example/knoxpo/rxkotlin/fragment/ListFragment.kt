/*
package com.example.knoxpo.rxkotlin.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.knoxpo.rxkotlin.R
import com.example.knoxpo.rxkotlin.model.Post
import com.example.knoxpo.rxkotlin.retrofit.RetroFitHelper
import com.example.knoxpo.rxkotlin.retrofit.RetroFitInterface
import com.example.knoxpo.rxkotlin.adapater.ListAdapater
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.annotations.NonNull
import io.reactivex.observers.DisposableSingleObserver
import kotlinx.android.synthetic.main.fragment_list.*

class ListFragment : Fragment() {


    //private val UNCHECKED_ERROR_TYPE_CODE = -100

    private val TAG = this::class.java!!.getSimpleName()

    var mList: ArrayList<Post>? = null

    var mAdapater: ListAdapater? = null

    var recy: RecyclerView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_list, container, false)

        recy = view.findViewById(R.id.recycler_view)

        mList = ArrayList<Post>()

        mAdapater = ListAdapater(mList!!)

        val layout: RecyclerView.LayoutManager = LinearLayoutManager(activity)

        recy?.addItemDecoration(DividerItemDecoration(this.context, LinearLayoutManager.VERTICAL))

        recy?.layoutManager = layout

        recy?.adapter = mAdapater

        prepareData()

        //getBrands()

        return view
    }

    private fun prepareData() {

        for (i in 0..100) {
            var mModel = Post()
            mModel.bName = "item is : -  $i"
            mList?.add(mModel)
        }
        mAdapater?.notifyDataSetChanged()


    }

    */
/*private fun getBrands() {
        val retrofitInterface = RetroFitHelper.getRetrofit().create(RetroFitInterface::class.java)

        val single = retrofitInterface.getPost("him")

        single.observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : DisposableSingleObserver<Post>() {
                    override fun onSuccess(@NonNull post: Post) {
                        Log.d(TAG, "Success")
                    }

                    override fun onError(@NonNull e: Throwable) {
                        Log.e(TAG, "Error occurred")
                    }
                })
    }*//*


}*/
