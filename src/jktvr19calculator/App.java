/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19calculator;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    private String repeat = "y";
    /*public static void main(String[] args) {
    }*/
        
    public void  run() {
        System.out.println("-------Calculator----------");
            do{
                System.out.println("insert first number: ");
                Scanner scanner = new Scanner(System.in);/*считываем с вхлдящего потока*/
                double number1 = scanner.nextDouble();
                System.out.println("insert second number: ");
                /*Scanner scanner = new Scanner(System.in);/*считываем с вхлдящего потока*/
                double number2 = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Введите операцию +.-.*./");



                String znak = scanner.nextLine();

                System.out.println("Result: ");
                switch (znak) {
                case "+":
                    System.out.println(number1+number2);
                    break;
                case "-":
                    System.out.println(number1-number2);
                    break;
                case "*":
                    System.out.println(number1*number2);
                    break;
                case "/":
                    if(number2 == 0) {
                        System.out.println("на ноль делить нельзя!");
                    }
                    System.out.println(number1/number2);
                    break;
                default:
                    System.out.println("---выберите перечисленную операцию---");
                    break;
            }
                        
       
                System.out.println("для продолжения нажмите\"y\", для выхода любую другую");
                        repeat = scanner.nextLine();
       
            }while(repeat.equals("y"));
                    /*System.out.println(number1 + number2);*/
                    System.out.println("---finish---");
                        }

                }
    
