package ch04;

public class Student {

    public int studentID;
    public String studentName;
    public String address;

    public void showStudentInfo() {
        System.out.println(studentID + "학번의 이름은 " +
                studentName + " 이고 , 주소는 " + address);
    }

    /* 이름을 반환할 것 무엇을 반환 ? 'studentName'라는 변수를 반환 */
    public String getStudentName() {
        return studentName;
    }

    /* 이름을 바꿀거라면 ? 반환값은 없고 setting(set) 어떤이름으로 바꿀 것인지 매개변수가 들어옴 */
    public void setStudentName(String name){
        studentName = name;
    }
}
