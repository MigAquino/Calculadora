package com.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class MainController {
    private String number = "0";
    private String number2 = "0";
    private String operation = "";
    private float result;
    private int resultInt;
    private boolean isOnTwo = false;
    @FXML
    private Text Maintext = new Text();
    public void addOne(ActionEvent e){
        if(!isOnTwo) {
            if (number == "0" || number == "0.0") {
                number = "1";
                System.out.println(number);
                Maintext.setText(number);
                System.out.println("1");
            } else {
                number = number + "1";
                System.out.println(number);
                Maintext.setText(number);
                System.out.println("2");
            }
        }else {
            if (number2 == "0") {
                number2 = "1";
                System.out.println(number + operation + number2);
                Maintext.setText(number + operation + number2);
            } else {
                number2 = number2 + "1";
                System.out.println(number + operation + number2);
                Maintext.setText(number + operation + number2);
            }
        }
    }
    public void addTwo(ActionEvent e){
        if(!isOnTwo) {
            if (number == "0") {
                number = "2";
                System.out.println(number);
                Maintext.setText(number);
            } else {
                number = number + "2";
                System.out.println(number);
                Maintext.setText(number);
            }
        }else {
            if (number2 == "0") {
                number2 = "2";
                System.out.println(number + operation + number2);
                Maintext.setText(number + operation + number2);
            } else {
                number2 = number2 + "2";
                System.out.println(number + operation + number2);
                Maintext.setText(number + operation + number2);
            }
        }
    }
    public void addThree(ActionEvent e){
        if(!isOnTwo) {
            if (number == "0") {
                number = "3";
                System.out.println(number);
                Maintext.setText(number);
            } else {
                number = number + "3";
                System.out.println(number);
                Maintext.setText(number);
            }
        }else {
            if (number2 == "0") {
                number2 = "3";
                System.out.println(number + operation + number2);
                Maintext.setText(number + operation + number2);
            } else {
                number2 = number2 + "3";
                System.out.println(number + operation + number2);
                Maintext.setText(number + operation + number2);
            }
        }
    }
    public void addFour(ActionEvent e){
        if(!isOnTwo) {
            if (number == "0") {
                number = "4";
                System.out.println(number);
                Maintext.setText(number);
            } else {
                number = number + "4";
                System.out.println(number);
                Maintext.setText(number);
            }
        }else {
            if (number2 == "0") {
                number2 = "4";
                System.out.println(number + operation + number2);
                Maintext.setText(number + operation + number2);
            } else {
                number2 = number2 + "4";
                System.out.println(number + operation + number2);
                Maintext.setText(number + operation + number2);
            }
        }
    }
    public void addFive(ActionEvent e){
        if(!isOnTwo) {
            if (number == "0") {
                number = "5";
                System.out.println(number);
                Maintext.setText(number);
            } else {
                number = number + "5";
                System.out.println(number);
                Maintext.setText(number);
            }
        }else {
            if (number2 == "0") {
                number2 = "5";
                System.out.println(number + operation + number2);
                Maintext.setText(number + operation + number2);
            } else {
                number2 = number2 + "5";
                System.out.println(number + operation + number2);
                Maintext.setText(number + operation + number2);
            }
        }
    }
    public void addSix(ActionEvent e){
        if(!isOnTwo) {
            if (number == "0") {
                number = "6";
                System.out.println(number);
                Maintext.setText(number);
            } else {
                number = number + "6";
                System.out.println(number);
                Maintext.setText(number);
            }
        }else {
            if (number2 == "0") {
                number2 = "6";
                System.out.println(number + operation + number2);
                Maintext.setText(number + operation + number2);
            } else {
                number2 = number2 + "6";
                System.out.println(number + operation + number2);
                Maintext.setText(number + operation + number2);
            }
        }
    }
    public void addSeven(ActionEvent e){
        if(!isOnTwo) {
            if (number == "0") {
                number = "7";
                System.out.println(number);
                Maintext.setText(number);
            } else {
                number = number + "7";
                System.out.println(number);
                Maintext.setText(number);
            }
        }else {
            if (number2 == "0") {
                number2 = "7";
                System.out.println(number + operation + number2);
                Maintext.setText(number + operation + number2);
            } else {
                number2 = number2 + "7";
                System.out.println(number + operation + number2);
                Maintext.setText(number + operation + number2);
            }
        }
    }
    public void addEight(ActionEvent e){
        if(!isOnTwo) {
            if (number == "0") {
                number = "8";
                System.out.println(number);
                Maintext.setText(number);
            } else {
                number = number + "8";
                System.out.println(number);
                Maintext.setText(number);
            }
        }else {
            if (number2 == "0") {
                number2 = "8";
                System.out.println(number + operation + number2);
                Maintext.setText(number + operation + number2);
            } else {
                number2 = number2 + "8";
                System.out.println(number + operation + number2);
                Maintext.setText(number + operation + number2);
            }
        }
    }
    public void addNine(ActionEvent e){
        if(!isOnTwo) {
            if(number.length() == 1) {
                if (number == "0") {
                    number = "9";
                    System.out.println(number);
                    Maintext.setText(number);
                } else {
                    number = number + "9";
                    System.out.println(number);
                    Maintext.setText(number);
                }
            }else{
                number = number + "9";
                System.out.println(number);
                Maintext.setText(number);
            }
        }else {
            if (number2 == "0") {
                number2 = "9";
                System.out.println(number + operation + number2);
                Maintext.setText(number + operation + number2);
            } else {
                number2 = number2 + "9";
                System.out.println(number + operation + number2);
                Maintext.setText(number + operation + number2);
            }
        }
    }
    public void addZero(ActionEvent e){
        if(!isOnTwo) {
            number = number + "0";
            System.out.println(number);
            Maintext.setText(number);

        }else {
            number2 = number2 + "0";
            System.out.println(number + operation + number2);
            Maintext.setText(number + operation + number2);
        }
    }
    public void addPoint(ActionEvent e){
        if(!isOnTwo) {
            if(!number.contains(".")) {
                if (number == "0") {
                    number = "0.";
                    System.out.println(number);
                    Maintext.setText(number);
                } else {
                    number = number + ".";
                    System.out.println(number);
                    Maintext.setText(number);
                }
            }else{
                System.out.println("Point Overload");
            }
        }else {
            if(!number2.contains(".")) {
                if (number2 == "0") {
                    number2 = "0.";
                    System.out.println(number + operation + number2);
                    Maintext.setText(number + operation + number2);
                } else {
                    number2 = number2 + ".";
                    System.out.println(number + operation + number2);
                    Maintext.setText(number + operation + number2);
                }
            }else{
                System.out.println("Point Overload");
            }
        }
    }
    public void corte(ActionEvent e){
        if(!isOnTwo) {
            if(number.endsWith(".")){
                number = number.replace(".","");
                System.out.println(number + " Code: 3");
                Maintext.setText(number);
            }
            else if (number.length() == 1) {
                number = "0";
                System.out.println(number + " Code: 1");
                Maintext.setText(number);

            } else {
                number = removeLastDigit(number);
                System.out.println(number + " Code: 2");
                Maintext.setText(number);
            }
        }else {
            if(number2.endsWith(".")){
                number2 = number2.replace(".","");
                System.out.println(number + operation + number2 + " Code: 6");
                Maintext.setText(number + operation + number2);
            }
            else if(number2 == "0"){
                number2 = "";
                isOnTwo = false;
                System.out.println(number + " Code: 3");
                Maintext.setText(number);
            }
            else if (number2.length() == 1) {
                number2 = "0";
                System.out.println(number + operation + number2 + " Code: 4");
                Maintext.setText(number + operation + number2);
            }
            else{
                number2 = removeLastDigit(number2);
                System.out.println(number + operation + number2 + " Code: 5");
                Maintext.setText(number + operation + number2);
            }
        }
    }
    public void plus(ActionEvent e){
        operation = "+";
        if(!isOnTwo) {
            System.out.println(number + operation);
            Maintext.setText(number + operation);
        }
        else{System.out.println(number + operation + number2);
            Maintext.setText(number + operation + number2);
        }
        isOnTwo = true;
    }
    public void minus(ActionEvent e){
        isOnTwo = true;
        operation = "-";
        if(!isOnTwo) {
            System.out.println(number + operation);
            Maintext.setText(number + operation);
        }
        else{System.out.println(number + operation + number2);
            Maintext.setText(number + operation + number2);
        }
    }
    public void multiplication(ActionEvent e){
        isOnTwo = true;
        operation = "x";
        if(!isOnTwo) {
            System.out.println(number + operation);
            Maintext.setText(number + operation);
        }
        else{System.out.println(number + operation + number2);
            Maintext.setText(number + operation + number2);
        }
    }
    public void division(ActionEvent e){
        isOnTwo = true;
        operation = "/";
        if(!isOnTwo) {
            System.out.println(number + operation);
            Maintext.setText(number + operation);
        }
        else{
            System.out.println(number + operation + number2);
            Maintext.setText(number + operation + number2);
        }
    }
    public void equals(ActionEvent e){
        switch (operation){
            case "+" -> {
                result = Float.parseFloat(number) + Float.parseFloat(number2);
                break;
            }
            case "-" -> {
                result = Float.parseFloat(number) - Float.parseFloat(number2);
                break;
            }
            case "x" -> {
                result = Float.parseFloat(number) * Float.parseFloat(number2);
                break;
            }
            case "/" -> {
                result = Float.parseFloat(number) / Float.parseFloat(number2);
                break;
            }
            case "" ->{
                break;
            }
        }
        if(!(operation == "")){
            System.out.println(result);
            if (operation == "/") {
                if (Float.parseFloat(number) % Float.parseFloat(number2) == 0) {
                    resultInt = (int) result;
                    Maintext.setText(String.valueOf(resultInt));
                    number = String.valueOf(resultInt);
                    System.out.println("Case 2");
                } else {
                    Maintext.setText(String.valueOf(result));
                    number = String.valueOf(result);
                    System.out.println("Case 4");
                }
            } else if (!number.contains(".") && !number2.contains(".")) {
                resultInt = (int) result;
                Maintext.setText(String.valueOf(resultInt));
                number = String.valueOf(resultInt);
                System.out.println("Case 1");
            } else {
                Maintext.setText(String.valueOf(result));
                number = String.valueOf(result);
                System.out.println("Case 3");
            }

            isOnTwo = false;
            number2 = "0";
        }else{
            System.out.println("Operation empty");
        }
    }
    public void clear(ActionEvent e){
        number = "0";
        number2 = "0";
        isOnTwo = false;
        System.out.println("Cleared");
        Maintext.setText(number);
    }
    public void clearEntry(ActionEvent e){
        if(!isOnTwo){
            number = "0";
            System.out.println("Cleared");
            Maintext.setText(number);
        }else{
            number2 = "0";
            System.out.println("Cleared");
            Maintext.setText(number + operation + number2);
        }
    }
    public void negate(ActionEvent e){
        if(!isOnTwo){
            if(number.contains(".")){
                number = String.valueOf(Float.parseFloat(number) * -1);
                Maintext.setText(number);
            }else{
                number = String.valueOf(Integer.parseInt(number) * -1);
                Maintext.setText(number);
            }
        }else{
            if(number2.contains(".")){
                number2 = String.valueOf(Float.parseFloat(number2) * -1);
                Maintext.setText(number2);
            }else{
                number2 = String.valueOf(Integer.parseInt(number2) * -1);
                Maintext.setText(number2);
            }
        }
    }
    public static String removeLastDigit(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        // Check if the last character is a digit
        char lastChar = s.charAt(s.length() - 1);
        if (Character.isDigit(lastChar)) {
            // If it's a digit, return the substring excluding the last character
            return s.substring(0, s.length() - 1);
        } else {
            // If it's not a digit, return the original string
            return s;
        }
    }

}