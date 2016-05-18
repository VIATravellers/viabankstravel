/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Othman
 */
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Othman
 */
public class GuestList {
    private ArrayList<User> users ;

    public GuestList(ArrayList<User> users) {
        this.users = users;
    }

   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GuestList other = (GuestList) obj;
        if (!Objects.equals(this.users, other.users)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GuestList{" + "users=" + users + '}';
    }
    
    
    
}

