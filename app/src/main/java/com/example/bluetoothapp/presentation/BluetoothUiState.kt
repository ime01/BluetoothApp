package com.example.bluetoothapp.presentation

import com.example.bluetoothapp.domain.chat.BluetoothDevice

data class BluetoothUiState (
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList()
)