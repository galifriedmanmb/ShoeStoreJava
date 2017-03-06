package com.gali.apps.shoestore;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShopFragment extends Fragment {

    boolean heart = false;
    boolean like = false;
    boolean cart = false;

    public ShopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shop, container, false);
        view.findViewById(R.id.heartIV).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (heart) {
                    heart = false;
                    ((ImageView) v).setImageResource(R.drawable.greyheart);
                } else {
                    heart = true;
                    ((ImageView) v).setImageResource(R.drawable.redheart);
                }
            }
        });

        view.findViewById(R.id.likeIV).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (like) {
                    like = false;
                    ((ImageView) v).setImageResource(R.drawable.unlike);
                } else {
                    like = true;
                    ((ImageView) v).setImageResource(R.drawable.like);
                }
            }
        });

        view.findViewById(R.id.cartIV).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cart) {
                    cart = false;
                    ((ImageView) v).setImageResource(R.drawable.cartempty);
                } else {
                    cart = true;
                    ((ImageView) v).setImageResource(R.drawable.cartfull);
                }
            }
        });

        return view;
    }

}
