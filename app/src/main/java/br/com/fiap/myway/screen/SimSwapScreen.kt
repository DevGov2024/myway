package br.com.fiap.myway.screen

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.myway.ui.theme.MyWayTheme

@Composable
fun SimSwapScreen(navController: NavController) {
    val phoneNumber = remember { androidx.compose.runtime.mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "SIM SWAP", style = androidx.compose.ui.text.TextStyle(fontSize = 24.sp))

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = phoneNumber.value,
            onValueChange = { phoneNumber.value = it },
            label = { Text(text = "Número de Telefone") },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Phone
            ),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {

                if (phoneNumber.value.isNotEmpty()) {

                    Toast.makeText(navController.context, "Verificando troca de chip...", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(navController.context, "Digite um número de telefone válido", Toast.LENGTH_SHORT).show()
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Verificar")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {

                navController.navigate("Home")
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Voltar para Home")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSimSwapScreen() {
    MyWayTheme {

    }
}

