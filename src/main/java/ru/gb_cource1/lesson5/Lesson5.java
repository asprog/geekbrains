package ru.gb_cource1.lesson5;

public class Lesson5 {
    private final Employee[] emps = new Employee[5];
    public static void main(String[] args) {
     Lesson5 lesson = new Lesson5();
     lesson.emps[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312311", 30000, 30);
     lesson.emps[1] = new Employee("Petrov Petr", "Engineer", "petrov@mailbox.com", "892312312", 35000, 41);
     lesson.emps[2] = new Employee("Sidorov Ivan", "Engineer", "sidorov@mailbox.com", "892312313", 40000, 45);
     lesson.emps[3] = new Employee("vavilov Pavel", "Engineer", "vavilov@mailbox.com", "892312314", 10000, 20);
     lesson.emps[4] = new Employee("Krasnova Alexey", "Engineer", "krasnova@mailbox.com", "892312315", 33000, 30);

     for(Employee emp : lesson.emps){
       if(emp.getAge() > 40) {
           emp.printInfo();
       }
     }
    }
    /*
* 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
* */
    public static class Employee{
     private String fio;
     private String post;
     private String email;
     private String tel;
     private int    salary;
     private int    age;

     /*
     * 2. Конструктор класса должен заполнять эти поля при создании объекта.
     * */

    public Employee(String fio, String post, String email, String tel, int salary, int age) {
        this.fio   = fio;
        this.post  = post;
        this.email = email;
        this.tel   = tel;
        this.age   = age;
    }
    /*
    * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    * */
    public void printInfo(){
       System.out.println(String.format(
               "fio: %s,post: %s,email: %s,tel: %s,age: %d",
               fio,post,email,tel,age));
    }

        public int getAge() {
            return age;
        }
    }
}
