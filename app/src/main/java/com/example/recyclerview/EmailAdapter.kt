package com.example.recyclerview


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.model.Email
import kotlinx.android.synthetic.main.email_item.view.*

class EmailAdapter( val emails: List<Email>): RecyclerView.Adapter<EmailAdapter.EmailViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.email_item, parent, false)
        return EmailViewHolder(view)
    }

    override fun getItemCount() = emails.size

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emails[position]
        holder.TXTuser.text = email.id
        holder.TXTsubject.txt_subject.text = email.title
    }

    class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val TXTuser: TextView = itemView.txt_user
        val TXTsubject: TextView = itemView.txt_subject
    }
}
