package com.example.listaleagueoflegends.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.listaleagueoflegends.data.Champion
import com.example.listaleagueoflegends.data.ChampionRepository

@Composable
fun ChampionListScreen(
    modifier: Modifier = Modifier
){
    val repository = ChampionRepository()
    val champions = repository.champion
    LazyColumn(
        modifier = modifier.fillMaxSize()
    ) {
        items(
            items = champions,
            key = { champion -> champion.id }
        ) {
            champion -> ChampionItem(champion = champion)
        }
    }
}

@Composable
fun ChampionItem(champion: Champion) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = champion.imageRes),
            contentDescription = "Imagen de ${champion.name}",
        )

        Text(
            text = champion.name,
            modifier = Modifier.padding(start = 16.dp)
        )
    }
}