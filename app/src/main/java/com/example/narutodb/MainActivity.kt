package com.example.narutodb

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.narutodb.ViewUtils.gone
import com.example.narutodb.ViewUtils.visible
import com.example.narutodb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val viewModel: NarutoViewModel by viewModels {
        NarutoViewModelFactory()
    }

    private var narutoListAdapter: NarutoListAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        narutoListAdapter = NarutoListAdapter()

        binding.recyclerView.apply {
            adapter = narutoListAdapter
            layoutManager =
                LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
        }

        viewModel.getCharacter()

        binding.backButton.setOnClickListener {
            viewModel.page -= 1
            if (viewModel.page > 1){
                binding.backButton.visible()
            }else{
                binding.backButton.gone()
            }
            viewModel.getCharacter()
        }

        binding.forwardButton.setOnClickListener {
            viewModel.page += 1
            if (viewModel.page == 72){
                binding.forwardButton.gone()
            }else{
                binding.forwardButton.visible()
            }
            viewModel.getCharacter()
        }

        attachObserver()
    }

    private fun attachObserver() {
        viewModel.allCharacter.observe(this) {
            it?.characters?.also { dataList ->
                narutoListAdapter?.setData(dataList as ArrayList<CharactersItem?>)
            }
        }
    }
}