
package com.example.yvlherb

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.yvlherb.ui.theme.YvlherbTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo()

        }
    }
}

@Composable
fun Demo(){

    val mContext = LocalContext.current
    Column (modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Welcome to Android",
            fontSize = 30.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textDecoration = TextDecoration.Underline
        )
        Text(text = "The Android operating system is a mobile operating system developed by Google primarily for touchscreen devices, such as cell phones and tablets.")
        Text(
            text = "Browsers",
            fontSize = 20.sp,
            color = Color.Black,
            modifier = Modifier
                .background(Color.Red)
                .height(30.dp)
                .fillMaxWidth())



        Text(text = "1.Firefox")
        Text(text = "2.Chrome")
        Text(text = "3.Safari")
        Text(text = "4.Edge")

        Spacer(modifier = Modifier.height(20.dp))



        Text(text = "Types of cars",
            fontSize = 20.sp,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.Blue)
                .height(30.dp)
                .fillMaxWidth())
        Text(text = "1.Subaru")
        Text(text = "2.Mercedes Benz")
        Text(text = "3.Audi")
        Text(text = "4.Maserati")
        Text(text = "5.Porsche ")

        //Centered button
        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Button(onClick = {
                mContext.startActivity(Intent(mContext,DestinationActivity::class.java))
            },
                shape = RoundedCornerShape(5.dp),
            ) {
                Text(text = "Destination")

            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Divider()


        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "eMobilis mobile training institute",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )


        Text(text = "Courses offered at eMobilis",
            fontSize = 20.sp,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.Cyan)
                .height(30.dp)
                .fillMaxWidth())
        Text(text = "1.MIT")
        Text(text = "2.CYBERSECURITY")
        Text(text = "3.DATASCIENCE")
        Text(text = "4.PYTHON")

        Spacer(modifier = Modifier.height(10.dp))

        //Centering an image
       Box(modifier = Modifier.fillMaxWidth(),
           contentAlignment = Alignment.Center) {
           Image(
               painter = painterResource(id = R.drawable.jordan),
               contentDescription = "jordan",
               modifier = Modifier
                   .size(200.dp)
                   .clip(shape = CircleShape),
               contentScale = ContentScale.Crop
           )


       }

        Button(onClick = {
            mContext.startActivity(Intent(mContext,LayoutActivity::class.java))
        },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "continue")
            
        }


            }

    }


@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    Demo()

}