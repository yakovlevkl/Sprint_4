class Account {
    private final String name;

    Account(String name) {
        this.name = name;
    }

    boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка
             соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
             - в строке не меньше 3 и не больше 19 символов,
             - в строке есть только один пробел,
             - пробел стоит не в начале и не в конце строки.
         */

        if (this.name == null) { return false;}
        return name.matches("(?=.{3,18}$)[a-zA-Zа-яА-Я]+\\s[a-zA-Zа-яА-Я]+");
    }
}
