import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Machine machine = new Machine(1000, 1000,1000);
        System.out.println("Список команд: "
                + "\ncheck - проверить заполненность резервуаров"
                + "\nwater N - добавить N мл. воды"
                + "\nmilk N - добавить N мл. молока"
                + "\ncoffee N - добавить N мл. кофе"
                + "\nlatte N - приготовить N мл. латте"
                + "\nristretto N - приготовить N мл. ристретто"
                + "\ncappuccino N - приготовить N мл. капучино"
                + "\nlungo N - приготовить N мл. лунго"
                + "\nespresso N - приготовить N мл. эспрессо"
                + "\nturn off - выключить кофемашину");

        Scanner br = new Scanner(System.in);
        String str;

        while (!"turn off".equals(str = br.nextLine())) {
            String[] words = str.split(" ");
            if (words[0].equals("check")){
                machine.check();
            } else if(words[0].equals("water")){
                machine.addWater(Integer.parseInt(words[1]));
            } else if(words[0].equals("milk")){
                machine.addMilk(Integer.parseInt(words[1]));
            } else if(words[0].equals("coffee")){
                machine.addCoffee(Integer.parseInt(words[1]));
            } else if(words[0].equals("latte")){
                machine.latte(Integer.parseInt(words[1]));
            } else if(words[0].equals("ristretto")){
                machine.ristretto(Integer.parseInt(words[1]));
            } else if(words[0].equals("cappuccino")){
                machine.cappuccino(Integer.parseInt(words[1]));
            } else if(words[0].equals("lungo")){
                machine.lungo(Integer.parseInt(words[1]));
            } else if(words[0].equals("espresso")){
                machine.espresso(Integer.parseInt(words[1]));
            } else System.out.println("Неизвестная команда");
        }
    }
}
