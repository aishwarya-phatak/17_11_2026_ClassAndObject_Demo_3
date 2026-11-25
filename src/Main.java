void main(){
    Student s1 = new Student();
    Student s2 = new Student(875,
            "Siddhesh",
            45,
            "Core Java",
            "Pune");

    IO.println("----------------");
    IO.println(s1);
    IO.println(s2);
    IO.println("----------------");
    s1.display();
    s2.display();
    IO.println("----------------");
    int hashCodes1 = s1.hashCode();
    int hashCodes2 = s2.hashCode();
    IO.println("hash code for s1 : "+ hashCodes1 +
            "\nhash code for s2 : " + hashCodes2);
}