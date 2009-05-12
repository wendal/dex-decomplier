package com.wendal.java.dex.decomplier.vm;

import java.util.ArrayList;
import java.util.List;

public class RegisterHistory {
    
    private List<RegiterEvent> list = new ArrayList<RegiterEvent>();
    
    public void addEvent(RegiterEvent re){
        list.add(re);
    }
    
    public void addCreateEvent(){
        addEvent(new RegiterEvent(RegiterEvent.Create));
    }
    
    public void addIFEvent(){
        addEvent(new RegiterEvent(RegiterEvent.IF));
    }
    
    public void addELSEEvent(){
        addEvent(new RegiterEvent(RegiterEvent.ELSE));
    }
    
    public void addGOTOEvent(){
        addEvent(new RegiterEvent(RegiterEvent.GOTO));
    }
    
    public void addGETEvent(){
        addEvent(new RegiterEvent(RegiterEvent.GET));
    }
    
    public void addPUTEvent(){
        addEvent(new RegiterEvent(RegiterEvent.PUT));
    }
    
    public List<RegiterEvent> getEvent(){
        return list;
    }
    
    class RegiterEvent {
        public static final int Create = 1 << 6;
        public static final int IF     = 1 << 7;
        public static final int ELSE   = 1 << 8;
        public static final int GOTO   = 1 << 9;
        public static final int GET   = 1 << 10;
        public static final int PUT   = 1 << 11;
        
        public int type;
        
        public RegiterEvent(int type) {
            this.type = type;
        }
    }

}
