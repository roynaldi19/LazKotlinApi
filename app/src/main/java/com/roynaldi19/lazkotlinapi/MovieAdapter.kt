package com.roynaldi19.lazkotlinapi

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.roynaldi19.lazkotlinapi.databinding.AdapterMovieBinding


class MovieAdapter(var results: ArrayList<MainModel.Result>, val listener: OnAdapterListener) :
    RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            AdapterMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount() = results.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val (id, title, image) = results[position]
        holder.binding.textView.text = title
        Glide.with(holder.binding.root.context).load(image).centerCrop()
            .into(holder.binding.imageView)
        holder.binding.textView.setOnClickListener {

        }
    }

    class ViewHolder(val binding: AdapterMovieBinding) : RecyclerView.ViewHolder(binding.root)

    fun setData(data: List<MainModel.Result>) {
        results.clear()
        results.addAll(data)
        notifyDataSetChanged()
    }

    interface OnAdapterListener {
        fun onClick(result: MainModel.Result)
    }
}
