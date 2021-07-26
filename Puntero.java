import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Puntero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puntero extends Actor
{
    /**
     * Moverse con las flechas
     */
    public void act() 
    {
        movimientoFlechas();
        move(4);
        tocarEstrella();
    }    
    
    public void movimientoFlechas()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        
        if (Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
    }
    
    public void tocarEstrella()
    {
        Actor estrella;
        estrella = getOneObjectAtOffset(0, 0, EstrellaSi.class);
        Actor Star;
        //Star = getOneObjectAtOffset(star.class, 0, 0);
        if (estrella != null)
        {
            World world;
            world = getWorld();
            world.removeObject(estrella);
        }
    }
}
