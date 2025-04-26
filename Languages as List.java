import java.util.ArrayList;
class ProgrammingLanguages {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");
        System.out.println("Original List: " + languages);
        languages.remove(2);
        System.out.println("After removing index 2: " + languages);
        languages.remove(languages.size() - 1);
        System.out.println("After removing last element: " + languages);  }}
