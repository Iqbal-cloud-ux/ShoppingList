package com.example.shoppinglist.component

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.fillMaxWidth

@Composable
fun SearchInput(
    query: String,
    onQueryChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = query,
        onValueChange = onQueryChange,
        label = { Text("Search items") },
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        leadingIcon = {
            Icon(imageVector = Icons.Filled.Search, contentDescription = "Search Icon")
        },
        singleLine = true
    )
}
