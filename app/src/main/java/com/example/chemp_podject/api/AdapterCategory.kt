package com.example.chemp_podject.api

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.chemp_podject.R
import com.example.chemp_podject.databinding.ItemButtonBinding

class AdapterCategory: RecyclerView.Adapter<AdapterCategory.CategoryHolder>() {
    private val categoryModelList = ArrayList<BlockModel>()

    class CategoryHolder(item: View) :RecyclerView.ViewHolder(item){
        private  var binding = ItemButtonBinding.bind(item)
        fun bind(category: BlockModel){
            binding.ButtonCatalog.text = category.category
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_button, parent,false)
        return CategoryHolder(view)
    }

    override fun getItemCount(): Int {
        return categoryModelList.size
    }

    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
        holder.bind(categoryModelList[position])
    }

    fun addCategogory(category: BlockModel){
        categoryModelList.add(category)
        notifyDataSetChanged()
    }
}