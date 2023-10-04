package Task5_03;

public class ConvertFahrenheit implements ConverterTemperature{
    @Override
    public void convert(int celsius) {
        double fahr=(double) celsius*9/5+32;
        System.out.println("Convert to Fahrenheit: "+fahr);
    }
}
