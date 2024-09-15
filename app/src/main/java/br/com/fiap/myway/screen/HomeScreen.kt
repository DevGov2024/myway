package br.com.fiap.myway.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.com.fiap.myway.R

@Composable
fun HomeScreen(modifier: Modifier = Modifier, navController: NavController) {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF352F30)
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Navbar Section
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .height(150.dp)
                    .background(colorResource(id = R.color.azul))
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.align(Alignment.CenterVertically)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.map_fiap),
                        contentDescription = "Logo",
                        modifier = Modifier.size(60.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Myway",
                        color = Color.White
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))


            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(20.dp)
                    .background(colorResource(id = R.color.azul))
            ) {
                Text(
                    text = "Bem-vindo ao time!",
                    color = Color.White,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Text(
                    text = "MyWay é um aplicativo destinado a ajudar os motoristas a terem um trajeto seguro, possibilitando que os usuários marquem ruas, estradas e trajetos não seguros para o motorista.",
                    color = Color.White,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Image(
                    painter = painterResource(id = R.drawable.welcome_image),
                    contentDescription = "Welcome Image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .padding(vertical = 20.dp)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))


            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .padding(20.dp)
                    .background(colorResource(id = R.color.azul))
            ) {
                Text(text = "Funcionalidades Principais", color = Color.White)
                Text(text = "• Marcar rotas recomendados e não recomendados para dirigir(dependendo do horário)", color = Color.White)
                Text(text = "• Compartilhar informações com outros usuários", color = Color.White)
                Text(text = "• Buscar por locais específicos", color = Color.White)
                Text(text = "• Ver rotas e pontos de interesse próximos", color = Color.White)
            }

            Spacer(modifier = Modifier.height(20.dp))


            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(colorResource(id = R.color.transparent_white))
                    .padding(16.dp)
            ) {
                Text(text = "Legenda:", color = Color.White, fontWeight = androidx.compose.ui.text.font.FontWeight.Bold)

                Spacer(modifier = Modifier.height(8.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "😊 Rota segura", color = Color.White)
                }

                Spacer(modifier = Modifier.height(8.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "😢 Rota Não segura", color = Color.White)
                }

                Spacer(modifier = Modifier.height(8.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "🛠️ Pista em construção", color = Color.White)
                }

                Spacer(modifier = Modifier.height(8.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "🚧 Interditado", color = Color.White)
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Navigation Buttons
            Button(onClick = {
                navController.navigate("Map")
            }) {
                Text(text = "Map")
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(onClick = {
                navController.navigate("Login")
            }) {
                Text(text = "Sair")
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    //HomeScreen()
}