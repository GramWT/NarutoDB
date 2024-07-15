package com.example.narutodb

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.narutodb.databinding.ActivityCharacterDetailsBinding

class CharacterDetailsActivity : AppCompatActivity() {

    private val binding: ActivityCharacterDetailsBinding by lazy {
        ActivityCharacterDetailsBinding.inflate(layoutInflater)
    }

    private val viewModel: NarutoViewModel by viewModels {
        NarutoViewModelFactory()
    }

    companion object {
        private const val EXTRA_ID = "id"
        fun createIntent(context: Context, id: Int): Intent {
            return Intent(context, CharacterDetailsActivity::class.java).apply {
                putExtra(EXTRA_ID, id)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        intent.getIntExtra(EXTRA_ID, 0).also {
            viewModel.getCharacterId(it)
        }

        attachObserver()
    }

    private fun attachObserver() {
        viewModel.characterDetails.observe(this) {
            it?.images?.getOrNull(0)?.also {
                Glide.with(this)
                    .load(it)
                    .into(binding.characterImageView)
            }
            binding.nameTextView.text = it?.name
        }
    }

}