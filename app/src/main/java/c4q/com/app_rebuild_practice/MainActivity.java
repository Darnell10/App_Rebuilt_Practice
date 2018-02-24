package c4q.com.app_rebuild_practice;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.List;

import c4q.com.app_rebuild_practice.modelclasses.Results;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static final String TAG ="Hey there...";

    NetworkService networkService;
    List<Results> userList;
    RecyclerView recyclerView;
    Configuration configuration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retro();





    }

    public void Retro(){
        configuration = getResources().getConfiguration();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://randomuser.me/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        networkService = retrofit.create(NetworkService.class);

        final Call<User> userCall = networkService.getUser();
        userCall.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                Log.d(TAG,"OnResponse" + response.body().getResults());
                User user = response.body();
                userList = user.getResults();
                recyclerView = findViewById(R.id.rv);
                //recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                onConfigurationChanged(configuration);
                recyclerView.setAdapter(new RvAdapter(userList));

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Log.d(TAG, "On Response" + t.toString());

            }
        });

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig){
        super.onConfigurationChanged(newConfig);
        // Orientation of screen, changes gridlayout according to phone orientation
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
            recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),3));
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.refresh:
                Retro();
                return true;
        }
        return false;
    }



}
