package com.blackpurple.jetpack_composables.pages

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.blackpurple.jetpack_composables.pages.destinations.InteractionComponentsPageDestination
import com.blackpurple.jetpack_composables.pages.destinations.LayoutsPageDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@RootNavGraph(start = true)
@Destination
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePage(
    navigator: DestinationsNavigator
) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Compose Components") }) },
    ) { contentPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(contentPadding)
        ) {
            ListItem(
                modifier = Modifier.clickable { navigator.navigate(LayoutsPageDestination()) },
                headlineText = { Text("Layout Components") },
                leadingContent = {
                    Icon(
                        imageVector = Icons.Rounded.Settings,
                        contentDescription = "",
                    )
                }
            )
            ListItem(
                modifier = Modifier.clickable {
                    navigator.navigate(
                        InteractionComponentsPageDestination()
                    )
                },
                headlineText = { Text("Interaction Components") },
                leadingContent = {
                    Icon(
                        imageVector = Icons.Rounded.Settings,
                        contentDescription = "",
                    )
                }
            )
            ListItem(
                modifier = Modifier.clickable {  },
                headlineText = { Text("Icons") },
                leadingContent = {
                    Icon(
                        imageVector = Icons.Rounded.Settings,
                        contentDescription = "",
                    )
                }
            )
        }
    }
}
