package com.blackpurple.jetpack_composables.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.blackpurple.jetpack_composables.ui.theme.Purple80

@Composable
fun IconGridTile(
    icon: ImageVector,
    title: String? = icon.name
) {
    Card(elevation = CardDefaults.cardElevation(
        defaultElevation = 5.dp
    )) {
        Column(
            modifier = Modifier
                .height(80.dp)
                .width(80.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(Purple80),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Icon(imageVector = icon, contentDescription = title)
            Text(title ?: "undefined")
        }
    }
}