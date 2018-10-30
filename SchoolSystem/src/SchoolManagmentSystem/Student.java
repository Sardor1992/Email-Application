package SchoolManagmentSystem;

/**
 * Created by Sardor on 28.10.2018.
 */
public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    public Student(int id, String name, int grade) {
        feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
  }

    public void setGrade( int grade){
        this.grade = grade;
    }

    // Fees gets update
    public void payFees( int fees){
        feesPaid +=fees;
        School.updateTotalMoneyMade(feesPaid);
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    }


