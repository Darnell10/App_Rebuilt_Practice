package c4q.com.app_rebuild_practice.modelclasses;

import c4q.com.app_rebuild_practice.modelclasses.Location;
import c4q.com.app_rebuild_practice.modelclasses.Name;
import c4q.com.app_rebuild_practice.modelclasses.Picture;

/**
 * Created by D on 2/22/18.
 */

public class Results {

    private Name name;
    private Location location;
    private Picture picture;
    private String email;
    private String dob;
    private String cell;

    public Results(Name name, Location location, Picture picture, String email, String dob, String cell) {
        this.name = name;
        this.location = location;
        this.picture = picture;
        this.email = email;
        this.dob = dob;
        this.cell = cell;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }
}
