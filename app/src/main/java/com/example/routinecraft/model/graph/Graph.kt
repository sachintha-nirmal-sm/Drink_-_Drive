package com.example.routinecraft.model.graph

import com.example.routinecraft.view.adapters.ItemList
import java.util.Date

data class Graph(
    val data: MutableMap<Date, Int>
) : ItemList