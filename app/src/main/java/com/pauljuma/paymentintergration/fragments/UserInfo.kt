package com.pauljuma.hackathon.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.pauljuma.paymentintergration.R
import kotlinx.android.synthetic.main.fragment_user_info.view.*


class UserInfo : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_user_info, container, false)

        val enteredName = view.tvName
        val enteredPaybill = view.tvIdNumber
        val accountNumber = view.tvAccountNumber
        val phoneNumber = view.tvPhoneNumber

        val args = this.arguments

        val inputName = args?.get("name")
        "Name: ${inputName.toString()}".also { enteredName.text = it }

        val inputPaybill = args?.get("paybill")
        "Paybill: ${inputPaybill.toString()}".also { enteredPaybill.text = it }

        val inputAccountNumber = args?.get("accountNumber")
        "Account Number: ${inputAccountNumber.toString()}".also { accountNumber.text = it }

        val inputPhoneNumber = args?.get("phoneNumber")
        "Phone Number: ${inputPhoneNumber.toString()}".also { phoneNumber.text = it }

        return view
    }

}

