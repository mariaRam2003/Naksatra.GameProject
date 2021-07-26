import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Meteorito here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Meteorito extends Actor
{
    /**
     * Moverse de manera aleatoria*/
    public void act() 
    {
        moverse();
        tocar();
    }    

    public void moverse()
    {
        move(2);
        if (Greenfoot.getRandomNumber(100)<10)
        {
            turn(Greenfoot.getRandomNumber(90) -45);
        }
        
        if (getX() <= 5 || getX() >= getWorld().getWidth() -5)
        {
            turn(180);
        }
        
        if (getY() <= 5 || getY() >= getWorld().getWidth() -5)
        {
            turn(180);
        }
    }
    
    public void tocar()
    {
        Actor puntero;
        puntero = getOneObjectAtOffset(0, 0, Puntero.class);
        if (puntero != null)
        {
            World world;
            world = getWorld();
            world.removeObject(puntero);
        }
    }
}