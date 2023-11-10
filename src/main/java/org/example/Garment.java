package org.example;

/**
 * Interface for Garments which creates new objects of top, shoes and bottom
 */
public interface Garment {
    /**
     *
     * @return new shoes obj
     */
    Shoes newShoes();

    /**
     *
     * @return new Top object
     */
    Tops newTop();

    /**
     *
     * @return new Bottom object
     */
    Bottom newBottom();
}
