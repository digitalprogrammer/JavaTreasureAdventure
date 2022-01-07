package objects;

import java.io.IOException;

import javax.imageio.ImageIO;

public class Chest extends SuperObject{

    public Chest()
    {
        name = "Key";
        try
        {
            image = ImageIO.read(getClass().getResourceAsStream("./../src/objects/chest.png"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
