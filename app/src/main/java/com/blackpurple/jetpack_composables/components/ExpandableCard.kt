package com.blackpurple.jetpack_composables.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

@Composable
fun ExpandableCard(
    modifier: Modifier = Modifier,
    title: String? = "Title",
    bottomMargin: Int? = 10,
    titleFontSize: TextUnit? = MaterialTheme.typography.bodyLarge.fontSize,
    contentAlignment: Alignment.Horizontal? = Alignment.Start,
    content: @Composable () -> Unit,
) {
    var expanded by remember { mutableStateOf(false) }
    val rotation by animateFloatAsState(if (expanded) 180f else 0f, label = "")

    Card(
        modifier = modifier
            .fillMaxWidth()
            .defaultMinSize(minHeight = 20.dp)
            .padding(horizontal = 10.dp)
            .clickable { expanded = !expanded }
    ) {
        Column(
            modifier = Modifier
                .absolutePadding(
                    left = 20.dp,
                    top = 10.dp,
                    bottom = 10.dp,
                    right = 5.dp,
                ),
            horizontalAlignment = contentAlignment!!
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = title!!,
                    fontWeight = FontWeight.Bold,
                    fontSize = titleFontSize!!,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    modifier = Modifier.weight(6f)
                )
                IconButton(
                    modifier = Modifier.rotate(rotation),
                    onClick = { expanded = !expanded }) {
                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "Expanding action"
                    )
                }
            }
            AnimatedVisibility(visible = expanded) {
                content()
            }
        }
    }
    Spacer(modifier = Modifier.height(bottomMargin!!.dp))
}