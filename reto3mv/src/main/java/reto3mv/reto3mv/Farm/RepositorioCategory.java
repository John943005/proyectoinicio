/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto3mv.reto3mv.Farm;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author john
 */@Repository
public class RepositorioCategory {
    @Autowired
    private InterfaceCategory crud;
    public List<Category > getAll(){
        return (List<Category >) crud.findAll();
    }
    public Optional<Category > getCategory(int id){
        return crud.findById(id);
    }

    public Category  save(Category  Category ){
        return crud.save(Category );
    }
    public void delete(Category  Category ){
       crud.delete(Category );
    }
}
