

    public class StudentMarkTracker {

    private static final int GRADE_A_MIN = 90;
    private static final int GRADE_B_MIN = 80;
    private static final int GRADE_C_MIN = 70;
    private static final int GRADE_D_MIN = 60;

    public static void main(String[] args) {

        int[][] studentMarks = {
                {92, 88, 95, 90},
                {74, 68, 81, 70},
                {55, 60, 48, 51},
                {100, 97, 91, 86},
                {42, 38, 55, 40}
        };

        String[] studentNames = {"Nikita", "Nikita.S", "Gustavs", "Anil", "Ignas"};

        System.out.println("Student Mark Tracker");
        System.out.println("--------------------");

        for (int i = 0; i < studentMarks.length; i++) {
            double average = calculateAverage(studentMarks[i]);
            char grade = toLetterGrade(average);
            String comment = describeGrade(grade);

            System.out.println(studentNames[i]
                    + " -> average " + String.format("%.1f", average)
                    + ", grade " + grade + " (" + comment + ")");
        }
    }


    private static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }


    private static char toLetterGrade(double average) {
        if (average >= GRADE_A_MIN) {
            return 'A';
        } else if (average >= GRADE_B_MIN) {
            return 'B';
        } else if (average >= GRADE_C_MIN) {
            return 'C';
        } else if (average >= GRADE_D_MIN) {
            return 'D';
        } else {
            return 'F';
        }
    }


    private static String describeGrade(char grade) {
        return switch (grade) {
            case 'A' -> "excellent";
            case 'B' -> "good";
            case 'C' -> "average";
            case 'D' -> "needs work";
            default -> "failing";
        };
    }
}
