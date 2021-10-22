
package program_1;
public class TV {
    public static int channel;
    public static int volumeLevel;
    public boolean on;
    TV(int channel , int volumeLevel , boolean on)
    {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
    }
    public void turnOn()
    {
        if(on == true)
            System.out.println("Tv is turnOn");
    }
    public void turnOff()
    {
        if(on == false)
            System.out.println("Tv is turnOff");
    }
    public void setChannel (int newChannel)
    {
        channel = newChannel;
    }
     public void setVolume (int newVolume)
    {
        volumeLevel = newVolume;
    }
     public void channelUp()
     {
         channel++;
     }
      public void channelDown()
     {
         channel--;
     }
      public void volumeUp()
      {
          volumeLevel++;
      }
      public void volumeDown()
      {
          volumeLevel--;
      }
      public void print()
      {
          System.out.println("The current channel is : " + channel + "\nThe current volume is : " + volumeLevel 
          + "\nIs TV turn on....?1 : "+ on);
          System.out.println("===========================");
      }
}
