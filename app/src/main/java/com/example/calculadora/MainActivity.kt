package com.example.calculadora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculadora.ui.theme.CalculadoraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalculadoraTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CalculadoraPropinaApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun CalculadoraPropinaApp(modifier: Modifier = Modifier) {
    var montoCuenta by remember { mutableStateOf("") }
    var propina by remember { mutableStateOf(0.0) }
    var porcentajeSeleccionado by remember { mutableStateOf(0) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFE3F2FD))
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Calculadora de Propinas",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF0D47A1)
        )

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedTextField(
            value = montoCuenta,
            onValueChange = { montoCuenta = it },
            label = {
                Text("Monto de la cuenta")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            singleLine = true,
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                focusedLabelColor = Color(0xFF0D47A1),
                unfocusedLabelColor = Color(0xFF0D47A1)
            )
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Selecciona el porcentaje de propina:",
            color = Color(0xFF0D47A1)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Button(
                onClick = {
                    porcentajeSeleccionado = 10
                    propina = calcularPropina(montoCuenta, 10)
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF42A5F5)
                )
            ) {
                Text("10%")
            }

            Button(
                onClick = {
                    porcentajeSeleccionado = 15
                    propina = calcularPropina(montoCuenta, 15)
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF42A5F5)
                )
            ) {
                Text("15%")
            }

            Button(
                onClick = {
                    porcentajeSeleccionado = 20
                    propina = calcularPropina(montoCuenta, 20)
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF42A5F5)
                )
            ) {
                Text("20%")
            }
        }

        if (propina > 0) {
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Propina: \$%.2f".format(propina),
                fontSize = 22.sp,
                color = Color(0xFF0D47A1),
                fontWeight = FontWeight.Medium
            )
            Text(
                text = "Total a pagar: \$%.2f".format(
                    propina + (montoCuenta.toDoubleOrNull() ?: 0.0)
                ),
                fontSize = 20.sp,
                color = Color.Black
            )
        }
    }
}

fun calcularPropina(
    monto: String,
    porcentaje: Int
): Double {
    val montoDouble = monto.toDoubleOrNull() ?: 0.0
    return montoDouble * porcentaje / 100
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    CalculadoraTheme {
        CalculadoraPropinaApp()
    }
}