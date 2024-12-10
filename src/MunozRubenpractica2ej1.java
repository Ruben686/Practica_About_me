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
    // Métodos para mostrar información formateada
    //Formatea la lista de hobbies en un String legible
    public String formatHobbies() {
        StringBuilder hobbiesFormatted = new StringBuilder("Hobbies:\n");
        for (String hobby : hobbies) { //Itera sobre cada hobby
            hobbiesFormatted.append("- ").append(hobby).append("\n");
        }
        return hobbiesFormatted.toString();//Devuelve el resultado
    }

    public String formatFoods() {
        StringBuilder foodsFormatted = new StringBuilder("Comidas favoritas:\n");
        for (String food : foods) { //Itera sobre cada comida
            foodsFormatted.append("- ").append(food).append("\n");
        }
        return foodsFormatted.toString();//Devuelve el resultado
    }
     public String getRandomFunFact() {
        int index = (int) (Math.random() * funFacts.length); // Genera un índice aleatorio
        return funFacts[index]; // Devuelve el dato curioso en el índice generado
    }
}