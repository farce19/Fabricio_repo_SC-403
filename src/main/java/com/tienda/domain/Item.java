
package com.tienda.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode (callSuper = false)
public class Item extends Producto {
    
    private int cantidad; // Almacenar la cantidad a comprar
    
    public Item(){
        
    }
        
        public Item(Producto producto){
            super.setIdProducto(producto.getIdProducto());
            super.setCategoria(producto.getCategoria());
            super.setDescripcion(producto.getDescripcion());
            super.setPrecio(producto.getPrecio());
            super.setExistencias(producto.getExistencias());
            super.setActivo(producto.isActivo());
            super.setRutaImagen(producto.getRutaImagen());
        
    }
}