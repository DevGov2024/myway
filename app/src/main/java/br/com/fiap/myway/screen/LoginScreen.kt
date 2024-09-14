package br.com.fiap.myway.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.R
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun LoginScreen (modifier: Modifier = Modifier, navController: NavController) {

    var emailState = remember {
        mutableStateOf("")
    }


    var passState = remember {
        mutableStateOf("")
    }

    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Color(0xFF5865DB)


    ) {


        Column(


            modifier = Modifier

                .padding(
                    vertical =32.dp,
                    horizontal = 48.dp


                ),

            verticalArrangement = Arrangement.SpaceEvenly

        )


        {
            Column {
                Text(
                    text = "MyWay",
                    fontSize = 48.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White

                )
                Text(text = "Registre-se",
                    color = Color.White



                )


                Image(
                    painter = painterResource(id =br.com.fiap.myway.R.drawable.bum_fiap ),
                    contentDescription ="Descrição da imagem",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)


                )






            }
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                OutlinedTextField(value = emailState.value,
                    onValueChange ={

                        emailState.value =  it
                    },
                    label = {
                        Text(text = "E-mail")
                    },

                    modifier = Modifier.fillMaxWidth()


                )

                OutlinedTextField(value = passState.value,
                    onValueChange ={
                        passState.value = it
                    },
                    label = {
                        Text(text = "passaword")
                    },

                    modifier = Modifier.fillMaxWidth()


                )




            }

            Button(
                onClick = {


                    navController.navigate("Home")
                },

                modifier = Modifier.fillMaxWidth()

            ) {
                Text(text = "Login")
            }

        }

    }



}


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun LoginScreenPreview() {
    // LoginScreen()
}



