package com.example.listaleagueoflegends.data

class ChampionRepository {
    private val _champions= listOf(
        Champion(1, "Annie"),
        Champion(2, "Fizz")
    )

    val champion: List<Champion>
        get() =
            _champions.toList()

    //fun readall():List<Champion> = _champions
}

data class Champion(
    val id: Int,
    val name: String,
)