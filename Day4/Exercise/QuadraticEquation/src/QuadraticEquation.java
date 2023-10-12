package src;

public class QuadraticEquation {
    double a,b,c;


    public QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String SolveEquation(){
        
        if (this.a == 0){
            return SolveFirstDegreeEquation();
        }else{
            return SolveQuadraticEquation();
        }
    }

    private String SolveQuadraticEquation() {
        double delta = getDelta();
        if (delta < 0){
            return "Phuong trinh vo nghiem";
        } else if (delta == 0) {
            return "Phuong trinh co nghiem kep x1=x2= " + -b / (2 * a);
        }
        return "Phuong trinh co 2 nghiem x1 = " + (-b + Math.sqrt(delta)) / (2 * a) + "\n"
                + "x2 = " + (-b - Math.sqrt(delta)) / (2 * a);
    }

    private String SolveFirstDegreeEquation() {
        if (this.b == 0){
            if (this.c == 0){
                return "Phuong trinh vo so nghiem";
            }else{
                return "Phuong trinh vo nghiem";
            }
        }else{
            return "Phuong trinh co nghiem x = " + -c/b;
        }
    }

    private double getDelta() {
        return b * b - 4 * a * c;
    }
}
