package org.example;

/**
 *Implements the Builder objects which will show the garments in the right order
 */
public class Main {
    public static void main(String[] args) {
        Garment casualBuilder = new CasualGarment();
        Garment partyBuilder = new PartyGarment();
        Garment professionalBuilder = new ProfessionalGarment();

        //Prints the casual Garments
        Tops casualTop = casualBuilder.newTop();
        Bottom casualBottom = casualBuilder.newBottom();
        Shoes casualShoes = casualBuilder.newShoes();

        System.out.println("Casual Build:\n" + casualTop.getInfo() + "\n" + casualBottom.getInfo()+ "\n" +casualShoes.getInfo()+ "\n");

        //Prints the Party Garments
        Tops partyTop = partyBuilder.newTop();
        Bottom partyBottom = partyBuilder.newBottom();
        Shoes partyShoes = partyBuilder.newShoes();

        System.out.println("Party Build:\n" + partyTop.getInfo() + "\n" + partyBottom.getInfo()+ "\n" +partyShoes.getInfo() + "\n");

        //Prints the professional Garments
        Tops professionalTop = professionalBuilder.newTop();
        Bottom professionalBottom = professionalBuilder.newBottom();
        Shoes professionalShoes = professionalBuilder.newShoes();

        System.out.println("Professional Build:\n" + professionalTop.getInfo() + "\n" + professionalBottom.getInfo()+ "\n" +professionalShoes.getInfo());
    }
}