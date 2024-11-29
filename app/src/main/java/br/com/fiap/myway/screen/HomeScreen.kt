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
                    .background(colorResource(id = R.color.vermelho_fiap))
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.align(Alignment.CenterVertically)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.antifraud_fiap),
                        contentDescription = "Logo",
                        modifier = Modifier.size(60.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Soluções antifraudes ",
                        color = Color.White
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))


            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(20.dp)
                    .background(colorResource(id = R.color.vermelho_fiap))
            ) {
                Text(
                    text = "Bem-vindo ao time!",
                    color = Color.White,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Text(
                    text = "Nosso aplicativo  tem como objetivo de simular os principais fluxos de autenticação e verificação antifraude oferecidos pela QUOD, permitindo que os vendedores apresentem a confiabilidade e a inovação das soluções, incluindo novas tecnologias de biometria e autenticação",
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
                    .background(colorResource(id = R.color.vermelho_fiap))
            ) {
                Text(text = "Requisitos principais", color = Color.White)
                Text(text = "• Biometria facial: Simulação de captura de face e validação)", color = Color.White)
                Text(text = "•  Biometria digital: Simulação de captura de uma impressão digital dos dedos da mão e validação", color = Color.White)
                Text(text = "•Análise de documento (Documentoscopia): Validação da autenticidade de documentos através da captura de foto do documento, face e validação.", color = Color.White)
                Text(text = "•  SIM SWAP: Modalidade na qual as operadoras confirmam a troca recente de chip através de chamada a endpoint.", color = Color.White)
                Text(text = "• Autenticação Cadastral: Formulário para preenchimento e validação de CPF, nome, endereço e telefone celular)..", color = Color.White)
                Text(text = "•  Score Antifraude: Formulário para preenchimento do CPF e posterior exibição do Score (1-1000 onde quanto maior menor é a chance de fraude)..", color = Color.White)
            }





            Spacer(modifier = Modifier.height(10.dp))

            Button(onClick = {
                navController.navigate("Login")
            }) {
                Text(text = "Sair")
            }
            Spacer(modifier = Modifier.height(10.dp))

            Button(onClick = {
                navController.navigate("Authentication")
            }) {
                Text(text = "Autenticação")
            }

            Button(onClick = {
                navController.navigate("Score")
            }) {
                Text(text = "Score Antifraude")
            }

            Button(onClick = {
                navController.navigate("Biometrics")
            }) {
                Text(text = "Biometria Facial")
            }

            Button(onClick = {
                navController.navigate("Fingerprint")
            }) {
                Text(text = "Biometria Digital")
            }
            Button(onClick = {
                navController.navigate("DocumentAnalysis")
            }) {
                Text(text = "Análise de Documento")
            }

            Button(onClick = {
                navController.navigate("SimSwap")
            }) {
                Text(text = "Verificar SIM SWAP")
            }

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    //HomeScreen()
}

