import java.util.LinkedHashSet;
class Demo033 {
    public static void main(String[] args) {
        
        LinkedHashSet<String> semesterMarks = new LinkedHashSet<>();

        
        semesterMarks.add("P&S: 85");
        semesterMarks.add("DM: 90");
        semesterMarks.add("COA: 88");
        semesterMarks.add("ADS: 95");
        semesterMarks.add("EVS: 80");
        semesterMarks.add("OS: 89");
        semesterMarks.add("FAM: 92");
        semesterMarks.add("TP: 98");
        semesterMarks.remove("TP: 98");
        semesterMarks.remove("COA: 88");
        

        
        System.out.println("Semester Marks with Subject Names:");
        for (String entry : semesterMarks) {
            System.out.println(entry);
        }
    }
}