package com.example.testmatch;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;


public class SendActivity extends AppCompatActivity {

    public void onCreate(Bundle state) {
        super.onCreate(state);
        RequestQueue queue = Volley.newRequestQueue(this);  // this = context
        String url = "https://138.68.237.94:80/mysql_test/connectg.php";
        //final String sensorid = ((TextView) findViewById(R.id.tvresult)).getText().toString();
        //final String goodsid = ((TextView) findViewById(R.id.tvresult2)).getText().toString();

        StringRequest postRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>()
                {
                    @Override
                    public void onResponse(String response) {
                        // response
                        Log.d("Response", response);
                    }
                },
                new Response.ErrorListener()
                {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // error
                        Log.d("Error.Response", error.getMessage());
                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams()
            {
                Map<String, String>  params = new HashMap<String, String>();
                params.put("name", MainActivity.sensorid);
                params.put("price", MainActivity.goodsid);
                Log.d("Post", MainActivity.sensorid);
                return params;
            }
        };
        queue.add(postRequest);
    }
}