/*
Да се изгради йерархия от класове представящи различни марки и видове автомобли. 
Да се дефинира интерфейс с основните действия които са нужни за да управляваме превозно средство. 
Да се дефинира клас шофьор който може да управлява превозни средства от различен тип 
(автомобил, камион и т.н.)
*/
package NeedForSpeed;

public class Main {
    public static void main(String[] args) {
       Vehicle trabant = new Car("Trabant");
       Vehicle ferrari = new Car("Ferrari");
       Vehicle man = new Truck("MAN");
       Driver pesho = new Driver("Pesho Turboto",trabant);
       Driver ivan = new Driver("Ïvan Gazara", ferrari);
       Driver tconka = new Driver("Цонка Барабонка", man);
       pesho.drive();
       ivan.drive();
       tconka.drive();
    }
}
