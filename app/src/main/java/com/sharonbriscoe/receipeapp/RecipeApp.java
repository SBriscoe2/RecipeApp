package com.sharonbriscoe.receipeapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;


public class RecipeApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_app);

        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/recipes/findByIngredients?number=5&ranking=1&ingredients=apples%2Cflour%2Ceggs";

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        System.out.println("Response is:" + response.substring(0, 500));
                    }
                }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("That didn't work");

            }
        })
        {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String> headers = new HashMap<>();
                headers.put("X-RapidAPI-Key", "");
                return headers;
            }
        };
        queue.add(stringRequest);


    }
}





//
//    private TextView txtShowTextResult;
//
//    @Override
//
//    protected void onCreate(Bundle savedInstanceState) {
//
//        super.onCreate(savedInstanceState);
//
//        setContentView(R.layout.activity_main);
//
//        txtShowTextResult = findViewById(R.id.txtDisplay);
//
////        RequestQueue requestQueue = VolleySingleton.getInstance().getMrequestQueue();
//        RequestQueue queue = Volley.newRequestQueue(this);
//
//        final String url = "https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/recipes/findByIngredients?number=5&ranking=1&ingredients=apples%2Cflour%2Csugar";
////            final String url = "https://google.com";
//
//        //JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener() {
//        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
//
//            @Override
//            public void onResponse(String response) {
////                    String msg = "List of recipes: ";
////                    StringBuilder formattedResult = new StringBuilder(response);
////                    txtShowTextResult.setText(msg + formattedResult);
//                System.out.println("Response is:" + response.substring(0, 500));
//            }
//
////                    JSONS responseJSONArray = response.  getJSONArray("results");
//
//        }, new Response.ErrorListener() {
//
//            @Override
//
//            public void onErrorResponse(VolleyError error) {
//                System.out.println("That didn't work");
////            String errors = "An Error occurred while making the request";
////            txtShowTextResult.setText(errors);
//
//            }
//        })
//        {
//
//            @Override
//            public Map<String, String> getHeaders() throws AuthFailureError {
//                Map<String, String> headers = new HashMap<>();
//                headers.put("X-RapidAPI-Key", "706acb9b8fmsh417662e132c35d1p1347afjsn89cf66a51d20");
//                return headers;
//            }
//        };
//
//        queue.add(stringRequest);
////            requestQueue.add(stringRequest);
//
//    }
//}
//


//

//    static final String RAPID_API_KEY = "API key here";
//    static final String URL = "https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/recipes/findByIngredients?number=5&ranking=1&ingredients=apples%2Cflour%2Csugar";


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_recipe_app);
//
//        RequestQueue queue = Volley.newRequestQueue(this);
//        String url = "https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/recipes/findByIngredients?number=5&ranking=1&ingredients=apples%2Cflour%2Csugar&key=706acb9b8fmsh417662e132c35d1p1347afjsn89cf66a51d20";


//        private TextView txtShowTextResult;
//
//        @Override
//
//        protected void onCreate(Bundle savedInstanceState) {
//
//            super.onCreate(savedInstanceState);
//
//            setContentView(R.layout.activity_main);
//
//            txtShowTextResult = findViewById(R.id.txtDisplay);
//
//            RequestQueue requestQueue = Volley.newRequestQueue(this);
//
//            final String url = "https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/recipes/findByIngredients?number=5&ranking=1&ingredients=apples%2Cflour%2Csugar&key=706acb9b8fmsh417662e132c35d1p1347afjsn89cf66a51d20";
//
//
//        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener() {
//
//                @Override
//
//                public void onResponse(JSONObject response) {
//
//                    try {
//
//                        StringBuilder formattedResult = new StringBuilder();
//
//                        JSONArray responseJSONArray = response.getJSONArray("results");
//
//                        }
//
//                        txtShowTextResult.setText("List of recipes: " + formattedResult);
//
//                    } catch (JSONException e) {
//
//                        e.printStackTrace();
//
//                    }
//
//
//                }
//
//            }, new Response.ErrorListener() {
//
//                @Override
//
//                public void onErrorResponse(VolleyError error) {
//
//                    txtShowTextResult.setText("An Error occured while making the request");
//
//                }
//
//            });
//
//            requestQueue.add(jsonObjectRequest);
//
//        }
//    }
