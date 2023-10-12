package src;

public class Student {
    String name;
    int age;
    double scoreMath,scorePhysics,scoreChemical;
    public  Student(){

    }

    public  Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getInfo(){
        return "Hoc sinh: " + this.name + " tuoi: " + this.age;
    }

    public String getRank(){
        String message;
        double averageScore = getAverageScore();
        if (averageScore > 8){
            message = "Giỏi";
        }else if (averageScore >= 6.5){
            message = "Khá";
        }else if (averageScore > 3.5 ){
            message = "Trung bình";
        }else {
            message = "Yếu";
        }
        return message;
    }

    private double getAverageScore() {
        return (this.scoreMath + this.scorePhysics + this.scoreChemical) / 3;
    }
}
