public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 27;
        if (age > 20) {
            System.out.println("���� ��� ������� ������ 20 ���,�� � ��� 2-�� ������� ���������� ��");
        }
        boolean male;
        male = true;
        if (male == true) {
            System.out.println("���� � ��� ������� ��� - �� �������");
        }
        boolean female;
        female = true;
        if (female != false) {
            System.out.println("���� � ��� �� ������� ��� - �� �������");
        }
        double height = 1.83 ;
        if (height < 1.80) {
            System.out.println("��� ���� ���� 1 ����� 80 �����������");
        }
        else {
            System.out.println("��� ���� ���� 1 ����� 80 �����������");
        }
        char name = 'E';
        if (name =='M') {
            System.out.println ("�������� �� ������");
        }
        else if (name == 'I'){
            System.out.println ("�������� �� ��� ����� ������������������� xD");
        }
        else {
            System.out.println("���� ����� ����, ��� ��� �� ���������� �� � � �");
        }
    }
}