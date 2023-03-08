/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoPractico.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author yulien
 */
@Entity
@Table (name="salas")
public class Sala implements Serializable{
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private long id;
    private String sala;
    
    public long getId(){
        return id;
    }
    public String getSala(){
        return sala;
    }
    public void setId(long id){
        this.id=id;
    }
    public void setSala(String p){
        this.sala=p;

}
}
