public class TestScores {
    public char getLetterGrade(int testScores)
    {
        char letterGrade;
        if (testScores>89) {
            letterGrade = 'A';
        } else if (testScores>79) {
            letterGrade = 'B';
        } else if (testScores>69) {
            letterGrade = 'C';
        } else if (testScores>59) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        return letterGrade;
    }
}
