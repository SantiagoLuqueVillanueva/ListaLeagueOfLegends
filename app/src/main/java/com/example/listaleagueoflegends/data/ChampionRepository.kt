package com.example.listaleagueoflegends.data

import com.example.listaleagueoflegends.R

class ChampionRepository {
    private val _champions= listOf(
        Champion(1, "Annie", R.drawable.annie),
        Champion(2, "Diana", R.drawable.diana),
        Champion(3, "Fizz", R.drawable.fizz),
        Champion(4, "Irelia", R.drawable.irelia),
        Champion(5, "Leona", R.drawable.leona),
        Champion(6, "Mordekaiser", R.drawable.mordekaiser),
        Champion(7, "Neeko", R.drawable.neeko),
        Champion(8, "Senna", R.drawable.senna),
        Champion(9, "Taric", R.drawable.taric),
        Champion(10, "Teemo", R.drawable.teemo),
        Champion(11, "Vi", R.drawable.vi),
        Champion(12, "Ziggs", R.drawable.ziggs)
    )

    val champion: List<Champion>
        get() = _champions.toList()
}

data class Champion(
    val id: Int,
    val name: String,
    val imageRes: Int
)