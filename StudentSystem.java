public class StudentSystem {

    private String name;
    private int scores[] = new int[3];
    private double averageScore;

    public String getName() {
        return name;
    }
    public int[] getScores() {
        return scores;
    }
    public double getAverageScore() {
        return averageScore;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setScores(int[] scores) {
        this.scores = scores;
    }
    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }


    public StudentSystem(String Name, int Math, int English, int Science){

        this.name = Name;
        this.scores[0] = Math;
        this.scores[1] = English;
        this.scores[2] = Science;
        this.averageScore = calculateAverage();
    }

public double calculateAverage(){

        double avgScores = 0;
        for(int i=0; i<scores.length;i++){

            avgScores = avgScores + scores[i];

        }

        averageScore = avgScores / 3;

    return(averageScore);
}

public void assignGrade(){

        String grade = "";

        if(averageScore>=90){
            grade = "A";
        }

        if (averageScore>=80 && averageScore <90){
            grade = "B";
        }

        if (averageScore>=70 && averageScore <80){
            grade = "C";
        }

        if (averageScore>=60 && averageScore <70){
            grade = "D";
        }

        if (averageScore <60){
            grade = "F";
        }
        
        System.out.println(grade);
}

}
