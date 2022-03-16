package com.example.randomlettergenerator

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Letters (val letters: ArrayList<Char>) : Parcelable
