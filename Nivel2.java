import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Propiedade de la clase TheSpace
 * 
 * @author: Maria Marta Ramirez Gil
 * Carne 21342 Universidad del Valle de Guatemala
 * Proyecto 1 Naksatra Game
 * @version:  0.1.2 - 26 de Julio 2021 
 */
public class Nivel2 extends World
{

    /**
     * Constructor for objects of class Nivel2.
     * 
     */
    public Nivel2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

  
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Estrellano estrellano = new Estrellano();
        addObject(estrellano,510,182);
        Estrellano estrellano2 = new Estrellano();
        addObject(estrellano2,578,268);
        Estrellano estrellano3 = new Estrellano();
        addObject(estrellano3,482,320);
        Estrellano estrellano4 = new Estrellano();
        addObject(estrellano4,486,209);
        Estrellano estrellano5 = new Estrellano();
        addObject(estrellano5,330,97);
        Estrellano estrellano6 = new Estrellano();
        addObject(estrellano6,482,91);
        Estrellano estrellano7 = new Estrellano();
        addObject(estrellano7,430,122);
        Estrellano estrellano8 = new Estrellano();
        addObject(estrellano8,431,182);
        Estrellano estrellano9 = new Estrellano();
        addObject(estrellano9,370,237);
        Estrellano estrellano10 = new Estrellano();
        addObject(estrellano10,536,106);
        Estrellano estrellano11 = new Estrellano();
        addObject(estrellano11,315,179);
        Estrellano estrellano12 = new Estrellano();
        addObject(estrellano12,504,278);
        Estrellano estrellano13 = new Estrellano();
        addObject(estrellano13,403,251);
        Estrellano estrellano14 = new Estrellano();
        addObject(estrellano14,557,213);
        Estrellano estrellano15 = new Estrellano();
        addObject(estrellano15,456,269);
        Estrellano estrellano16 = new Estrellano();
        addObject(estrellano16,388,163);
        Estrellano estrellano17 = new Estrellano();
        addObject(estrellano17,487,141);
        Estrellano estrellano18 = new Estrellano();
        addObject(estrellano18,528,58);
        Estrellano estrellano19 = new Estrellano();
        addObject(estrellano19,474,35);
        Estrellano estrellano20 = new Estrellano();
        addObject(estrellano20,584,70);
        EstrellaSi estrellaSi = new EstrellaSi();
        addObject(estrellaSi,163,310);
        EstrellaSi estrellaSi2 = new EstrellaSi();
        addObject(estrellaSi2,136,205);
        EstrellaSi estrellaSi3 = new EstrellaSi();
        addObject(estrellaSi3,214,74);
        EstrellaSi estrellaSi4 = new EstrellaSi();
        addObject(estrellaSi4,368,94);
        EstrellaSi estrellaSi5 = new EstrellaSi();
        addObject(estrellaSi5,282,239);
        estrellano11.setLocation(24,24);
        estrellano5.setLocation(65,72);
        estrellano16.setLocation(162,31);
        estrellano7.setLocation(290,23);
        estrellano19.setLocation(361,39);
        estrellano6.setLocation(52,129);
        estrellano9.setLocation(4,199);
        estrellano13.setLocation(157,104);
        estrellano8.setLocation(314,86);
        estrellano8.setLocation(285,91);
        estrellano17.setLocation(429,52);
        estrellano18.setLocation(500,7);
        estrellano20.setLocation(566,28);
        estrellano10.setLocation(500,70);
        estrellano.setLocation(548,114);
        estrellano14.setLocation(570,171);
        estrellano2.setLocation(578,250);
        estrellano4.setLocation(480,178);
        estrellano4.setLocation(445,115);
        estrellano12.setLocation(516,190);
        estrellano15.setLocation(448,225);
        estrellano3.setLocation(512,263);
        Estrellano estrellano21 = new Estrellano();
        addObject(estrellano21,562,302);
        Estrellano estrellano22 = new Estrellano();
        addObject(estrellano22,469,306);
        Estrellano estrellano23 = new Estrellano();
        addObject(estrellano23,372,290);
        Estrellano estrellano24 = new Estrellano();
        addObject(estrellano24,418,189);
        Estrellano estrellano25 = new Estrellano();
        addObject(estrellano25,348,176);
        Estrellano estrellano26 = new Estrellano();
        addObject(estrellano26,253,171);
        Estrellano estrellano27 = new Estrellano();
        addObject(estrellano27,543,369);
        Estrellano estrellano28 = new Estrellano();
        addObject(estrellano28,406,340);
        Estrellano estrellano29 = new Estrellano();
        addObject(estrellano29,213,327);
        Estrellano estrellano30 = new Estrellano();
        addObject(estrellano30,296,334);
        Estrellano estrellano31 = new Estrellano();
        addObject(estrellano31,96,266);
        Estrellano estrellano32 = new Estrellano();
        addObject(estrellano32,34,330);
        Estrellano estrellano33 = new Estrellano();
        addObject(estrellano33,79,381);
        Estrellano estrellano34 = new Estrellano();
        addObject(estrellano34,159,387);
        estrellaSi.setLocation(162,308);
        star star = new star();
        addObject(star,162,308);
        estrellaSi.setLocation(164,265);
        estrellaSi.setLocation(166,306);
        estrellaSi.setLocation(166,306);
        removeObject(estrellaSi);
        removeObject(estrellaSi5);
        star.setLocation(166,278);
        star.setLocation(159,314);
        estrellaSi2.setLocation(121,203);
        star star2 = new star();
        addObject(star2,121,203);
        removeObject(estrellaSi2);
        star2.setLocation(136,200);
        star star3 = new star();
        addObject(star3,274,256);
        removeObject(estrellaSi3);
        removeObject(estrellaSi4);
        star star4 = new star();
        addObject(star4,243,80);
        star star5 = new star();
        addObject(star5,374,120);
        star3.setLocation(279,246);
        star3.setLocation(282,268);
        star4.setLocation(242,80);
        Estrellano estrellano35 = new Estrellano();
        addObject(estrellano35,206,197);
        Estrellano estrellano36 = new Estrellano();
        addObject(estrellano36,360,235);
        Estrellano estrellano37 = new Estrellano();
        addObject(estrellano37,204,258);
        Estrellano estrellano38 = new Estrellano();
        addObject(estrellano38,123,148);
        star5.setLocation(376,121);
        Estrellano estrellano39 = new Estrellano();
        addObject(estrellano39,350,364);
        Estrellano estrellano40 = new Estrellano();
        addObject(estrellano40,456,365);
        Puntero puntero = new Puntero();
        addObject(puntero,28,64);
        estrellano20.setLocation(563,27);
        Meteorito meteorito = new Meteorito();
        addObject(meteorito,563,27);
        Meteorito meteorito2 = new Meteorito();
        addObject(meteorito2,568,368);
        estrellano22.setLocation(458,316);
        star2.setLocation(130,203);
        star3.setLocation(284,279);
        star.setLocation(158,306);
        star2.setLocation(135,199);
        EstrellaSi estrellaSi6 = new EstrellaSi();
        addObject(estrellaSi6,135,199);
        star.setLocation(158,314);
        EstrellaSi estrellaSi7 = new EstrellaSi();
        addObject(estrellaSi7,158,314);
        star3.setLocation(280,268);
        EstrellaSi estrellaSi8 = new EstrellaSi();
        addObject(estrellaSi8,280,268);
        star4.setLocation(239,79);
        EstrellaSi estrellaSi9 = new EstrellaSi();
        addObject(estrellaSi9,239,79);
        star5.setLocation(375,122);
        EstrellaSi estrellaSi10 = new EstrellaSi();
        addObject(estrellaSi10,375,122);
        star4.setLocation(238,76);
        star3.setLocation(286,267);
        star3.setLocation(292,272);
        estrellaSi8.setLocation(288,277);
        star3.setLocation(294,266);
        star3.setLocation(288,263);
    }
}