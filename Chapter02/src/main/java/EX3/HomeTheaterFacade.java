/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX3;

public class HomeTheaterFacade {

    private TV tv = new TV();
    private SoundSystem sound = new SoundSystem();
    private DVDPlayer dvd = new DVDPlayer();

    public void watchMovie() {
        tv.on();
        sound.on();
        dvd.on();
    }
}
