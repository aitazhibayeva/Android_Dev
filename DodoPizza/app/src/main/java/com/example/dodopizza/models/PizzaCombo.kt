package com.example.dodopizza.models

import java.util.UUID

data class PizzaCombo(
    val id: String = UUID.randomUUID().toString(),
    override val title: String,
    override val description: String,
    override val image: Int,
    override val cost: String,
    override val shortDescription: String,
    override val costSecond: String
):PizzaItem