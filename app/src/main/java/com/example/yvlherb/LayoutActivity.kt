@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.yvlherb

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.yvlherb.ui.theme.YvlherbTheme

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout(){
    val mContext = LocalContext.current
    Column(modifier = Modifier.fillMaxSize()) {
        //TopAppBar
        TopAppBar(
            title = { Text(text = "HomeScreen", fontWeight = FontWeight.Bold) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Cyan),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext,MainActivity::class.java))
                }) {
                    Icon(imageVector = Icons.Default.Menu ,
                        contentDescription = "menu",
                        tint = Color.DarkGray)

                }

            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Share ,
                        contentDescription = "share",
                        tint = Color.DarkGray)

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings ,
                        contentDescription = "settings",
                        tint = Color.DarkGray)

                }

            }
        )
        //End of TopAppBar

        Text(
            text = "Destinations",
            fontSize = 30.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.Serif
        )

        //First row
        Row {
            Image(painter = painterResource(id = R.drawable.oblock),
                contentDescription = "oblock",
                modifier = Modifier.size(width = 200.dp, height = 150.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))

            Column {
                Text(text = "O BLOCK,", fontWeight = FontWeight.Bold)
                Text(text = "O BLOCK is in Chicago in the United States.It is full of gang activity and is home to King von")

            }

        }
        Spacer(modifier = Modifier.height(10.dp))
        //end of row
        Row {
            Image(painter = painterResource(id = R.drawable.twentyninehundred),
                contentDescription = "2900",
                modifier = Modifier.size(width = 200.dp, height = 150.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))

            Column {
                Text(text = "2900,", fontWeight = FontWeight.Bold)
                Text(text = "2900 is in East Atlanta,Georgia in the United States.It is full of gang activity and is home to Playboi Carti")

            }


        }
        Spacer(modifier = Modifier.height(10.dp))
        //end of row
        Row {
            Image(painter = painterResource(id = R.drawable.summerhouse),
                contentDescription = "summerhouse",
                modifier = Modifier.size(width = 200.dp, height = 150.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))

            Column {
                Text(text = "SUMMER HOUSE,", fontWeight = FontWeight.Bold)
                Text(text = "Summer House is located in South London.Gangs push food in these ends.The top boys are Dushane and Sully ")

            }


        }
        Spacer(modifier = Modifier.height(10.dp))
        //end of row
        Button(onClick = {
            mContext.startActivity(Intent(mContext,IntentActivity::class.java))
        }) {
            Text(text = "continue")
            
        }

        }


    }



@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
    Layout()
}