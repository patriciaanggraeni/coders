package com.example.basic.other.hacks

import android.content.Context
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

// masuk list yang ingin ditanyakan!
class SharedPreferencesDelegate(
    private val context: Context,
    private val name: String,
    private val defaultValue: String = ""
) : ReadWriteProperty<Any?, String> {
    private val sharedPreferences by lazy {
        context.getSharedPreferences("my_pref", Context.MODE_PRIVATE)
    }

    override fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return sharedPreferences.getString(name, defaultValue) ?: defaultValue
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        sharedPreferences.edit().putString(name, value).apply()
    }
}

fun Context.sharedPreferences(name: String) = SharedPreferencesDelegate(this, name)

@Composable
@Preview(showBackground = true)
fun SharedPreferencesPreview(modifier: Modifier = Modifier) {
    val context = LocalContext.current

    // tinggal passing key-nya
    var token by context.sharedPreferences("token")

    // lalu isi nilai yang ingin disimpan, jadi deh!
    token = "Hello World"

    Surface(modifier = Modifier.fillMaxWidth()) {
        Text(text = token)
    }
}