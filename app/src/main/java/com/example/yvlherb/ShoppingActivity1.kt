package com.example.yvlherb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.yvlherb.ui.theme.YvlherbTheme
import androidx.compose.ui.res.painterResource as painterResource

class ShoppingActivity1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Shopping()


        }
    }
}

@Composable
fun Shopping(){
    Column(modifier = Modifier.fillMaxSize() ){
        Image(imageVector = painterResource(id = R.drawable.gyalone),
            contentDescription = "one"
        )
        
        
        Text(text = "Choose Your Product")
        
        Spacer(modifier = Modifier.width(20.dp))

    }


}


@Preview(showBackground = true)
@Composable
fun ShoppingActivity1Preview(){
    Shopping()

}
