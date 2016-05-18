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
public class EventList {
    private ArrayList<Event> events ;

    public EventList(ArrayList<Event> events) {
        this.events = events;
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
        final EventList other = (EventList) obj;
        if (!Objects.equals(this.events, other.events)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EventList{" + "events=" + events + '}';
    }
    
    
   
    
}

