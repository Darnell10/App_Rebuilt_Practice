package c4q.com.app_rebuild_practice;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import c4q.com.app_rebuild_practice.modelclasses.Results;

/**
 * Created by D on 2/22/18.
 */

public class ViewHolder extends RecyclerView.ViewHolder{

    ImageView imageView;
    TextView  firstName;
    TextView  lastName;


    public ViewHolder(View itemView) {
        super(itemView);

        firstName=itemView.findViewById(R.id.first_name);
        lastName=itemView.findViewById(R.id.last_name);
        imageView=itemView.findViewById(R.id.image_view);

    }


    public void onbind(final Results results){
        firstName.setText(results.getName().getFirst());
        lastName.setText(results.getName().getLast());

        //this string variable should be in the
        String url = results.getPicture().getMedium();
        Picasso.with(itemView.getContext())
                .load(url)
                .into(imageView);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent details = new Intent(itemView.getContext(),DetailActivity.class);
                details.putExtra("picture",results.getPicture().getMedium());
                details.putExtra("name",results.getName().getFirst());
                details.putExtra("email",results.getEmail());
                details.putExtra("dob",results.getDob());
                details.putExtra("cell",results.getCell());
                details.putExtra("address",results.getLocation().getCity());
                itemView.getContext().startActivity(details);
            }
        });
    }




}
