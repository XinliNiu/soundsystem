package org.ifool.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by niuxinli on 19/7/17.
 */
@Component("lonelyHeartsClub")
public class SgtPeppers  implements CompactDisc{
    private String title = "sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
