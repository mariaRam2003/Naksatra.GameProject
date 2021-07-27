import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Propiedade de la clase TheSpace
 * 
 * @author: Maria Marta Ramirez Gil
 * Carne 21342 Universidad del Valle de Guatemala
 * Proyecto 1 Naksatra Game
 * @version:  0.1.1 - 26 de Julio 2021 
 */
public class Meteorito extends Actor
{
    /* La clase metorito realizara las acciones de moverse por TheSpace y tocar a Puntero*/
    public void act() 
    {
        moverse();
        tocar();
    }    

	/*Definir instancia moverse() para hacer que Meteorito se mueva de manera aleatoria por TheSpace*/
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
    
	//*Definir instacia tocar() para cuando Meteorito toque a Puntero elimine a Puntero*//
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