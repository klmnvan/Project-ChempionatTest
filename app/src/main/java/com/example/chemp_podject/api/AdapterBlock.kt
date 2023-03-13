package com.example.chemp_podject.api

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.chemp_podject.R
import com.example.chemp_podject.databinding.ItemBlockBinding

class AdapterBlock: RecyclerView.Adapter<AdapterBlock.BlockHolder>() {
    private val blockModelList = ArrayList<BlockModel>()

    class BlockHolder(item: View) : RecyclerView.ViewHolder(item){
        private var bindingBlock = ItemBlockBinding.bind(item)
        fun bind(block: BlockModel)
        {
            bindingBlock.TextNameBlock.text = block.name
            bindingBlock.TextTimeResult.text = block.time_result
            bindingBlock.TextPrice.text = block.price
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlockHolder {
        val view  = LayoutInflater.from(parent.context).inflate(R.layout.item_block, parent, false)
        return BlockHolder(view)
    }

    override fun getItemCount(): Int {
        return blockModelList.size
    }

    override fun onBindViewHolder(holder: BlockHolder, position: Int) {
        holder.bind(blockModelList[position])
    }
    fun addBlock(block: BlockModel)
    {
        blockModelList.add(block)
        notifyDataSetChanged()
    }

}