package com.example.composeproject

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
fun CarItem(carModel: CarModel) {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
    ) {
        Row {
            Column(
                modifier = Modifier.padding(start = 5.dp, top = 5.dp),
            ) {
                Text(
                    text = carModel.carName,
                    fontSize = 18.sp,
                    color = Color.Black,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Model:${carModel.carModel}",
                    fontSize = 10.sp,
                    color = Color.Gray,
                    fontFamily = FontFamily.Monospace,
                )
                Text(
                    text = carModel.carSpeed,
                    fontSize = 15.sp,
                    color = Color.Black,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold
                )
            }
            AsyncImage(model = carModel.carImage,
                contentDescription = null,
                modifier = Modifier.height(80.dp).clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop)
        }
    }
}