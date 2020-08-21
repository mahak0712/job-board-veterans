/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Event.Event;

/**
 *
 * @author guruisi
 */
public class EventWorkRequest extends WorkRequest {
    private Event event;

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
    @Override
    public String toString(){
        return this.event.getEventName();
    }
}
