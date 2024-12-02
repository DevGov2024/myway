package br.com.fiap.myway.screen



import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material3.OutlinedTextField
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
fun ScoreScreen(navController: NavController) {
    var cpf by remember { mutableStateOf(TextFieldValue("")) }
    var score by remember { mutableStateOf<Int?>(null) }
    var errorMessage by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Score Antifraude", color = Color.Black)

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = cpf,
            onValueChange = { cpf = it },
            label = { Text("Digite o CPF") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                if (cpf.text.length == 11) {
                    score = (1..1000).random()
                    errorMessage = ""
                } else {
                    errorMessage = "CPF inválido! Insira 11 dígitos."
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Consultar Score")
        }

        Spacer(modifier = Modifier.height(16.dp))

        if (errorMessage.isNotEmpty()) {
            Text(text = errorMessage, color = Color.Red)
        } else if (score != null) {
            Text(
                text = "Score Antifraude: $score",
                color = if (score!! > 700) Color.Green else Color.Red
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        Button(onClick = { navController.navigate("Home") }) {
            Text(text = "Voltar para Home")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewScoreScreen() {

}
