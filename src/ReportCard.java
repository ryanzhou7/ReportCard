import java.util.ArrayList;
public class ReportCard {
    private final String TITLE = "Grade Report";
    private ArrayList<Grade> mGrades;

    public ReportCard(ArrayList<Grade> grades) {
        setmGrades(grades);
    }

    public void printGrades() {
        System.out.print(toString());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(TITLE);
        for (Grade currentGrade : getmGrades()) {
            stringBuilder.append(currentGrade.toString());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public ArrayList<Grade> getmGrades() {
        return mGrades;
    }

    public void setmGrades(ArrayList<Grade> mGrades) {
        this.mGrades = mGrades;
    }

    public class Grade {
        private String mClassName;
        private String mScore;

        public Grade(String name, String score) {
            setmClassName(name);
            setmScore(score);
        }

        @Override
        public String toString() {
            return getmClassName() + ": " + getmScore();
        }

        public String getmClassName() {
            return mClassName;
        }

        public void setmClassName(String mClassName) {
            this.mClassName = mClassName;
        }

        public String getmScore() {
            return mScore;
        }

        public void setmScore(String mScore) {
            this.mScore = mScore;
        }

    }
}