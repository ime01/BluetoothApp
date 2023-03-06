package com.example.bluetoothapp.data.chat

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.example.bluetoothapp.domain.chat.BluetoothDeviceFromDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceFromDomain{

    return BluetoothDeviceFromDomain(
        name = name,
        address = address

    )
}
