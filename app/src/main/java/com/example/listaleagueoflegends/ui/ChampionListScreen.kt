package com.example.listaleagueoflegends.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.listaleagueoflegends.data.Champion
import com.example.listaleagueoflegends.data.ChampionRepository

@Composable
fun ChampionListScreen(
    modifier: Modifier = Modifier
){
    val champions = ChampionRepository()
    LazyColumn(

    ) {
        items(
            items = champions.champion,
            key = {
                champion : Champion ->
                    champion.id
            }
        ) {
            champion ->
                ChampionItem(champion)
        }
    }
}

@Composable
fun ChampionItem(
    champion: Champion
) {
    Text(champion.name)
}

@Composable
@Preview
fun ChampionItemPreview(){
    val annie = Champion(1,"Annie")
    Text(annie.name)
}