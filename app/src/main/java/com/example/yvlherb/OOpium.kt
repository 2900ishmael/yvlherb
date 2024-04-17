package com.example.yvlherb

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri

class OOpium00 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OOpium()


        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OOpium(){
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
        //TopAppBar
        TopAppBar(
            title = { Text(text = "Cities", fontWeight = FontWeight.Bold) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
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
                    Icon(imageVector = Icons.Default.Notifications ,
                        contentDescription = "notification",
                        tint = Color.DarkGray)

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Share ,
                        contentDescription = "share",
                        tint = Color.DarkGray)

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Search ,
                        contentDescription = "search",
                        tint = Color.DarkGray)

                }

            }
        )
        //End of TopAppBar
        Spacer(modifier = Modifier.width(15.dp))
        Text(
            text = "Tickets",
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(start = 20.dp),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(10.dp))
        //start of row1
Row {


        Column {
            Card(
                modifier = Modifier
                    .height(100.dp)
                    .width(160.dp)
            ) {

                    Box(modifier = Modifier
                        .fillMaxWidth(),
                        contentAlignment = Alignment.Center){

                        Image(
                            painter = painterResource(id = R.drawable.oblock),
                            contentDescription = "oblock",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                }

            }
            Text(
                text = "O Block",
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.ExtraBold,

                )
            Spacer(modifier = Modifier.height(5.dp))

            Row {
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
            }
            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "443 reviews",
                fontSize = 15.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.ExtraBold,

                )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "From Ksh.38900",
                fontSize = 15.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Blue

            )
            Spacer(modifier = Modifier.height(2.dp))

            Row {
                OutlinedButton(
                    onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:0716974353".toUri()
                        mContext.startActivity(callIntent)
                    },
                    modifier = Modifier
                        .padding(start = 10.dp, end = 10.dp),
                    shape = RoundedCornerShape(5.dp),
                    border = BorderStroke(2.dp, Color.Gray)

                    
                    ) {
                    Text(text = "Call")

                }

                OutlinedButton(
                    onClick = {
                        val shareIntent = Intent(Intent.ACTION_SEND)
                        shareIntent.type = "text/plain"
                        shareIntent.putExtra(
                            Intent.EXTRA_EMAIL,
                            arrayOf("ishygotvlone@gmail.com.com")
                        )
                        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                        shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                        mContext.startActivity(shareIntent)

                    },
                    modifier = Modifier
                        .padding(start = 10.dp, end = 10.dp),
                    shape = RoundedCornerShape(5.dp),
                    border = BorderStroke(2.dp, Color.Gray),
                ) {
                    Text(text = "Email")

                }




            }
        }
    //End of Column1
    Spacer(modifier = Modifier.width(5.dp))

    Column {
        Card(
            modifier = Modifier
                .height(100.dp)
                .width(160.dp)
        ) {

            Box(modifier = Modifier
                .fillMaxWidth(),
                contentAlignment = Alignment.Center){

                Image(
                    painter = painterResource(id = R.drawable.twentyninehundred),
                    contentDescription = "2900",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )

            }

        }
        Text(
            text = "2900",
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.ExtraBold,

            )
        Spacer(modifier = Modifier.height(5.dp))

        Row {
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "star",
                tint = Color.Blue
            )
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "star",
                tint = Color.Blue
            )
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "star",
                tint = Color.Blue
            )
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "star",
                tint = Color.Blue
            )
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "star",
                tint = Color.Blue
            )
        }
        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "443 reviews",
            fontSize = 15.sp,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.ExtraBold,

            )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "From Ksh.38900",
            fontSize = 15.sp,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Blue

        )
        Spacer(modifier = Modifier.height(2.dp))

        Row {
            OutlinedButton(
                onClick = {
                    val callIntent= Intent(Intent.ACTION_DIAL)
                    callIntent.data="tel:0716974353".toUri()
                    mContext.startActivity(callIntent)
                },
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(2.dp, Color.Gray)


            ) {
                Text(text = "Call")

            }

            OutlinedButton(
                onClick = {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(
                        Intent.EXTRA_EMAIL,
                        arrayOf("ishygotvlone@gmail.com.com")
                    )
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                    mContext.startActivity(shareIntent)

                },
                modifier = Modifier
                    .padding(start = 7.dp, end = 7.dp),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(2.dp, Color.Gray),
            ) {
                Text(text = "Email")

            }




        }
    }
}
        //end of row 1....start of 2
Row {
    Column {
        Card(
            modifier = Modifier
                .height(100.dp)
                .width(160.dp)
        ) {

            Box(modifier = Modifier
                .fillMaxWidth(),
                contentAlignment = Alignment.Center){

                Image(
                    painter = painterResource(id = R.drawable.summerhouse),
                    contentDescription = "summerhouse",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )

            }

        }
        Text(
            text = "Summerhouse",
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.ExtraBold,

            )
        Spacer(modifier = Modifier.height(5.dp))

        Row {
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "star",
                tint = Color.Blue
            )
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "star",
                tint = Color.Blue
            )
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "star",
                tint = Color.Blue
            )
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "star",
                tint = Color.Blue
            )
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "star",
                tint = Color.Blue
            )
        }
        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "443 reviews",
            fontSize = 15.sp,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.ExtraBold,

            )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "From Ksh.38900",
            fontSize = 15.sp,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Blue

        )
        Spacer(modifier = Modifier.height(2.dp))

        Row {
            OutlinedButton(
                onClick = {
                    val callIntent= Intent(Intent.ACTION_DIAL)
                    callIntent.data="tel:0716974353".toUri()
                    mContext.startActivity(callIntent)
                },
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(2.dp, Color.Gray)


            ) {
                Text(text = "Call")

            }

            OutlinedButton(
                onClick = {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(
                        Intent.EXTRA_EMAIL,
                        arrayOf("ishygotvlone@gmail.com.com")
                    )
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                    mContext.startActivity(shareIntent)

                },
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(2.dp, Color.Gray),
            ) {
                Text(text = "Email")

            }



                }





        }
    }

}
    }



@Preview(showBackground = true)
@Composable
fun OOpiumPreview(){
    OOpium()
}
