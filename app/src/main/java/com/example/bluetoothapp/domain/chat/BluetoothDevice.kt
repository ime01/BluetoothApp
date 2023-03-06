package com.example.bluetoothapp.domain.chat

typealias BluetoothDeviceFromDomain = BluetoothDevice

data class BluetoothDevice(
    val name: String?,
    val address: String,
)
