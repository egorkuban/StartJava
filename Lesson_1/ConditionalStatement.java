public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 27;
        if (age > 20) {
            System.out.println("Если ваш возраст больше 20 лет,то у вас 2-ой паспорт гражданина РФ");
        }
        boolean male;
        male = true;
        if (male == true) {
            System.out.println("Если у вас мужской пол - Вы мужчина");
        }
        boolean female;
        female = true;
        if (female != false) {
            System.out.println("Если у вас не мужской пол - Вы девушка");
        }
        double height = 1.83 ;
        if (height < 1.80) {
            System.out.println("Ваш рост ниже 1 метра 80 сантиметров");
        }
        else {
            System.out.println("Ваш рост выше 1 метра 80 сантиметров");
        }
        char name = 'E';
        if (name =='M') {
            System.out.println ("возможно вы Микола");
        }
        else if (name == 'I'){
            System.out.println ("Возможно вы тот самый Ииииииииигооооооорь xD");
        }
        else {
            System.out.println("Меня зовут Егор, мое имя не начинается на М и И");
        }
    }
}