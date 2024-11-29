package br.com.fiap.myway.screen

import android.graphics.Bitmap
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.com.fiap.myway.R

@Composable
fun DocumentAnalysisScreen(navController: NavController) {
    var isDocumentCaptured by remember { mutableStateOf(false) }
    var isFaceCaptured by remember { mutableStateOf(false) }
    var documentBitmap: Bitmap? by remember { mutableStateOf(null) }
    var faceBitmap: Bitmap? by remember { mutableStateOf(null) }
    var isValid by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Análise de Documento (Documentoscopia)",
            color = Color.Black,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(16.dp))



        if (isDocumentCaptured) {
            faceBitmap?.let {
                Image(
                    bitmap = it.asImageBitmap(),
                    contentDescription = "Foto do Documento",
                    modifier = Modifier.size(150.dp)
                )
            }
        } else {
            Text(text = "Clique em 'Capturar Documento' para simular a captura da foto do documento.")
        }

        Spacer(modifier = Modifier.height(16.dp))


        if (isFaceCaptured) {
            Image(
                painter = painterResource(id = R.drawable.documento_fiap),
                contentDescription = "Foto da Face",
                modifier = Modifier.size(150.dp)
            )
        } else {
            Text(text = "Clique em 'Capturar Face' para simular a captura da foto da face.")
        }

        Spacer(modifier = Modifier.height(16.dp))


        Button(onClick = {
            isDocumentCaptured = true
            documentBitmap = null
        }) {
            Text(text = "Capturar Documento")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            isFaceCaptured = true
            faceBitmap = null // Simule a captura da foto da face
        }) {
            Text(text = "Capturar Face")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Validação da autenticidade do documento
        Button(onClick = {
            if (isDocumentCaptured && isFaceCaptured) {
                // Simule a validação da autenticidade
                isValid = (1..100).random() > 50 // Validação aleatória simulada
            }
        }) {
            Text(text = "Validar Documento e Face")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Exibir resultado da validação
        if (isValid) {
            Text(
                text = "Documento e Face Validados com Sucesso!",
                color = Color.Green,
                textAlign = TextAlign.Center
            )
        } else if (isDocumentCaptured && isFaceCaptured) {
            Text(
                text = "Falha na Validação. Tente Novamente.",
                color = Color.Red,
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