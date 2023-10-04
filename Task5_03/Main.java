//Створіть ConverterTemperature з методом convert.
//Реалізуйте для ConverterTemperature класи для конвертації з градусів за Цельсієм в Кельвіни, Фаренгейти.
// У класу має бути метод convert, який робить конвертацію.
//Інстанс ConverterTemperature створити неможливо.
package Task5_03;

public class Main {
    public static void main(String[] args) {
        ConvertKelvin kelvin=new ConvertKelvin();
        kelvin.convert(23);
        ConvertFahrenheit fahrenheit=new ConvertFahrenheit();
        fahrenheit.convert(23);
    }
}
