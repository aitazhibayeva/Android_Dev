package com.example.dodopizza.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dodopizza.databinding.PizzaListBinding
import com.example.dodopizza.models.Pizza
import com.example.dodopizza.models.PizzaSource

class PizzaAdapter(
    private val onPizzaClick: (Pizza) -> Unit
) : RecyclerView.Adapter<PizzaAdapter.ViewHolder>() {
    private val pizzaList: ArrayList<Pizza> = ArrayList()

    fun setData(pizzas:ArrayList<Pizza>){
        pizzaList.clear()

        pizzaList.addAll(pizzas)
        notifyDataSetChanged()
    }
    fun filter(query: String) {
        val filteredList = if (query.isEmpty()) {
            PizzaSource.pizzaList}
        else {
            PizzaSource.pizzaList.filter {
                it.title.contains(query, ignoreCase = true)
            }
        }
        setData(ArrayList(filteredList))
    }

    inner class ViewHolder(
        private val binding: PizzaListBinding
    ):RecyclerView.ViewHolder(binding.root){
        fun bind(pizza: Pizza){
            with(binding){
                pizzaImage.setImageResource(pizza.image)
                pizzaTitle.text = pizza.title
                pizzaDescription.text = pizza.description
                pizzaCost.text = pizza.cost


                root.setOnClickListener{
                    onPizzaClick(pizza)
                }
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            PizzaListBinding.inflate(
                LayoutInflater.from(parent.context),parent,false
            )
        )
    }


    override fun getItemCount() = pizzaList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind((pizzaList[position]))
    }
}