package Ex5;

public class Main {
    public static void main(String[] args) {
        Safe safe = new Safe(200); //volume of safe
        Staff staff_1 = new Staff(99,15); //volume and value object
        Staff staff_2 = new Staff(60,10); //volume and value object
        Staff staff_3 = new Staff(10,2); //volume and value object
        Staff staff_4 = new Staff(40,6); //volume and value object
        Staff staff_5 = new Staff(20,5); //volume and value object
        safe.staff_mas[0] = staff_1;
        safe.staff_mas[1] = staff_2;
        safe.staff_mas[2] = staff_3;
        safe.staff_mas[3] = staff_4;
        safe.staff_mas[4] = staff_5;
        safe.calculate();
        safe.all_result();
        safe.final_result();
    }
}
