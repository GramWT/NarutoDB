package com.example.narutodb

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.narutodb.databinding.ItemProfileCardBinding

class NarutoListAdapter() : RecyclerView.Adapter<NarutoListAdapter.ViewHolder>() {

    private var itemList: ArrayList<CharactersItem?> = arrayListOf()

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        ViewHolder(holder.itemView).bind(itemList[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_profile_card, parent, false
            )
        )
    }

    override fun getItemCount(): Int = itemList.size

    fun setData(dataList: ArrayList<CharactersItem?>) {
        this.itemList = dataList
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val itemBinding = ItemProfileCardBinding.bind(itemView)

        fun bind(data: CharactersItem?) {
            data?.images?.getOrNull(0)?.also {
                Glide.with(itemView.context)
                    .load(it)
                    .into(itemBinding.profileImageView)
            }

            itemBinding.nameTextView.text = data?.name
            itemBinding.statusTextView.text = data?.personal?.status

        }
    }
}