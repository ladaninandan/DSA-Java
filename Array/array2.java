package Array;

class student {

    public int RollNo;
    public String Name;

    student(int RollNo, String Name) {
        this.RollNo = RollNo;
        this.Name = Name;
    }
;

}

class Gpg {

    public static void main(String[] args) {
        student[] arr;
        arr = new student[5];
        arr[0] = new student(1, "nandan");
        arr[1] = new student(2, "krish");
        arr[2] = new student(3, "arpit");
        arr[3] = new student(4, "yesh");
        arr[4] = new student(5, "Raj");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("element" + i + ":" + arr[i].RollNo + ':' + arr[i].Name);
        }
    }
}
