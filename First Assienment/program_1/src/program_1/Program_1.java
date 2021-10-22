
package program_1;
public class Program_1 {
    public static void main(String[] args) {
        TV t = new TV(20 , 5 , true);
        t.print();
        ////////////////////////
        t.turnOn();
        t.turnOff();
        t.setChannel(111);
        t.setVolume(3);
        t.print();
        t.channelUp();
        t.print();
        t.channelDown();
        t.channelDown();
        t.print();
        t.volumeUp();
        t.print();
        t.volumeDown();
        t.volumeDown();
        t.volumeDown();
        t.print();
    }
    
}
