package company.chapter4.pack.c4q7.my.school;


public class Classroom {
    private int roomNumber; // приватный модификатор доступа предостовляет доступ к переменной только внутри
    // класса в котором она объявлена
    protected String teacherName; // тут модификатор доступа предостовляет доступ внутри своего класса, своего пакета
    // и классов наследников
    static int globalKey = 54321; //тут модификатор доступа по дефолту и поэтому к globalKey можно обращаться только
    // внутри своего класса и своего пакета
    public int floor = 3;
         Classroom(int r, String t) {
            roomNumber = r;
            teacherName = t; }
}

