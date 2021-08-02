import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Propiedade de la clase TheSpace
 * 
 * @author: Maria Marta Ramirez Gil
 * Carne 21342 Universidad del Valle de Guatemala
 * Proyecto 1 Naksatra Game
 * @version:  0.1.2 - 26 de Julio 2021 
 */
public class salir extends Actor
{
    public salir() 
    {
        GreenfootImage miImagen = getImage();
        int nuevaAltura = (int)miImagen.getHeight()/2;
        int nuevoAncho = (int)miImagen.getWidth()/2;
        miImagen.scale(nuevoAncho, nuevaAltura);
    }    
}