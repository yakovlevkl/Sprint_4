public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка
             соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
             - в строке не меньше 3 и не больше 19 символов,
             - в строке есть только один пробел,
             - пробел стоит не в начале и не в конце строки.
         */
        return !(this.name.isEmpty()
                | this.name.length() < 3
                | this.name.length() > 19
                | this.name.startsWith(" ")
                | this.name.endsWith(" ")
                | !spaceControl());
    }

    public boolean spaceControl() {
        String[] arr = this.name.split(" ");
        return arr.length == 2;
    }
}
