package uk.tonymerritt.klavarradio.holders;

import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import uk.tonymerritt.klavarradio.R;
import uk.tonymerritt.klavarradio.model.Station;

/**
 * Created by Klavar on 30/04/2017.
 */

public class StationViewHolder extends RecyclerView.ViewHolder {


    private ImageView mainImage;
    private TextView titleTextViw;

    public StationViewHolder(View itemView) {
        super(itemView);

        this.mainImage = (ImageView)itemView.findViewById(R.id.main_image);
        this.titleTextViw = (TextView)itemView.findViewById(R.id.main_text);
    }

    public  void  updateUI(Station station) {
        String uri = station.getImageUri();
        int resource = mainImage.getResources().getIdentifier(uri, null, mainImage.getContext().getPackageName());
        mainImage.setImageResource(resource);

        titleTextViw.setText(station.getStationTitle());


    }
}
