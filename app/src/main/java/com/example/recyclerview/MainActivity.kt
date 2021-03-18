package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.model.ApiService
import com.example.recyclerview.model.Email
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val api = retrofit.create(ApiService::class.java)

        api.getEmails().enqueue(object : Callback<List<Email>> {
            override fun onFailure(call: Call<List<Email>>, t: Throwable) {

            }

            override fun onResponse(call: Call<List<Email>>, response: Response<List<Email>>) {
                showData(response.body()!!)
            }
        })

    }
    private fun showData(emails: List<Email>){
        recycler_view_main.apply{
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = EmailAdapter(emails)
        }
    }

}