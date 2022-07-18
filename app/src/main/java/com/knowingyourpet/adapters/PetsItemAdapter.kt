package com.knowingyourpet.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.knowingyourpet.PetsResponseItem
import com.knowingyourpet.R

class PetsItemAdapter : RecyclerView.Adapter<PetsItemAdapter.PetsViewHolder>() {

    inner class PetsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    private val differCallback = object : DiffUtil.ItemCallback<PetsResponseItem>(){
        override fun areItemsTheSame(
            oldItem: PetsResponseItem,
            newItem: PetsResponseItem
        ): Boolean {
            return oldItem.name == newItem.name

        }

        override fun areContentsTheSame(
            oldItem: PetsResponseItem,
            newItem: PetsResponseItem
        ): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetsViewHolder {
        return PetsViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.fragment_preview,parent,false
            )
        )
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun onBindViewHolder(holder: PetsViewHolder, position: Int)  {
        val petsItem = differ.currentList[position]
        holder.itemView.apply {
            Glide.with(this).load(petsItem.reference_image_id)
        }
    }


}