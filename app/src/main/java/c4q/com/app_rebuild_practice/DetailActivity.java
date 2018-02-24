package c4q.com.app_rebuild_practice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by D on 2/23/18.
 */

public class DetailActivity extends AppCompatActivity {

    ImageView imageView;
    TextView name;
    TextView dob;
    TextView address;
    TextView email;
    TextView cell;
    String url;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageView = findViewById(R.id.image_view);
        name = findViewById(R.id.name);
        dob = findViewById(R.id.dob);
        address = findViewById(R.id.address);
        email = findViewById(R.id.address);
        cell = findViewById(R.id.cell);

        Intent intent = getIntent();
        url = intent.getStringExtra("picture");
        name.setText(intent.getStringExtra("name"));
        dob.setText(intent.getStringExtra("dob"));
        address.setText(intent.getStringExtra("address"));
        email.setText(intent.getStringExtra("email"));
        cell.setText(intent.getStringExtra("cell"));

        Picasso.with(this)
                .load(url)
                .fit()
                .into(imageView);


    }
}
