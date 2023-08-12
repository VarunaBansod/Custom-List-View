package com.example.listviewprojtwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var userArrayList : ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameList = arrayOf("Saumya", "ankit", "william", "radha", "kahna", "charlie", "ankita","laxmana"," ")
        val lastmsgList = arrayOf("Hey guys", "cool", "fine", "radha radha", "krishna krishna", "radha krishna", "welcome","hello how are your?"," ")
        val lastmsgTimeList = arrayOf("12:30pm", "1:30am", "2:30am", "7:30pm", "9:30pm", "3:30am", "4:30am","3:23am"," ")
        val phoneNoList = arrayOf("4589453214", "7845965412", "9845621454", "4587965321", "856934796", "9856472314", "9685741235","4536897415", "")
        val imgId = intArrayOf(R.drawable.girl1_pic2, R.drawable.boy1_pic0, R.drawable.boy3_pic6, R.drawable.girl2_pic3, R.drawable.boy2_pic1, R.drawable.girl4_pic5, R.drawable.girl5_pic6,R.drawable.girl3_pic4, R.drawable.ic_launcher_foreground)

        userArrayList = ArrayList()
        for (eachIndex in nameList.indices) {
            val user = User(nameList[eachIndex], lastmsgList[eachIndex], lastmsgTimeList[eachIndex], phoneNoList[eachIndex], imgId[eachIndex])
            //user1: name= saumya, lastmsg = hey guys, lastmsgTim= 12:30pm , imgid= pic2
            //user2: name= ankit, lastmsg= cool, lastmsTime=1:30am, imgid= pic0
            //user3....
            userArrayList.add(user)
        }

        val listView = findViewById<ListView>(R.id.listView_xml)
        listView.isClickable = true //be default it is true/ clickable only
//        listView.isFastScrollEnabled = true
        listView.adapter = MyAdapter(this, userArrayList)

        listView.setOnItemClickListener { adapterView, view, position, id ->
//            Toast.makeText(this, "insidesetonclick", Toast.LENGTH_SHORT).show()

            val userName= nameList[position]
            val userPhone = phoneNoList[position]
            val imageId= imgId[position]
            val i = Intent(this, UserActivity::class.java)
            i.putExtra("name", userName)
            i.putExtra("phone", userPhone)
            i.putExtra("imageId", imageId)
            startActivity(i)
//            Toast.makeText(this, "startActivity", Toast.LENGTH_SHORT).show()
        }
    }
}