package com.example.listviewprojtwo

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter (private val contextVar: Activity, private val arrayList: ArrayList<User>):
    ArrayAdapter<User>(contextVar, R.layout.each_listview, arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater = LayoutInflater.from(contextVar) //contextVar is pointing toward MainActivity
        val view =inflater.inflate(R.layout.each_listview, null) //we got view of our custome each_listview.xml

        //now we'll findViewById of each element of "each_listview"
        val imageId = view.findViewById<CircleImageView>(R.id.profile_image)
        val name = view.findViewById<TextView>(R.id.nameTv)
        val lastmsg = view.findViewById<TextView>(R.id.lastmsgTv)
        val lastmsgTime = view.findViewById<TextView>(R.id.lastmsgTimeTv)

        //getting values
        name.text= arrayList[position].name
        lastmsg.text= arrayList[position].lastmsg
        lastmsgTime.text = arrayList[position].lastmsgTime
        imageId.setImageResource(arrayList[position].imgId)
        return view
    }
}