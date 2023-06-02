
package com.mycompanynovato.proyectounidad5calculadorapoderosa;

import java.util.Scanner;


public class ProyectoUnidad5CalculadoraPoderosa {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            mostrarMenuPrincipal();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    menuAritmetico(scanner);
                    break;
                case 2:
                    menuConversiones(scanner);
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }

        scanner.close();
    }

    private static void mostrarMenuPrincipal() {
        System.out.println("----- Menú Principal -----");
        System.out.println("1. Aritmético");
        System.out.println("2. Conversiones");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void menuAritmetico(Scanner scanner) {
        int opcion = 0;

        while (opcion != 5) {
            mostrarMenuAritmetico();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    suma(scanner);
                    break;
                case 2:
                    resta(scanner);
                    break;
                case 3:
                    multiplicacion(scanner);
                    break;
                case 4:
                    division(scanner);
                    break;
                case 5:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }

    private static void mostrarMenuAritmetico() {
        System.out.println("----- Menú Aritmético -----");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Regresar al menú principal");
        System.out.print("Seleccione una opción: ");
    }

    private static void suma(Scanner scanner) {
        System.out.print("¿Cuántos números desea sumar? ");
        int cantidadNumeros = scanner.nextInt();
        double[] numeros = new double[cantidadNumeros];

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        double resultado = 0;
        for (double num : numeros) {
            resultado += num;
        }

        System.out.println("La suma de los números es: " + resultado);
    }

    private static void resta(Scanner scanner) {
        System.out.print("¿Cuántos números desea restar? ");
        int cantidadNumeros = scanner.nextInt();
        double[] numeros = new double[cantidadNumeros];

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        double resultado = numeros[0];
        for (int i = 1; i < cantidadNumeros; i++) {
            resultado -= numeros[i];
        }

        System.out.println("La resta de los números es: " + resultado);
    }

    private static void multiplicacion(Scanner scanner) {
        System.out.print("¿Cuántos números desea multiplicar? ");
        int cantidadNumeros = scanner.nextInt();
        double[] numeros = new double[cantidadNumeros];

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        double resultado = 1;
        for (double num : numeros) {
            resultado *= num;
        }

        System.out.println("El producto de los números es: " + resultado);
    }

    private static void division(Scanner scanner) {
        System.out.print("Ingrese el dividendo: ");
        double dividendo = scanner.nextDouble();

        System.out.print("Ingrese el divisor: ");
        double divisor = scanner.nextDouble();

        if (divisor != 0) {
            double resultado = dividendo / divisor;
            System.out.println("El resultado de la división es: " + resultado);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }
    }

    private static void menuConversiones(Scanner scanner) {
        int opcion = 0;

        while (opcion != 4) {
            mostrarMenuConversiones();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    conversionLongitud(scanner);
                    break;
                case 2:
                    conversionMasa(scanner);
                    break;
                case 3:
                    conversionTemperatura(scanner);
                    break;
                case 4:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }

    private static void mostrarMenuConversiones() {
        System.out.println("----- Menú Conversiones -----");
        System.out.println("1. Longitud");
        System.out.println("2. Masa");
        System.out.println("3. Temperaturas");
        System.out.println("4. Regresar al menú principal");
        System.out.print("Seleccione una opción: ");
    }

    private static void conversionLongitud(Scanner scanner) {
        int opcion = 0;

        while (opcion != 6) {
            mostrarMenuConversionLongitud();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    kilometrosACentimetros(scanner);
                    break;
                case 2:
                    kilometrosAMillas(scanner);
                    break;
                case 3:
                    kilometrosAPies(scanner);
                    break;
                case 4:
                    kilometrosAPulgadas(scanner);
                    break;
                case 5:
                    System.out.println("Regresando al menú de conversiones...");
                    break;
                case 6:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }

    private static void mostrarMenuConversionLongitud() {
        System.out.println("----- Menú de Conversión de Longitud -----");
        System.out.println("1. Kilómetros a Centímetros");
        System.out.println("2. Kilómetros a Millas");
        System.out.println("3. Kilómetros a Pies");
        System.out.println("4. Kilómetros a Pulgadas");
        System.out.println("5. Regresar al menú de conversiones");
        System.out.println("6. Regresar al menú principal");
        System.out.print("Seleccione una opción: ");
    }

    private static void kilometrosACentimetros(Scanner scanner) {
        System.out.print("Ingrese la cantidad de kilómetros: ");
        double kilometros = scanner.nextDouble();

        double centimetros = kilometros * 100000;
        System.out.println(kilometros + " kilómetros es igual a " + centimetros + " centímetros.");
    }

    private static void kilometrosAMillas(Scanner scanner) {
        System.out.print("Ingrese la cantidad de kilómetros: ");
        double kilometros = scanner.nextDouble();

        double millas = kilometros * 0.621371;
        System.out.println(kilometros + " kilómetros es igual a " + millas + " millas.");
    }

    private static void kilometrosAPies(Scanner scanner) {
        System.out.print("Ingrese la cantidad de kilómetros: ");
        double kilometros = scanner.nextDouble();

        double pies = kilometros * 3280.84;
        System.out.println(kilometros + " kilómetros es igual a " + pies + " pies.");
    }

    private static void kilometrosAPulgadas(Scanner scanner) {
        System.out.print("Ingrese la cantidad de kilómetros: ");
        double kilometros = scanner.nextDouble();

        double pulgadas = kilometros * 39370.1;
        System.out.println(kilometros + " kilómetros es igual a " + pulgadas + " pulgadas.");
    }

    private static void conversionMasa(Scanner scanner) {
        int opcion = 0;

        while (opcion != 5) {
            mostrarMenuConversionMasa();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    libraAKilogramos(scanner);
                    break;
                case 2:
                    libraAOnza(scanner);
                    break;
                case 3:
                    libraAGramos(scanner);
                    break;
                case 4:
                    System.out.println("Regresando al menú de conversiones...");
                    break;
                case 5:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }

    private static void mostrarMenuConversionMasa() {
        System.out.println("----- Menú de Conversión de Masa -----");
        System.out.println("1. Libra a Kilogramos");
        System.out.println("2. Libra a Onza");
        System.out.println("3. Libra a Gramos");
        System.out.println("4. Regresar al menú de conversiones");
        System.out.println("5. Regresar al menú principal");
        System.out.print("Seleccione una opción: ");
    }

    private static void libraAKilogramos(Scanner scanner) {
        System.out.print("Ingrese la cantidad de libras: ");
        double libras = scanner.nextDouble();

        double kilogramos = libras * 0.453592;
        System.out.println(libras + " libras es igual a " + kilogramos + " kilogramos.");
    }

    private static void libraAOnza(Scanner scanner) {
        System.out.print("Ingrese la cantidad de libras: ");
        double libras = scanner.nextDouble();

        double onzas = libras * 16;
        System.out.println(libras + " libras es igual a " + onzas + " onzas.");
    }

    private static void libraAGramos(Scanner scanner) {
        System.out.print("Ingrese la cantidad de libras: ");
        double libras = scanner.nextDouble();

        double gramos = libras * 453.592;
        System.out.println(libras + " libras es igual a " + gramos + " gramos.");
    }

    private static void conversionTemperatura(Scanner scanner) {
        int opcion = 0;

        while (opcion != 4) {
            mostrarMenuConversionTemperatura();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    celsiusAFahrenheit(scanner);
                    break;
                case 2:
                    celsiusAKelvin(scanner);
                    break;
                case 3:
                    System.out.println("Regresando al menú de conversiones...");
                    break;
                case 4:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }

    private static void mostrarMenuConversionTemperatura() {
        System.out.println("----- Menú de Conversión de Temperaturas -----");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Celsius a Kelvin");
        System.out.println("3. Regresar al menú de conversiones");
        System.out.println("4. Regresar al menú principal");
        System.out.print("Seleccione una opción: ");
    }

    private static void celsiusAFahrenheit(Scanner scanner) {
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " grados Celsius es igual a " + fahrenheit + " grados Fahrenheit.");
    }

    private static void celsiusAKelvin(Scanner scanner) {
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        double kelvin = celsius + 273.15;
        System.out.println(celsius + " grados Celsius es igual a " + kelvin + " grados Kelvin.");
    }
}

    

