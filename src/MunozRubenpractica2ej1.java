import java.util.Scanner;

public class MunozRubenpractica2ej1 {
    // Atributos privados para mantener la integridad de la clase
    private String name; // Nombre del perfil
    private String story; // Historia del perfil
    private String[] hobbies; // Array de hobbies
    private String[] foods; // Array de comidas
    private String[] funFacts; // Array de datos curiosos

    // Constructor para inicializar los atributos del perfil
    public MunozRubenpractica2ej1(String name, String story, String[] hobbies, String[] foods, String[] funFacts) {
        this.name = name;
        this.story = story;
        this.hobbies = hobbies;
        this.foods = foods;
        this.funFacts = funFacts;
    }

    // Métodos getter para obtener cada atributo del perfil
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

    // Formateamos la lista de hobbies en un String legible
    public String formatHobbies() {
        StringBuilder hobbiesFormatted = new StringBuilder("Hobbies:\n");
        for (String hobby : hobbies) { // Itera sobre cada hobby
            hobbiesFormatted.append("- ").append(hobby).append("\n");
        }
        return hobbiesFormatted.toString(); // Devuelve el resultado
    }

    // Formateamos la lista de comidas favoritas en un String legible
    public String formatFoods() {
        StringBuilder foodsFormatted = new StringBuilder("Comidas favoritas:\n");
        for (String food : foods) { // Itera sobre cada comida
            foodsFormatted.append("- ").append(food).append("\n");
        }
        return foodsFormatted.toString(); // Devuelve el resultado
    }

    // Añadimos una selección aleatoria para uno de los datos curiosos
    public String getRandomFunFact() {
        int index = (int) (Math.random() * funFacts.length); // Genera un índice aleatorio
        return funFacts[index]; // Devuelve el dato curioso en el índice generado
    }

    public static void main(String[] args) {
        // Datos de ejemplo para el perfil
        String[] hobbies = {"🎨 Pintar", "📖 Leer", "🎮 Jugar videojuegos"};
        String[] foods = {"🍕 Pizza", "🍣 Sushi", "🍫 Chocolate"};
        String[] funFacts = {"Soy ambidiestro.", "He viajado a 10 países.", "Tengo un gato llamado Luna."};

        // Crear una instancia de la clase con los datos de ejemplo
        MunozRubenpractica2ej1 perfil = new MunozRubenpractica2ej1(
                "Juan Pérez",
                "Soy un apasionado por la tecnología y el arte. Me encanta explorar nuevos mundos a través de los libros y los videojuegos.",
                hobbies, foods, funFacts
        );

    }
}