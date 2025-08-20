package org.example.behavioral;

import java.util.ArrayList;
import java.util.List;

public interface Observer {
    void update (String msg);
}
class Follower implements Observer{
    private String name;
    public Follower(String name) {
        this.name=name;

    }

    @Override
    public void update(String msg) {
        System.out.println(name+" received; "+msg);
    }
}
class Channel{
    private List<Observer> followers=new ArrayList<>();
    public void subscribe(Observer observer){
        followers.add(observer);
    }
    public void notifyAllObservers(String msg){
        for (Observer observer:followers){
            observer.update(msg);
        }
    }
    public static void  main(String[] args){
        Channel channel=new Channel();
        channel.subscribe(new Follower("kenan"));
        channel.subscribe(new Follower("test"));
        channel.notifyAllObservers("hello follewrs");
    }
}
