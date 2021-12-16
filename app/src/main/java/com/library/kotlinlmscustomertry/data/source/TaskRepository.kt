package com.example.kotlinmvvmsample.data.source

import android.content.Context
import com.google.gson.JsonObject
import com.example.kotlinmvvmsample.data.Result
import org.json.JSONObject

interface TaskRepository {

    //API Implementation

    suspend fun apiCall(
        context: Context,
        urlPath: String,
        jsonObject: JSONObject
    ): Result<JsonObject>

}