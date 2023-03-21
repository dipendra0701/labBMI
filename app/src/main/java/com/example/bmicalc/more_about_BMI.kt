package com.example.bmicalc

import android.app.ProgressDialog
import android.app.ProgressDialog.show
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.core.view.isEmpty
import com.example.bmicalc.databinding.ActivityMoreAboutBmiBinding
import com.google.android.material.snackbar.Snackbar

private fun Snackbar.setAction(s: String) {

}

class more_about_BMI : AppCompatActivity() {
    private lateinit var binding: ActivityMoreAboutBmiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoreAboutBmiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.webview.webViewClient = MyWebViewClient()
        binding.webview.loadUrl("https://www.indi.ie/fact-sheets/healthy-eating,-healthy-weight-and-dieting/435-all-about-body-mass-index.html")

    }



//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        when (item.itemId) {
//            R.id.item3 -> {
//                ProgressDialog(this).apply {
//                    this.setCancelable(false)
//                    this.setTitle(R.string.app_name)
//                    this.setMessage("please Wait..")
//                    this.setProgressStyle(ProgressDialog.STYLE_SPINNER)
//                }
//                    .show()
//            }
//
//
//        }
//
//
//        return true
//    }

    inner class MyWebViewClient : WebViewClient() {
        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            binding.progressbar.visibility = View.GONE
        }


    }
//    override fun onOptionsItemSelected(item: MenuItem) {
//        when (item.itemId) {
//            R.id.item3 -> {
//                if (binding.webview.isEmpty()) {
//                    Snackbar.make(binding.root, "Network Error", Snackbar.LENGTH_SHORT)
//                        .setAction("Retry", object : View.OnClickListener {
//                            override fun onClick(v: View?) {
//                                Toast.makeText(this, "loading", Toast.LENGTH_SHORT).show()
//                            }
//                        })
//                        .show()
//                }
//            }
//
//
//        }
//    }

}