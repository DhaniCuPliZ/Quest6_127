package com.example.myarsitekturmvvm.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.myarsitekturmvvm.R
import com.example.myarsitekturmvvm.model.Siswa

@Composable
fun TampilSiswa(
    statusUISiswa: Siswa,
    onBackButtonClicked:()-> Unit
){
    val items = listOf(
        Pair(first = stringResource(id = R.string.nama), second = statusUISiswa.nama),
        Pair(first = stringResource(id = R.string.gender), second = statusUISiswa.gender),
        Pair(first = stringResource(id = R.string.alamat), second = statusUISiswa.alamat),
    )

