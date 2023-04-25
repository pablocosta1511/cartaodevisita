package com.example.myapplicationpablo5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplicationpablo5.ui.theme.MyApplicationPablo5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationPablo5Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color( blue = 80, green = 99, red = 225)
                ) {
                    PlanoDefundo()
                }
            }
        }
    }
}
@Composable
fun PlanoDefundo () {
    Image(
        painter = painterResource(id = R.drawable.fundopablo2),
                contentDescription = null,
        contentScale = ContentScale.Crop
    )
    Cabecalho()
    Rodape()
}

@Composable
fun Rodape() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start
    ) {
        Contato(
            painter = painterResource(id = R.drawable.iconecontato),
            text = " (11)991741563"
        )
        Contato(
            painter = painterResource(id = R.drawable.iconeemail),
           text  = " pablocostap15117@gmail.com"

        )
        Contato(
            painter = painterResource(id = R.drawable.iconecasa),
            text = " Vila Mariana"
        )
    }
}

@Composable
fun Contato(painter: Painter, text :String) {

    Divider(
        color  = Color.Black,
        modifier = Modifier
            .fillMaxWidth()
            .height(0.5.dp)
    )

    Row(
        modifier = Modifier
            .padding(top = 10.dp, start = 30.dp, bottom = 10.dp)
    ) {
        Image(painter = painter,
              contentDescription =null,
              modifier = Modifier
                  .size(50.dp)
                  .clip(CircleShape)
        )
        Text(
          text = text,
            fontSize = 20.sp,
            color = Color.White,
            modifier = Modifier
                .padding(start = 30.dp)
        )


    }

}


@Composable
fun Cabecalho() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.iconepablo),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
        )
        Text(
            text = "Pablo Costa",
            fontSize = 30.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Aluno",
            fontSize = 20.sp,
            color = Color.Black
        )
    }
}






