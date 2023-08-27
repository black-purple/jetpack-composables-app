package com.blackpurple.jetpack_composables.pages

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.rounded.Build
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.FilledIconToggleButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.InputChip
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.blackpurple.jetpack_composables.components.ExpandableCard
import com.blackpurple.jetpack_composables.pages.destinations.HomePageDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InteractionComponentsPage(
    navigator: DestinationsNavigator
) {
    val context = LocalContext.current
    var checked by remember { mutableStateOf(false) }
    var kitkat by remember { mutableStateOf(false) }
    var lollipop by remember { mutableStateOf(false) }
    var marshmallow by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Interactions Components") }, navigationIcon = {
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
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            ExpandableCard(
                title = "Button",
                contentAlignment = Alignment.CenterHorizontally
            ) {
                Button(onClick = {
                    Toast.makeText(context, "This is a button", Toast.LENGTH_SHORT).show()
                }) { Text("Click") }
            }
            ExpandableCard(
                title = "Elevated Button",
                contentAlignment = Alignment.CenterHorizontally
            ) {
                ElevatedButton(onClick = {
                    Toast.makeText(context, "This is an elevated button", Toast.LENGTH_SHORT).show()
                }) { Text("Click") }
            }

            ExpandableCard(
                title = "Text Button",
                contentAlignment = Alignment.CenterHorizontally
            ) {
                TextButton(onClick = {
                    Toast.makeText(context, "This is a text button", Toast.LENGTH_SHORT).show()
                }) { Text("Click") }
            }

            ExpandableCard(
                title = "Icon Button",
                contentAlignment = Alignment.CenterHorizontally
            ) {
                IconButton(onClick = {
                    Toast.makeText(context, "This is an icon button", Toast.LENGTH_SHORT).show()
                }) { Icon(imageVector = Icons.Default.Add, contentDescription = null) }
            }
            ExpandableCard(
                title = "Filled Icon Button",
                contentAlignment = Alignment.CenterHorizontally
            ) {
                FilledIconButton(onClick = {
                    Toast.makeText(context, "This is a filled icon button", Toast.LENGTH_SHORT)
                        .show()
                }) { Icon(imageVector = Icons.Default.Add, contentDescription = null) }
            }
            ExpandableCard(
                title = "Filled Toggle Icon Button",
                contentAlignment = Alignment.CenterHorizontally
            ) {
                FilledIconToggleButton(checked = checked, onCheckedChange = { newValue ->
                    Toast.makeText(context, "This is a toggle icon button", Toast.LENGTH_SHORT)
                        .show()
                    checked = newValue
                }) { Icon(imageVector = Icons.Rounded.Build, contentDescription = null) }
            }
            ExpandableCard(
                title = "Switch",
                contentAlignment = Alignment.CenterHorizontally
            ) {
                Switch(checked = checked, onCheckedChange = { newValue ->
                    Toast.makeText(
                        context,
                        "This is a switch (State ${if (newValue) "on" else " off"})",
                        Toast.LENGTH_SHORT
                    ).show()
                    checked = newValue
                })
            }
            ExpandableCard(
                title = "Input Chip",
                contentAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    InputChip(
                        selected = kitkat,
                        onClick = { kitkat = !kitkat },
                        label = { Text("Kitkat") }
                    )
                    InputChip(
                        selected = lollipop,
                        onClick = { lollipop = !lollipop },
                        label = { Text("Lollipop") }
                    )
                    InputChip(
                        selected = marshmallow,
                        onClick = { marshmallow = !marshmallow },
                        label = { Text("Marshmallow") }
                    )
                }
            }
        }
    }
}