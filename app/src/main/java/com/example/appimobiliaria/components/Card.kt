package com.example.appimobiliaria.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appimobiliaria.R
import com.example.appimobiliaria.ui.theme.DarkGreen

@Composable
fun ImgCard(text: String, preco: String, colorPreco: Color, imgPath: Painter){
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = Modifier
            .width(170.dp)
    ) {
        Column (
            modifier = Modifier.background(Color.White)
        ) {
            Image(
                painter = imgPath,
                contentDescription = "Img Casa"
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = text,
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Center,
                color = Color.Black,
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = preco,
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Center,
                color = colorPreco,
                fontSize = 15.sp
            )

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
fun ImgCardCorretor(text: String, imgPath: Painter){
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = Modifier
            .wrapContentSize(),
    ) {
        Column (
            modifier = Modifier.background(Color.White)
        ){
            Image(
                painter = imgPath,
                contentDescription = "IMG Casa"
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = text,
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Center,
                color = Color.Black
            )


            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardPreview(){
    Row (
        modifier = Modifier.height(300.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){
        ImgCard(
            "Casa 1",
            "R$ 1.000.000,00",
            Color.Black,
            painterResource(R.drawable.casa)
        )

        ImgCard(
            "Casa 2",
            "R$ 2.500.000,00",
            DarkGreen,
            painterResource(R.drawable.casa)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CardPreviewCorretor(){
    Row (
        modifier = Modifier.fillMaxWidth()
            .padding(top = 80.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){
        ImgCardCorretor(
            "Corretor 1",
            painterResource(R.drawable.corretor)
        )

    }
    Row (
        modifier = Modifier.fillMaxWidth()
            .padding(top = 80.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){
        ImgCardCorretor(
            "Corretor 2",
            painterResource(R.drawable.corretor)
        )

    }
}

