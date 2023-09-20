/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

/**
 *
 * @author mlima
 */
public class Personagens_Sombra {
    
     private String obsessores;
    private int dano1 = 15;
     private int dano2 = 13;
      private int dano3 = 10;
       private int defesa1 = -5 ;
        private int defesa2 = -8;
        private int hab1 = 20;
         private int hab2= 20;
         private int vida = 100;
         private boolean vivo;
    


public  Personagens_Sombra(){

}

public Personagens_Sombra (String obsessores){
   this.obsessores = obsessores;
   this.vivo = true;
}

    /**
     * @return the obsessores
     */
    public String getObsessores() {
        return obsessores;
    }

    /**
     * @param obsessores the obsessores to set
     */
    public void setObsessores(String obsessores) {
        this.obsessores = obsessores;
    }

    /**
     * @return the dano1
     */
    public int getDano1() {
        return dano1;
    }

    /**
     * @param dano1 the dano1 to set
     */
    public void setDano1(int dano1) {
        this.dano1 = dano1;
    }

    /**
     * @return the dano2
     */
    public int getDano2() {
        return dano2;
    }

    /**
     * @param dano2 the dano2 to set
     */
    public void setDano2(int dano2) {
        this.dano2 = dano2;
    }

    /**
     * @return the dano3
     */
    public int getDano3() {
        return dano3;
    }

    /**
     * @param dano3 the dano3 to set
     */
    public void setDano3(int dano3) {
        this.dano3 = dano3;
    }

    /**
     * @return the defesa1
     */
    public int getDefesa1() {
        return defesa1;
    }

    /**
     * @param defesa1 the defesa1 to set
     */
    public void setDefesa1(int defesa1) {
        this.defesa1 = defesa1;
    }

    /**
     * @return the defesa2
     */
    public int getDefesa2() {
        return defesa2;
    }

    /**
     * @param defesa2 the defesa2 to set
     */
    public void setDefesa2(int defesa2) {
        this.defesa2 = defesa2;
    }

    /**
     * @return the hab1
     */
    public int getHab1() {
        return hab1;
    }

    /**
     * @param hab1 the hab1 to set
     */
    public void setHab1(int hab1) {
        this.hab1 = hab1;
    }

    /**
     * @return the hab2
     */
    public int getHab2() {
        return hab2;
    }

    /**
     * @param hab2 the hab2 to set
     */
    public void setHab2(int hab2) {
        this.hab2 = hab2;
    }

    /**
     * @return the vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.vida = vida;
    }
    public boolean isVivo(){
        return vivo;
    }

public void Atacar (){
    
}
public void Defender(){
    
}
public void Correr (){
    
}
public void Andar (){
    
}
public void Conversar(){
    
}
public void Ataque_Sombra(){
    
}


    
}

