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

    // Formatea la lista de hobbies en un String legible
    public String formatHobbies() {
        StringBuilder hobbiesFormatted = new StringBuilder("Hobbies:\n");
        for (String hobby : hobbies) { // Itera sobre cada hobby
            hobbiesFormatted.append("- ").append(hobby).append("\n");
        }
        return hobbiesFormatted.toString(); // Devuelve el resultado
    }

    // Formatea la lista de comidas favoritas en un String legible
    public String formatFoods() {
        StringBuilder foodsFormatted = new StringBuilder("Comidas favoritas:\n");
        for (String food : foods) { // Itera sobre cada comida
            foodsFormatted.append("- ").append(food).append("\n");
        }
        return foodsFormatted.toString(); // Devuelve el resultado
    }

    // Selecciona aleatoriamente uno de los datos curiosos
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

        Scanner scanner = new Scanner(System.in); // Escáner para leer la entrada del usuario
        int option; // Variable para almacenar la opción seleccionada por el usuario

        // Ciclo para mostrar el menú interactivo
        do {
            // Mostrar el menú
            System.out.println("Menu About Me [" + perfil.getName() + "]");
            System.out.println("[1] Story");
            System.out.println("[2] Favorites");
            System.out.println("[3] Fun Fact");
            System.out.println("[4] Salir");
            System.out.print("Selecciona una opción: ");

            // Validar entrada del usuario (manejo de errores)
            while (!scanner.hasNextInt()) { // Si la entrada no es un número entero
                System.out.println("Opción no válida. Intenta de nuevo."); // Mensaje de error
                scanner.next(); // Descarta la entrada inválida
            }

            option = scanner.nextInt(); // Lee la opción seleccionada

            // Estructura de control para manejar las opciones
            switch (option) {
                case 1: // Mostrar la historia
                    System.out.println("\nStory:");
                    System.out.println(perfil.getStory());
                    break;
                case 2: // Mostrar hobbies y comidas favoritas
                    System.out.println("\nFavorites:");
                    System.out.println(perfil.formatHobbies());
                    System.out.println(perfil.formatFoods());
                    break;
                case 3: // Mostrar un dato curioso aleatorio
                    System.out.println("\nFun Fact:");
                    System.out.println(perfil.getRandomFunFact());
                    break;
                case 4: // Salir del programa
                    System.out.println("¡Hasta pronto!");
                    break;
                default: // Manejo de opciones inválidas
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
            System.out.println(); // Salto de línea para separar las opciones
        } while (option != 4); // El ciclo se repite mientras el usuario no elija salir

        scanner.close(); // Cierra el Scanner para liberar recursos
    }
}
