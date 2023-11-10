package org.example;

public class ProfessionalGarment implements Garment{
    /**
     * @return new Professional Shoes
     */
    @Override
    public Shoes newShoes() {
        return new ProfessionalShoes();
    }

    /**
     * @return new Professional Top
     */
    @Override
    public Tops newTop() {
        return new ProfessionalTops();
    }

    /**
     * @return new Professional Bottom
     */
    @Override
    public Bottom newBottom() {
        return new ProfessionalBottom();
    }
}
