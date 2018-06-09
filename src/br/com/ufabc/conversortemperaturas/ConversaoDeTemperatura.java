package br.com.ufabc.conversortemperaturas;

import java.text.DecimalFormat;

public class ConversaoDeTemperatura {

    public static int CelsiusToFahrenheit(int celsius){

        return ((int) ((9.0/5.0) * celsius) + 32);
    }

    public static double CelsiusToKelvin(int celsius){

        return celsius + 273.15;
    }

    public static int FahrenheitToCelsius(int f){

        return (int) Math.ceil((5.0/9.0) * (f - 32));
    }

    public static int KelvinToCelsius(double k){

        return (int) Math.ceil(k - 273.15);
    }

    public static String FahrenheitToKelvin(int f){

        DecimalFormat df = new DecimalFormat("#.00");
        return df.format((5.0/9.0) * (f + 459.67)).replace(',','.');
    }

    public static double KelvinToFarenheit( double k){

        return Math.ceil((9.0/5.0) * k - 459.67);
    }
}
