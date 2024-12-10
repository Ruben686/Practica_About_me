//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class MunozRubenpractica2ej1 {
    //Creamos atributos privados para mantener la integridad de la clase
    private String name;//nombre del perfil
    private String story;//historia del perfil
    private String[] hobbies; // Array de hobbies ya que al contrario que los otros habrá mas de 1
    private String[] foods; //Array comidas
    private String[] funFacts;//Array datos curiosos

    public MunozRubenpractica2ej1(String name, String story, String[] hobbies, String[] foods, String[] funFacts) {
        this.name = name;         // Asigna el nombre al atributo
        this.story = story;       // Asigna la historia al atributo
        this.hobbies = hobbies;   // Asigna los hobbies
        this.foods = foods;       // Asigna las comidas favoritas
        this.funFacts = funFacts; // Asigna los datos curiosos
    }
    // Métodos getter para obtener cada atributo del perfil.
    public String getName() {
        return name;
    }

    public String getStory() {
        return story;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public String[] getFoods() {
        return foods;
    }

    public String[] getFunFacts() {
        return funFacts;
    }

}