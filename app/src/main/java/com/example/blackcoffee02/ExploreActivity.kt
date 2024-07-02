package com.example.blackcoffee02

import android.content.ClipData.Item
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ExploreActivity : AppCompatActivity() {

    lateinit var myRecyclerView: RecyclerView
    lateinit var profileArrayList: ArrayList<profile>
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_explore)

        myRecyclerView=findViewById(R.id.RecyclerView)

        val PName = arrayOf(

            "Umesh",
            "Anup",
            "Jordon",
            "Ram"
        )

        val Profileimagearray = arrayOf(
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4

        )

        val Location = arrayOf(
            "Jabalpur",
            "Bhopal",
            "Indore",
            "Jabalpur"
        )

        val Description = arrayOf(
            "Software Developer",
            "Postman Student Expert",
            "Event Management Head",
            "ECE Graduate (2025)",

        )
        myRecyclerView.layoutManager = LinearLayoutManager(this)
        profileArrayList = arrayListOf<profile>()
        for( index in Profileimagearray.indices){
            val P1 = profile(PName[index],Profileimagearray[index],Description[index],Location[index])
            profileArrayList.add(P1)
        }
        myRecyclerView.adapter = MyAdapter(profileArrayList,this)

        val buttonrefine = findViewById<ImageButton>(R.id.refineButton)
        buttonrefine.setOnClickListener(){
            val intent = Intent(this,Refine::class.java)
            startActivity(intent)


        }







    }

}