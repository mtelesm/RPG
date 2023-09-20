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
public class Personagens {
    
    private String nomes;
   
    private int ataque1 = 15;
     private int ataque2 = 13;
      private int ataque3 = 10;
       private int defesa1 = -5 ;
        private int defesa2 = -8;
        private int hab1 = 20;
         private int hab2= 20;
         private int vida = 100;
         private boolean vivo;
       
    
public Personagens(){
    
}

public Personagens (String nomes ) {
    this.nomes = nomes;
 
    this.vivo = true;
}

public void Atacar (Personagens alvo){
    if (!vivo) {
            System.out.println("Está morto e não pode atacar.");
            return;
        }
    
    int dano = ataque1 - alvo.defesa1;
    if (dano > 0){
        alvo.vida -= dano;
        System.out.Println( nomes + "ataca" + alvo.obsessores() + "causando"+ dano+ "de dano");}
    else {
        System.out.Println( nomes+ "ataca" + alvo.obsessores() + "não causou dano");
    
    }
        
    }
            
        
    

public void Defender(){
    
}
public void Correr (){
    
}
public void Andar (){
    
}
public void Conversar(){
    
}
public void Ataque_Especial(){
    
}

    /**
     * @return the nome
     */
    public String getNomes() {
        return nomes;
    }

    /**
     * @param nomes the nome to set
     */
    public void setNomes(String nomes) {
        this.nomes = nomes;
    }
     

    /**
     * @return the ataque1
     */
    public int getAtaque1() {
        return ataque1;
    }

    /**
     * @param ataque1 the ataque1 to set
     */
    public void setAtaque1(int ataque1) {
        this.ataque1 = ataque1;
    }

    /**
     * @return the ataque2
     */
    public int getAtaque2() {
        return ataque2;
    }

    /**
     * @param ataque2 the ataque2 to set
     */
    public void setAtaque2(int ataque2) {
        this.ataque2 = ataque2;
    }

    /**
     * @return the ataque3
     */
    public int getAtaque3() {
        return ataque3;
    }

    /**
     * @param ataque3 the ataque3 to set
     */
    public void setAtaque3(int ataque3) {
        this.ataque3 = ataque3;
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
    
   public int getVida(){
       return vida;
   }
   public void setVida (int vida){
       this.vida = vida;
   }
     public boolean isVivo(){
        return vivo;
    }
   
   










}
