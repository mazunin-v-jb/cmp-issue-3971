import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler

@Composable
fun App() {
    MaterialTheme {
        val uriHandler = LocalUriHandler.current

        val tripleDigitCodeNumbers = arrayListOf(
            "+374 999 999 99",
            "+374 (999) 999 99",
            "+374 (999) 999-99",
            "+374-999-999-99",
            "+374 999 999-99",
            "+374999 999 99",
            "+374 999999 99",
            "+374 999 9999 9",
            "+37499999999",
            "099999999",
            "0 (999) 999 99",
            "0 (999) 999-99",
            "0-999-999-99",
            "0 999 999-99",
            "0999 999 99",
            "0 999999 99",
            "0 999 9999 9",
            )

        val singleDigitCodeNumbers = arrayListOf(
            "+7 999 999 99 99",
            "+7 (999) 999 99",
            "+7 (999) 999-99",
            "+7-999-999-99",
            "+7 999 999-99",
            "+7999 999 99",
            "+7 999999 99",
            "+7 999 9999 9",
            "+799999999",
            "8 (999) 999 99",
            "8 (999) 999-99",
            "+7-999-999-99",
            "8 999 999-99",
            "8999 999 99",
            "8 999999 99",
            "8 999 9999 9",
            "899999999",
        )

        val doubleDigitCodeNumbers = arrayListOf(
            "+31 999 999 99",
            "+31 (999) 999 99",
            "+31 (999) 999-99",
            "+31-999-999-99",
            "+31 999 999-99",
            "+31999 999 99",
            "+31 999999 99",
            "+31 999 9999 9",
            "+3199999999",
            "099999999",
            "0 (999) 999 99",
            "0 (999) 999-99",
            "0-999-999-99",
            "0 999 999-99",
            "0999 999 99",
            "0 999999 99",
            "0 999 9999 9",
        )

        LazyColumn(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            item { Text("Web URI for test") }
            item { Button(onClick = { uriHandler.openUri("https://www.google.com") }) {
                Text("google.com")
            } }
            item { Text("Single Digit Codes") }
            items(singleDigitCodeNumbers) {
                Button(onClick = { uriHandler.openUri("tel:$it")} ) {
                    Text(it)
                }
            }
            item { Text("Double Digit Codes") }
            items(doubleDigitCodeNumbers) {
                Button(onClick = { uriHandler.openUri("tel:$it")} ) {
                    Text(it)
                }
            }
            item { Text("Triple Digit Codes") }
            items(tripleDigitCodeNumbers) {
                Button(onClick = { uriHandler.openUri("tel:$it")} ) {
                    Text(it)
                }
            }
        }
    }
}