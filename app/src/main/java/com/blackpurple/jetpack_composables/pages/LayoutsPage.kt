package com.blackpurple.jetpack_composables.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.blackpurple.jetpack_composables.components.ExpandableCard
import com.blackpurple.jetpack_composables.pages.destinations.HomePageDestination
import com.blackpurple.jetpack_composables.ui.theme.Purple80
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LayoutsPage(
    navigator: DestinationsNavigator
) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Layout Components") }, navigationIcon = {
                IconButton(
                    onClick = { navigator.navigate(HomePageDestination()) }) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "")
                }
            })
        },
    ) { contentPadding ->
        Column(
            modifier = Modifier
                .padding(contentPadding)
                .padding(vertical = 15.dp)
                .verticalScroll(rememberScrollState())
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            ExpandableCard(
                title = "Box",
                contentAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Box(
                        modifier = Modifier
                            .height(120.dp)
                            .width(120.dp)
                            .clip(shape = RoundedCornerShape(60.dp))
                            .background(Purple80)
                    )
                    Box(
                        modifier = Modifier
                            .height(120.dp)
                            .width(120.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(Purple80)
                    )
                }
            }
            ExpandableCard(
                title = "Column",
                contentAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    verticalArrangement = Arrangement.Center
                ) {
                    Box(
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(Purple80)
                    )
                    Box(
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(Purple80)
                    )
                    Box(
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(Purple80)
                    )
                }
            }
            ExpandableCard(
                title = "Row (Default = Start)",
                contentAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Box(
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(Purple80)
                    )
                    Box(
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(Purple80)
                    )
                    Box(
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(Purple80)
                    )
                }
            }
            ExpandableCard(
                title = "Row (Center)",
                contentAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Box(
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(Purple80)
                    )
                    Box(
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(Purple80)
                    )
                    Box(
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(Purple80)
                    )
                }
            }
            ExpandableCard(
                title = "Row (End)",
                contentAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Box(
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(Purple80)
                    )
                    Box(
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(Purple80)
                    )
                    Box(
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(Purple80)
                    )
                }
            }
            ExpandableCard(
                title = "Row (Space Evenly)",
                contentAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Box(
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(Purple80)
                    )
                    Box(
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(Purple80)
                    )
                    Box(
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(Purple80)
                    )
                }
            }
            ExpandableCard(
                title = "Row (Space Between)",
                contentAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Box(
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(Purple80)
                    )
                    Box(
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(Purple80)
                    )
                    Box(
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(Purple80)
                    )
                }
            }
            ExpandableCard(
                title = "Row (Space Around)",
                contentAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Box(
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(Purple80)
                    )
                    Box(
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(Purple80)
                    )
                    Box(
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(Purple80)
                    )
                }
            }

        }
    }
}