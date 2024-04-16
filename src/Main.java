public class Main {
    public static void main(String[] args) {
        System.out.println("1 задача");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        //Разделительный комментарий, чтобы избежать пустых строк и сделать Герману приятно))
        System.out.println(" ");
        System.out.println("2 задача");
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName);
        //Второй разделительный комментарий, потому что так не только Герману приятно, но и мне удобно)
        System.out.println(" ");
        System.out.println("3 задача");
        String fullName2 = "Семёнов Семён Семёнович";
        fullName2 = fullName2.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullName2);
    }
}

