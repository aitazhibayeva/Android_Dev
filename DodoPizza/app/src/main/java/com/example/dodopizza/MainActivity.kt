package com.example.dodopizza

import  android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import com.example.dodopizza.adapter.PizzaAdapter
import com.example.dodopizza.databinding.ActivityMainBinding
import com.example.dodopizza.models.Pizza
import com.example.dodopizza.models.PizzaSource

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = PizzaAdapter(
            onPizzaClick = {
                handlePizzaClick(it)
            }
        )

        binding.recyclerView.adapter = adapter

        adapter.setData(PizzaSource.pizzaList)

        val editTextSearch = findViewById<EditText>(R.id.search_bar)
        editTextSearch.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(charSequence: CharSequence?, start: Int, before: Int, count: Int) {
                adapter.filter(charSequence.toString())
            }
            override fun afterTextChanged(editable: Editable?) {}})

    }

    private fun handlePizzaClick(pizza: Pizza){

        val intent = Intent(this,SecondActivity::class.java)
        intent.putExtra(SecondActivity.KEY_RESULT,pizza.title)
        startActivity(intent)

    }

}