package com.example.responsivedesignprinciples.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.responsivedesignprinciples.R

class LeftAlignedFragment : Fragment() {

    companion object {
        fun newInstance() = LeftAlignedFragment()
    }

    private lateinit var viewModel: LeftAlignedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.left_aligned_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(LeftAlignedViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
