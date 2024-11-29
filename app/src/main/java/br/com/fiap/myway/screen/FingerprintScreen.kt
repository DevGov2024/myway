package br.com.fiap.myway.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.com.fiap.myway.R

@Composable
fun FingerprintScreen(navController: NavController) {
    var isCaptured by remember { mutableStateOf(false) }
    var isValid by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Biometria Digital",
            color = Color.Black,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(16.dp))


        if (isCaptured) {
            Image(
                painter = painterResource(id = R.drawable.digital_fiap),
                contentDescription = "Impressão Digital Capturada",
                modifier = Modifier.size(150.dp)
            )
        } else {
            Text(text = "Clique em 'Capturar' para simular a captura da impressão digital.")
        }

        Spacer(modifier = Modifier.height(16.dp))


        Button(onClick = {
            isCaptured = true
            isValid = (1..100).random() > 50
        }) {
            Text(text = "Capturar")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Resultado de Validação
        if (isCaptured) {
            Text(
                text = if (isValid) "Validação bem-sucedida!" else "Validação falhou. Tente novamente.",
                color = if (isValid) Color.Green else Color.Red,
                textAlign = TextAlign.Center
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Botão para voltar à Home
        Button(onClick = {
            navController.navigate("Home")
        }) {
            Text(text = "Voltar")
        }
    }
}