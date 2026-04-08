package Assignments.UngradedAssignment_CompositePattern;

import java.util.ArrayList;

public class Playlist implements IComponent {

    public String playlistName;
    public ArrayList<IComponent> playlist;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.playlist = new ArrayList<>();
    }

    public void add(IComponent component) {
        this.playlist.add(component);
    }

    public void remove(IComponent component) {
        this.playlist.remove(component);
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        for (IComponent songs : playlist) {
            songs.setPlaybackSpeed(speed);
        }
    }

    @Override
    public void play() {
        for (IComponent songs : playlist) {
            songs.play();
        }
    }

    @Override
    public String getName() {
        return this.playlistName;
    }
}