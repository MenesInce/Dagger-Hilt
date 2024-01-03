package com.menesince.hiltkullanimi

import android.util.Log
import javax.inject.Inject

class Internet @Inject constructor(var adres: Adres){

    fun basvuruYap(){
        Log.e("Sonuc","Basvuru ${adres.adresBilgisi} yapıldı")
    }
}