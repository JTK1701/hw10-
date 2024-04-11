public class Main {
    public static void main(String[] args) {
        System.out.println("1 задача");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        System.out.println(" ");
        System.out.println("2 задача");
        fullName = fullName.toUpperCase();
        System.out.println("Дфнные ФИО сотрудника для заполнения отчета - " + fullName);

        System.out.println(" ");
        System.out.println("3 задача");
        String fullName2 = "Семёнов Семён Семёнович";
        fullName2 = fullName2.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullName2);
    }
}

