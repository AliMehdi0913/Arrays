import java.util.ArrayList;
class MarksList {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(75);     marks.add(40);      marks.add(85);        marks.add(30);        marks.add(60);
        System.out.println("All Marks: " + marks);
        int sum = 0, count = 0;
        for (int mark : marks) {
            if (mark >= 50) {
                sum += mark;
                count++;       }        }
        double average = count > 0 ? (double) sum / count : 0;

        System.out.println("Average of students scoring 50+ marks: " + average);    }}
