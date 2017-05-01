package uk.tonymerritt.klavarradio.services;

import java.util.ArrayList;

import uk.tonymerritt.klavarradio.model.Station;

/**
 * Created by Klavar on 01/05/2017.
 */

public class DataService {
    private static final DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {

    }

    public ArrayList<Station> getFeaturedStations() {
        //Pretend we just downloaded featured stations from the internet.

        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight Plan (Tunes for Travel)", "flightplanmusic"));
        list.add(new Station("Two-Wheelin' (Biking Playlist)", "bicyclemusic"));
        list.add(new Station("Kids Jams (Music for Children)", "kidsmusic"));

        return list;
    }

    public  ArrayList<Station> getRecentStation() {
        ArrayList<Station> list = new ArrayList<>();

        ArrayList<Station> list2 = new ArrayList<>();
        list.add(new Station("Key Music (Music for You)", "keymusic"));
        list.add(new Station("Classics (Old Classics)", "vinylmusic"));
        list.add(new Station("Kids Jams (Music for Children)", "kidsmusic"));

        return list;
    }

    public  ArrayList<Station> getPartyStation() {
        ArrayList<Station> list = new ArrayList<>();

        ArrayList<Station> list3 = new ArrayList<>();
        list.add(new Station("Party Now (Party Time)", "socialmusic"));
        list.add(new Station("Two-Wheelin' (Biking Playlist)", "bicyclemusic"));
        list.add(new Station("Classics (Old Classics)", "vinylmusic"));

        return list;
    }

 }
