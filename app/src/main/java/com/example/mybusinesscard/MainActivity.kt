package com.example.mybusinesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                BusinessCard()
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0x7F9cb7d7))

    ) {
        Spacer(modifier = Modifier.weight(1.2f))

        PersonalInfo(
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
            name = "自律的鬼鬼",
            title = "Android developer"
        )

        Spacer(modifier = Modifier.height(70.dp))

        ContactInfo(
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(bottom = 60.dp)
        )

        Spacer(modifier = Modifier.weight(1f))
    }
}

@Preview(
    showBackground = true,
    widthDp = 550,
    heightDp = 1080
)
@Composable
fun BusinessCardPreview() {
    BusinessCard()
}


@Composable
fun PersonalInfo(
    modifier: Modifier = Modifier,
    name: String,
    title: String
) {
    val avatarPainter = painterResource(id = R.drawable._727acebd9743ed2eecd0a4e5dab1826)
    
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = avatarPainter,
            contentDescription = "Avatar",
            Modifier.size(width = 150.dp, height = 150.dp)
        )

        Spacer(modifier = Modifier.size(20.dp))

        Text(
            text = name,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF4a5270)
            )

        Text(
            text = title,
            fontSize = 20.sp,
            fontWeight = FontWeight.Light,
            color = Color(0x9F4a5270)
        )
    }
}

@Composable
fun ContactInfo(
    modifier: Modifier = Modifier
) {
    val icons = Icons.Rounded
    val iconSize : Int = 25
    val fontSize : Int = 20
    val spacerSize : Int = 20
    val textColor : Color = Color(0xFF687e98)
    val iconColor: Color = Color(0xDF788ea8)

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.Start
    ) {
        Row {
            Icon(imageVector = icons.Phone,
                contentDescription = "Phone icon",
                modifier = Modifier.size(iconSize.dp),
                tint = iconColor
                )
            Spacer(
                modifier = Modifier.size(size = spacerSize.dp)
            )
            Text(
                text = "137 9976 8896",
                fontSize = fontSize.sp,
                color = textColor
                )
        }

        Row {
            Icon(imageVector = icons.Email,
                contentDescription = "Phone icon",
                modifier = Modifier.size(iconSize.dp),
                tint = iconColor
            )
            Spacer(
                modifier = Modifier.size(size = spacerSize.dp)
            )
            Text(text = "1743341342@qq.com",
                fontSize = fontSize.sp,
                color = textColor
                )
        }

    }
}




