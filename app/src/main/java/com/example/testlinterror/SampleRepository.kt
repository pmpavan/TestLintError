package com.example.testlinterror

import javax.inject.Inject

class SampleRepository @Inject constructor() {
    fun getString(): String {
        return "injectedString"
    }
}