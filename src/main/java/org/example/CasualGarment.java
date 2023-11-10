package org.example;

public class CasualGarment implements Garment{
    /**
     * @return new Casual shoes
     */
    @Override
    public Shoes newShoes() {
        return new CasualShoe();
    }

    /**
     * @return new Casual Top
     */
    @Override
    public Tops newTop() {
        return new CasualTop();
    }

    /**
     * @return new Casual Bottom
     */
    @Override
    public Bottom newBottom() {
        return new CasualBottom();
    }
}
