package Task5_03;

public class ConvertKelvin implements ConverterTemperature{
    @Override
    public void convert(int celsius) {
        System.out.println("Convert to Kelvin: "+ (celsius+273));
    }
}
