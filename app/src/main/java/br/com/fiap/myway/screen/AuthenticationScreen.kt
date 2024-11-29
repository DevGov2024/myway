package br.com.fiap.myway.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun AuthenticationScreen(navController: NavController) {
    Surface(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        color = Color(color = 0xFFDC3058)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center
        ) {
            // Form Fields
            val cpf = remember { mutableStateOf("") }
            val name = remember { mutableStateOf("") }
            val address = remember { mutableStateOf("") }
            val phone = remember { mutableStateOf("") }

            OutlinedTextField(
                value = cpf.value,
                onValueChange = { cpf.value = it },
                label = { Text("CPF") },
                modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
            )
            OutlinedTextField(
                value = name.value,
                onValueChange = { name.value = it },
                label = { Text("Nome Completo") },
                modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
            )
            OutlinedTextField(
                value = address.value,
                onValueChange = { address.value = it },
                label = { Text("Endereço") },
                modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
            )
            OutlinedTextField(
                value = phone.value,
                onValueChange = { phone.value = it },
                label = { Text("Telefone Celular") },
                modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
            )

            Spacer(modifier = Modifier.height(24.dp))


            Button(onClick = { /* Add form validation or API logic here */ }) {
                Text("Validar")
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Navigation back to Home
            Button(onClick = { navController.popBackStack() }) {
                Text("Voltar")
            }
        }
    }
}
