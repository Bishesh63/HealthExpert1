package net.bishesh.HealthExpert.ui.fragments


import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_profile.*
import kotlinx.android.synthetic.main.fragment_profile.image_view
import kotlinx.android.synthetic.main.fragment_profile.text_email
import kotlinx.android.synthetic.main.fragment_profile.text_phone
import net.bishesh.HealthExpert.R




class HomeFragment : Fragment() {

    private val currentUser = FirebaseAuth.getInstance().currentUser



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    }

