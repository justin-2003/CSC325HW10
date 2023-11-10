package org.example;

/**
 * Implements garment which return the party Garments
 */
public class PartyGarment implements Garment{
    /**
     * @return new Party Shoes
     */
    @Override
    public Shoes newShoes() {
        return new PartyShoes();
    }

    /**
     * @return new Party Top
     */
    @Override
    public Tops newTop() {
        return new PartyTop();
    }

    /**
     * @return new Party Bottoms
     */
    @Override
    public Bottom newBottom() {
        return new PartyBottom();
    }
}
