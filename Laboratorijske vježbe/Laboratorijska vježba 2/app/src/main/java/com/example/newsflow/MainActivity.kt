package com.example.newsflow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvArticles: RecyclerView
    private lateinit var adapter: ArticleAdapter
    private var articlesList = getLatestArticles()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvArticles = findViewById(R.id.rvArticles)
        rvArticles.layoutManager = LinearLayoutManager(this)

        adapter = ArticleAdapter(listOf()) { article ->
            showArticleDetails(article)
        }

        rvArticles.adapter = adapter
        adapter.updateArticles(articlesList)
    }

    private fun showArticleDetails(article: Article) {
        // Implementiramo u Vježbi 3
    }
}