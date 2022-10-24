package com.pauljuma.hackathon.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.pauljuma.paymentintergration.R
import kotlinx.android.synthetic.main.fragment_enter_info.view.*

class EnterInfoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_enter_info, container, false)

        view.btnSave.setOnClickListener {
            val name = view.etName.text.toString()
            val idNumber = view.etIdNumber.text.toString()
            val phoneNumber = view.etIdPhoneNumber.text.toString()
            val payBill = view.etPaybill.text.toString()
            val accountNumber = view.etAccountNumber.text.toString()

            if (idNumber.isEmpty() || idNumber.length != 8) {
                val name = view.oflIdNumberLayout
                name.error = getString(R.string.id_error)
            } else if (phoneNumber.isEmpty() || phoneNumber.length != 10) {
                val name2 = view.oflPhoneNumberLayout
                name2.error = getString(R.string.phone_number)
            } else {
                val bundle = Bundle()
                bundle.putString("name", name)
                bundle.putString("paybill", payBill)
                bundle.putString("accountNumber", accountNumber)
                bundle.putString("phoneNumber", phoneNumber)

                val userInfo = UserInfo()
                userInfo.arguments = bundle

                fragmentManager?.beginTransaction()?.replace(R.id.flFragments, userInfo)
                    ?.addToBackStack(null)?.commit()
            }
        }

        return view

        /* val name = view.oflIdNumberLayout
        name.error = getString(R.string.error)

         val name2 = view.oflPhoneNumberLayout
         name2.error = getString(R.string.error)*/
    }

}