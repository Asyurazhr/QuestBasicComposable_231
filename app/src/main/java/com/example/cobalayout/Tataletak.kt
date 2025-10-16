package com.example.cobalayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.style.TextAlign

@Composable
fun TataLetakColumn(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}
@Composable
fun TataLetakRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}
@Composable
fun TataLetakBox(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        contentAlignment = Alignment.Center
    ) {// Box akan menumpuk anak; kalau mau berderet, taruh Column/Row di dalam Box
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            Text(text = "Box 1")
            Text(text = "Box 1-1")
            Text(text = "Row 1")
            Text(text = "Column 2")
        }
    }
}

@Composable
fun TataLetakColumnRow(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth(), verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {   Text(text = "Komponen1Baris1")
            Text(text = "Komponen2Baris1")
            Text(text = "Komponen3Baris1")
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1Baris2")
            Text(text = "Komponen2Baris2")
            Text(text = "Komponen3Baris2")
        }
    }
}

@Composable
fun TataLetakRowColumn(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.Top
    ) {
        Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
            Text(text = "Komponen1Kolom1")
            Text(text = "Komponen2Kolom1")
            Text(text = "Komponen3Kolom1")
        }
        Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
            Text(text = "Komponen1Kolom2")
            Text(text = "Komponen2Kolom2")
        }
    }
}

@Composable
fun TataLetakBoxColumnRow(modifier: Modifier = Modifier) {
    // Pakai R dari package app ini: com.example.cobalayout.R
    val gambar = painterResource(id = com.example.cobalayout.R.drawable.notasibalok)

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "Col1_Row1_Komponen1")
                Text(text = "Col1_Row1_Komponen2")
                Text(text = "Col1_Row1_Komponen3")
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "Col1_Row2_Komponen1")
                Text(text = "Col1_Row2_Komponen2")
                Text(text = "Col1_Row2_Komponen3")
            }
        }
        Spacer(modifier = Modifier.height(10.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(color = Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = gambar,
                contentDescription = null,
                contentScale = ContentScale.Fit
            )
            Text(
                text = "My Music",
                fontSize = 50.sp,
                color = Color.Red,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier.align(Alignment.Center)
            )
        }

    }
}






